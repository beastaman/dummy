package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.*;
import com.to.*;

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

		RequestDispatcher requestDispatcher = null;
		
		try {
			String s2 = request.getParameter("init");
			
			if(s2.equals("Login")) {
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
			}
			if(s2.equals("Signup")) {
				requestDispatcher = request.getRequestDispatcher("Signup.jsp");
			}
			
			HttpSession httpSession = request.getSession();
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {

			String s1 = request.getParameter("h1");
			

			if (s1.equals("Login")) {

				User user = new User(request.getParameter("userId"), request.getParameter("password"), null);
				
				UserDao userDao = new UserDao();
				userDao.getUser(user);

				requestDispatcher = request.getRequestDispatcher("branches.jsp");

				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("user", user);
				requestDispatcher.forward(request, response);
			}

			else if (s1.equals("Signup")) {

				UserDao userDao = new UserDao();
				
				User user = new User(request.getParameter("userId"),request.getParameter("password"),request.getParameter("status"));
				
				if(userDao.checkUser(request.getParameter("userId")) == 0) {
					userDao.addUser(user);
					request.setAttribute("message", "user added");
					requestDispatcher = request.getRequestDispatcher("Login.jsp");
				}
				else {
					request.setAttribute("message", "user already exist");
					requestDispatcher = request.getRequestDispatcher("Signup.jsp");
				}
				HttpSession httpSession = request.getSession();
//				httpSession.setAttribute("user", user);
				requestDispatcher.forward(request, response);
			}
			else if (s1.equals("branch")) {
				
				String s3 = request.getParameter("branchId");
				
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("branchId", s3);
				BranchDao bd = new BranchDao();
				List<Table> orders = bd.getAllOrders(s3);		
				httpSession.setAttribute("orders", orders);
				
				
				requestDispatcher = request.getRequestDispatcher("branch.jsp");
				requestDispatcher.forward(request, response);
			}
			

		} catch (Exception e) {

			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);

		}
		try {

			String s1 = request.getParameter("h1");
			
			if (s1.equals("book")) {
				BranchDao bo = new BranchDao();
				Table order = new Table(null,request.getParameter("branchId"),request.getParameter("tableId"),request.getParameter("startTime"),request.getParameter("endTime"),request.getParameter("userId"));
				if(bo.check(order) == 1) {
					bo.insertOrder(order);
				}
				
			}

		} catch (Exception e) {

			requestDispatcher = request.getRequestDispatcher("branches.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);

		}

	}

}