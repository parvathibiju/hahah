package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.SignUp;

public class LoginDAO {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "Parvathi";

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

	public static void getUser(String uname, String password) {
		String loginSQL = "SELECT * FROM connectamrita.signup WHERE uname = '" + uname + "' AND passwd = '" + password
				+ "'";
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(loginSQL);) {
			ResultSet rs = preparedStatement.executeQuery();
			rs.next();
			SignUp.user = new SignUp(rs.getString("fname"), rs.getString("lname"), rs.getString("uname"),
					rs.getString("email_id"), rs.getString("phone"), rs.getString("dob"), rs.getString("bio"),
					rs.getString("passwd"));
			
			System.out.println(rs.getString("bio"));
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	private static void printSQLException(SQLException ex) {
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
