package com.sapient.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.UserDao;
import com.sapient.to.User;

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
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		
		try {
			User user = new User();
			user.setId(request.getParameter("id"));
			user.setPassword(request.getParameter("password"));
			
			UserDao userDao = new UserDao();
			userDao.getUser(user);
			
			if(user.getStatus().equals("admin")) {
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			}
			else {
				requestDispatcher = request.getRequestDispatcher("User.jsp");
			}
			
			request.getSession().setAttribute("user", user);
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}

}
