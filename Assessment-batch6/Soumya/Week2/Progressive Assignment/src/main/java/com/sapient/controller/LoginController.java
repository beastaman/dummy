package com.sapient.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sapient.dao.BranchDAO;
import com.sapient.dao.UserDAO;
import com.sapient.entity.Branch;
import com.sapient.entity.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;

		try {

			UserDAO dao = new UserDAO();

			User user = new User(null, null, null, request.getParameter("email"), request.getParameter("password"));
			dao.getUserDetails(user);

			if (user.getUserId() != null) {
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("user", user);
				requestDispatcher = request.getRequestDispatcher("Branch.jsp");
			}
			request.setAttribute("user", user);

			BranchDAO branchDao = new BranchDAO();
			List<Branch> branches = branchDao.getAllBranch();

			request.setAttribute("branch", branches);
			requestDispatcher.forward(request, response);

		} catch (Exception e) {

			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);

		}
	}

}
