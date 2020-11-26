package servlets;
import dao.RegisterDao;
import model.Member;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet(name ="Register" ,urlPatterns="/reg")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterDao dao=new RegisterDao();
		try {

            List<Member> listCategory = dao.list();
            request.setAttribute("listCategory", listCategory);
            RequestDispatcher dispatcher = request.getRequestDispatcher("sanjana/register/memberRegister.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tempo = request.getParameter("eventname");
		System.out.println("%s"+tempo);
		String  temp[] = tempo.split("\\|\\|");
		for(int i=0;i<temp.length;++i)
		{
			System.out.println(i +" "+ temp[i]);
		}
		int event_id=Integer.parseInt(temp[1]);
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String eventname=temp[0];
		System.out.println("%s"+eventname);
		request.setAttribute("eventname", temp[0]);
		
//		doGet(request, response);
		
		Member member=new Member(event_id, fname,lname,email,phone,eventname);
		RegisterDao rDao=new RegisterDao();
		rDao.insert(member);
		response.sendRedirect("http://localhost:8080/ncp-proj-trial-1/dash");

		
	}

}
