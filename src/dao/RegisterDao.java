package dao;

import model.Member;
import servlets.Register;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class RegisterDao
{
	private String dburl="jdbc:mysql://localhost:3306/connectamrita";
	private String dbuname="root";
	private String dbpassword="Parvathi";
	private String dbdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
		try
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}

	}
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(dburl, dbuname, dbpassword);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public List<Member> list() throws SQLException {
		List<Member> listCategory = new ArrayList<>();
		loadDriver(dbdriver);
		Connection con=getConnection();
		try
		{	
			String sql = "SELECT * FROM events_  WHERE event_reg_enddate > ?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, java.time.LocalDate.now().toString());
			System.out.println("$$" + ps);
            ResultSet result = ps.executeQuery();
            
            while (result.next()) {
    
                int event_id = result.getInt("event_id");
                String event_name = result.getString("event_name");
                int current_count = result.getInt("current_count");
                int max_count = result.getInt("max_count");
                Member member = new Member(event_name,event_id);
                 if (current_count < max_count)
                	 {
                	 listCategory.add(member);
                	 
                	 }
            } 
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return listCategory;
		
	}
	
	
	
	public void insert(Member member)
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Registered Successfully"; 
		String sql="insert into event_reg(event_id,fname,lname,email,phone) values(?,?,?,?,?);";
		try
		{
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, member.getEvent_id());
			ps.setString(2, member.getFname());
			ps.setString(3, member.getLname());
			ps.setString(4, member.getEmail());
			ps.setString(5, member.getPhone());
			System.out.print(ps);

			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			result="Registration Closed";
		}
//		return result;
	}
}
