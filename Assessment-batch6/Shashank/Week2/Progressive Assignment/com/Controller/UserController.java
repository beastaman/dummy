package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BranchDao;
import com.dao.UserDao;
import com.to.User;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher requestDispatcher = null;
		try {
			String s1 = request.getParameter("h");
			
			if(s1.equals("Home")) {
				int choice = Integer.parseInt(request.getParameter("choice"));
				UserDao Dao = new UserDao();
				User currentUser =null;
				currentUser = (User) request.getAttribute("user");
				System.out.println("got user "+ currentUser.getUserid());
				if(choice==1) {
					
					
					request.setAttribute("tables", Dao.bookedTable(currentUser.getUserid()));
					requestDispatcher = request.getRequestDispatcher("User.jsp");
					requestDispatcher.forward(request, response);
				}
				else if(choice==2) {
					
					
					request.setAttribute("services", Dao.bookedService(currentUser.getUserid()));
					requestDispatcher = request.getRequestDispatcher("User.jsp");
					requestDispatcher.forward(request, response);
					
				}
			}
			
			
		}
		
		
		catch (Exception e) {
			System.out.println("inside catch");
			
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
			
		}
	}

}
