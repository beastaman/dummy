package com.sapient.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.UserDao;
import com.sapient.dto.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDao userDao = new UserDao();
	
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

		String path = "login";
		if(request.getParameter("path") != null)
			path = request.getParameter("path").toLowerCase();
		
		switch(path) {
		case "login":
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			break;
		case "signup":
			request.getRequestDispatcher("SignUp.jsp").forward(request, response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		
		try {
			User user = new User();
			user.setEmail(request.getParameter("email"));
			user.setPassword(request.getParameter("password"));
			
			userDao.getUser(user);

			request.setAttribute("user", user);
			request.getRequestDispatcher("BranchController").forward(request, response);
		}
		catch(Exception e) {
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}

}
