package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestdispatcher = null;
		
		try {
			User user = new User(request.getParameter("userid"), request.getParameter("password"), null);
			System.out.println(user.getUserid());
			UserDAO userdao = new UserDAO();
			userdao.getUser(user);
			
			if(user.getStatus().equals("admin")) {
				requestdispatcher = request.getRequestDispatcher("Admin.jsp");
			}
			else {
				requestdispatcher = request.getRequestDispatcher("User.jsp");
			}
			
			HttpSession httpsession = request.getSession();
			
			httpsession.setAttribute("user", user);
			
			requestdispatcher.forward(request, response);
			
		}
		catch( Exception e) {
			requestdispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message",e.getMessage());
			requestdispatcher.forward(request, response);
		}
	}

}
