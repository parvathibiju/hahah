package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.EventCreation;
public class EventCreationDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/connectamrita";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Parvathi";

	private static final String INSERT_EVENT = "INSERT INTO events" + "  (cid, event_name, event_loc, event_category,event_regenddate,event_datetime,event_desc,event_link,max_count) VALUES "
			+ " (?, ?, ?,?, ?, ?,?, ?, ?);";
	private static final String SELECT_ALL_EVENTS = "SELECT * from events_";
//	private static final String SELCET_EVENT_BY_CLUB = "select event_name,event_loc,event_category,event_desc,event_link from users where event_ =?";
//	private static final String SELECT_MAX_COUNT = "select max_count from events_";
	//update event-date,loc
	//delete event
	
	public EventCreationDAO() {
		
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public void insertEvent(EventCreation user) throws SQLException {
		System.out.println(INSERT_EVENT);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EVENT)) {
			preparedStatement.setInt(1, user.getCid());
			preparedStatement.setString(2, user.getEvent_loc());
			preparedStatement.setString(3, user.getEvent_category());
			preparedStatement.setString(4, user.getEvent_reg_enddate());
			preparedStatement.setString(5, user.getEvent_date_time());
			preparedStatement.setString(6, user.getEvent_desc());
			preparedStatement.setString(7, user.getEvent_link());
			preparedStatement.setString(8, user.getEvent_date_time());
			preparedStatement.setInt(9, user.getMax_count());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} 
		catch (SQLException e) {
			printSQLException(e);
		}
	}
	
	public  List<EventCreation> selectALLEvents() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<EventCreation> events = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EVENTS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int cid = rs.getInt("cid");
				String event_name = rs.getString("event_name");
				String event_loc = rs.getString("event_loc");
				String event_category = rs.getString("event_category");
				String event_reg_enddate = rs.getString("event_reg_enddate");
				String event_date_time = rs.getString("event_date_time");
				String event_desc = rs.getString("event_desc");
				String event_link = rs.getString("event_link");
				 int max_count = rs.getInt("max_count");
				events.add(new EventCreation( cid,  event_name,  event_loc,  event_category,  event_reg_enddate,
						 event_date_time,  event_desc,  event_link,  max_count));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return events;
	}
		
		private void printSQLException (SQLException ex) {
			for (Throwable e : ex) {
				if (e instanceof SQLException) {
					e.printStackTrace(System.err);
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
					System.err.println("Message: " + e.getMessage());
					Throwable t = ex.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();
					}
				}
			}
		}
	
}
