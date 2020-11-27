package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SignUpDAO;
import model.SignUp;

/**
 * Servlet implementation class SignUpServelets
 */
@WebServlet("/signup")
public class SignUpServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SignUpDAO signUpDao = new SignUpDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpServelet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher =  request.getRequestDispatcher("/nithesh/signup.jsp");
		dispatcher.forward(request , response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String uname = request.getParameter("uname");
		String email_id = request.getParameter("email_id");
		String phone = "0";
		String dob = request.getParameter("dob");
		String bio = " ";
		String passwd = request.getParameter("passwd");

		SignUp user = new SignUp(fname, lname, uname, email_id, phone, dob, bio, passwd);
		
		try {
			signUpDao.createUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("nithesh/login.jsp");

	}

}
