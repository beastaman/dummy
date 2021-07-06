package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.StudentDao;
import com.dao.UserDao;
import com.to.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		RequestDispatcher requestDispatcher = null;
		requestDispatcher = request.getRequestDispatcher("Login.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = null;
		
		try {
			
			String sq = request.getParameter("h1");
			
			if(sq.equals("Login")) {
				User user = new User(request.getParameter("userId"), request.getParameter("password"), null );
				
				UserDao userDao = new UserDao();
				
				userDao.getUser(user);
				
				
				
				if(user.getStatus().equals("admin")) {
					
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					
				}
				else {
					
					requestDispatcher = request.getRequestDispatcher("User.jsp");
					
				}
				
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("user", user);
				
				requestDispatcher.forward(request, response);
			}
			
			else if (sq.equals("Home")) {
				
				int choice = Integer.parseInt(request.getParameter("choice"));
				
				if(choice == 1) {
					
					StudentDao studentDao = new StudentDao();
					
					request.setAttribute("students", studentDao.getAllStudent());
					
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					
					requestDispatcher.forward(request, response);
					
				}
				else if(choice==2) {
					
					request.setAttribute("choice", 100);
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					
					requestDispatcher.forward(request, response);
				}
				
				
			}
			else if(sq.equals("3")) {
				
				
				
			}
			
			
			
			
			
			
			
			
		}
		catch (Exception e) {
			
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			
			request.setAttribute("message", e.getMessage());
			
			requestDispatcher.forward(request, response);
			
		}
		
		
	}

}
