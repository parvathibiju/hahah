package servlets;
import model.EventCreation;
import java.util.*;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DashboardFetchDAO;


/**
 * Servlet implementation class DashboardFetchServlet
 */
@WebServlet(name = "DashboardFetchServlet" , urlPatterns = "/dash")
public class DashboardFetchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		ArrayList<EventCreation> listEvent =  (ArrayList<EventCreation>) DashboardFetchDAO.selectALLEvents();
		 RequestDispatcher rd =  request.getRequestDispatcher("/biju/P_dashboard.jsp"); 
		request.setAttribute("listEvent", listEvent);
		rd.forward(request , response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
