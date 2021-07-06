package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		HttpSession session = request.getSession();
		try {
			User user = new User(request.getParameter("userid"), request.getParameter("password"), null);
			UserDao dao = new UserDao();

			dao.getUser(user);

			

			if (user.getStatus().equals("admin")) {
				dispatcher = request.getRequestDispatcher("Admin.jsp");
			}
			else
				dispatcher = request.getRequestDispatcher("User.jsp");
			
			//HttpSession session = request.getSession();
			session.setAttribute("user", user);
			dispatcher.forward(request, response);
			

		} catch (Exception e) {
		
			dispatcher = request.getRequestDispatcher("Login.jsp");
			session.setAttribute("msg", e.getMessage());
			dispatcher.forward(request, response);
			
		}
		

	}

}
