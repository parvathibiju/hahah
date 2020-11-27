package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SignUp;

public class SignUpDAO {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "Parvathi";

	private SignUpDAO signUpDAO;
	private static final String INSERT_USER = "INSERT INTO connectamrita.signup"
			+ " (fname, lname, uname, email_id, phone, dob, bio, passwd) VALUES " + "(?, ?, ?, ?, ?, ?, ?, ?);";

	public void init() {
		signUpDAO = new SignUpDAO();
	}

	protected static Connection getConnection() {
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

	public void createUser(SignUp user) throws SQLException {
		System.out.println(INSERT_USER);
		// try-with-resource statement will auto close the connection
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
			preparedStatement.setString(1, user.getFname());
			preparedStatement.setString(2, user.getLname());
			preparedStatement.setString(3, user.getUname());
			preparedStatement.setString(4, user.getEmail_id());
			preparedStatement.setString(5, user.getPhone());
			preparedStatement.setString(6, user.getDob());
			preparedStatement.setString(7, user.getBio());
			preparedStatement.setString(8, user.getPassword());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	private void printSQLException(SQLException ex) {
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
