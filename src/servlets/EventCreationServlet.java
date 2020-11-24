package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EventCreationDAO;
import model.EventCreation;

/**
 * Servlet implementation class EventCreationServlet
 */
@WebServlet(name ="EventCreationServlet", urlPatterns ="/home")
public class EventCreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EventCreationDAO eventCreationDAO;

	public void init() {
		eventCreationDAO = new EventCreationDAO();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("./index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String action = request.getServletPath();
//
//		try {
//			switch (action) {
//			case "/index":
//				showHomepage(request,response);
//				break;
//				
//			case "/createEvent":
//				createEventform(request, response);
//				break;
//			case "/inserEvent":
//				insertEvent(request, response);
//				break;
////			case "/deleteEvent":
////				deleteEvent(request, response);
////				break;
//			case "/fetchEvent":
//				fetchEvent(request, response);
//				break;
////			case "/updateEvent":
////				updateEvent(request, response);
////				break;
//			}
//		} catch (SQLException ex) {
//			throw new ServletException(ex);
//		}
//	}
//	
//	private void showDash(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("./biju/P_dashboard.jsp");
//		dispatcher.forward(request, response);
//	}
//	
//	private void showHomepage(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	private void createEventform(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("biju/P_create_event.jsp");
//		dispatcher.forward(request, response);
//	}
//
//	
//
//	private void insertEvent(HttpServletRequest request, HttpServletResponse response) 
//			throws SQLException, IOException {
//		int cid = Integer.parseInt(request.getParameter("cid"));
//		String event_name = request.getParameter("name");
//		String even_loc = request.getParameter("email");
//		String event_category = request.getParameter("event_category");
//		String event_reg_enddate = request.getParameter("event_regenddate");
//		String event_date_time = request.getParameter("event_date_time");
//		String event_desc = request.getParameter("event_desc");
//		String event_link = request.getParameter("event_link");
//		int max_count = Integer.parseInt(request.getParameter("max_count"));
//		EventCreation newEvent = new EventCreation(cid,event_name, even_loc, event_category,event_reg_enddate,
//											event_date_time, event_desc,event_link,max_count);
//		eventCreationDAO.insertEvent(newEvent);
//		response.sendRedirect("list");
//	}
//	
//	private void fetchEvent(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		List<EventCreation> listEvent =  eventCreationDAO.selectALLEvents();
//		request.setAttribute("listEvent", listEvent);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
//		dispatcher.forward(request, response);
//	}
//
//
//
////	private void deleteEvent(HttpServletRequest request, HttpServletResponse response) 
////			throws SQLException, IOException {
////		String event_name = request.getParameter("name");
////		String even_loc = request.getParameter("email");
////		String event_date_time = request.getParameter("event_date_time");
////		EventCreationDAO.deleteEvent(event_name,event_date_time);
////		response.sendRedirect("list");
////
////	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		doGet(request, response);
//	}
//
//}
