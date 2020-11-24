import java.io.File;
import java.sql.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date; 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class create_event {
    public static void main(String args[]) {

        int no_of_rows = 0;

        try {
            DocumentBuilderFactory docBuilderFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder =
                    docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File("/Users/parvathi/Documents/7th sem/NCP/NCP_project/xml files/biju/events_.xml"));
            doc.getDocumentElement().normalize();
            String tablename="events_";
            NodeList customerlist = doc.getElementsByTagName("each_event");
            System.out.println(customerlist.getLength());
            Connection con = DriverManager.getConnection("jdbc:mysql://sql2.freesqldatabase.com/sql2371323", "sql2371323", "mN2*lY8*");
            System.out.println(customerlist.item(0).getTextContent());
            System.out.println(customerlist.item(1).getTextContent());
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            Statement stmt = con.createStatement();
            for (int i = 0; i < customerlist.getLength(); i++) {
                Node customer = customerlist.item(i);
                    Element customerElement = (Element) customer;
                           int cid= Integer.parseInt(customerElement.getElementsByTagName("cid").item(0).getTextContent());
                           String event_name= customerElement.getElementsByTagName("event_name").item(0).getTextContent();
                           String event_loc=customerElement.getElementsByTagName("event_loc").item(0).getTextContent();
                            String event_category=customerElement.getElementsByTagName("event_category").item(0).getTextContent();
                            String event_reg_enddate=customerElement.getElementsByTagName("event_reg_enddate").item(0).getTextContent();
                            Date event_date_time=df.parse(customerElement.getElementsByTagName("event_date_time").item(0).getTextContent());
                            String formatDateTime = df.format(event_date_time);  
                            String event_desc=customerElement.getElementsByTagName("event_desc").item(0).getTextContent();
                            String event_link= customerElement.getElementsByTagName("event_link").item(0).getTextContent();
                            String SQL_QUERY= "INSERT INTO "+tablename+ " VALUES ("+
                                    cid+",'"+
                                    event_name+"','"+
                                    event_category+"','"+
                                    event_loc+"','"+
                                    event_reg_enddate+"','"+
                                    formatDateTime+"','"+
                                    event_desc+"','"+
                                    event_link+"')";

                            System.out.println(SQL_QUERY);
                            stmt.executeUpdate(SQL_QUERY);

            }
            System.out.println("Inserted records into the table...");
        }
        catch(Exception e)
        {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
