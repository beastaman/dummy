package com.sapient.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.sapient.dao.*;
import com.sapient.entity.*;

/**
 * Servlet implementation class Controller
 */

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */

	public LoginController() {
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

			UserDao dao = new UserDao();
//			System.out.println("Inside login");

			User user = new User(null, null, null, request.getParameter("email"), request.getParameter("password"));
			dao.getUser(user);

			if (user.getUserId() != null) {
				requestDispatcher = request.getRequestDispatcher("Branch.jsp");
			}
			
			request.setAttribute("user", user);
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", user);
			
//			System.out.println("After getuser");
			
			BranchDao branchDao = new BranchDao();
			List<Branch> branches = branchDao.getAllBranches();
			
			request.setAttribute("branch", branches);
			
//			branches.forEach(System.out::println);
			
			requestDispatcher.forward(request, response);

		} catch (Exception e) {

			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);

		}

	}

}
