package trial;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class fetch_events {
    public static void main (String[] args) {
        createXMLForHackathons();
    }

    private static void createXMLForHackathons() {
        try
        {
        	Connection c = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com/sql2371323", "sql2371323", "mN2*lY8*");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select cname,events_.event_name,event_loc as event_category ,event_category as event_loc,event_reg_enddate,event_date_time,event_desc \n"
            		+ "from events_ \n"
            		+ "left join club on club.cid = events_.cid");
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            // HACKATHONS - Root element
            Element rootElement = doc.createElement("events");#hackathons
            doc.appendChild(rootElement);

            // Creating XML Doc from the query result
            while(rs.next()){
                Element each_event = doc.createElement("each_event");

                Element event_name = doc.createElement("event_name");
                event_name.setTextContent(rs.getString("event_name"));
                each_event.appendChild(event_name);

                Element event_loc = doc.createElement("event_loc");
                event_loc.setTextContent(rs.getString("event_loc"));
                each_event.appendChild(event_loc);

                Element event_category = doc.createElement("event_category");
                event_category.setTextContent(rs.getString("event_category"));
                each_event.appendChild(event_category);

                Element event_reg_enddate = doc.createElement("event_reg_enddate-on");
                event_reg_enddate.setTextContent(rs.getDateTime("event_reg_enddate_ON"));
                each_event.appendChild(event_reg_enddate);

                Element event_date_time = doc.createElement("event_date_time-on");
                event_date_time.setTextContent(rs.getString("event_date_time"));
                each_event.appendChild(event_date_time);

                Element event_desc = doc.createElement("event_desc");
                event_desc.setTextContent(rs.getString("LOCATION"));
                each_event.appendChild(event_desc);

                rootElement.appendChild(each_event);
            }

            // Write the content into XML file
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/Users/parvathi/Documents/7th sem/NCP/NCP_project/connectAmrita/biju/xml_files/fetch_events.xml"));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // Beautify the format of the resulted XML
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.transform(source, result);
            System.out.println("/Users/parvathi/Documents/7th sem/NCP/NCP_project/connectAmrita/biju/xml_files");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }


}
