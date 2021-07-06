package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BranchDao;
import com.dao.CustomerDao;
import com.to.BranchTO;
import com.to.CustomerTO;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Welcome")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WelcomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;

		try {

			HttpSession httpSession = request.getSession();

			if (httpSession.getAttribute("customer") != null) {

				request.setAttribute("loggedIn", true);

			} else {

				request.setAttribute("loggedIn", false);

			}

			BranchDao branchDao = new BranchDao();
			List<BranchTO> branches = branchDao.getAllBranches();

			request.setAttribute("branches", branches);

			requestDispatcher = request.getRequestDispatcher("Welcome.jsp");
			requestDispatcher.forward(request, response);

		} catch (Exception e) {

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;

		String s1 = request.getParameter("h1");

		try {

			if (s1.equals("login")) {

				String email = request.getParameter("email");
				String password = request.getParameter("password");

				CustomerDao customerDao = new CustomerDao();

				CustomerTO customer = customerDao
						.getCustomer(new CustomerTO(-1, email, password, null, null, null, -1));

				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("customer", customer);
				request.setAttribute("loggedIn", true);
				if (request.getParameter("redirect") != null) {
					response.sendRedirect(request.getParameter("redirect"));
				} else {
					response.sendRedirect("/FunnyGrill/Welcome");
				}

			} else if (s1.equals("signup")) {

				CustomerDao customerDao = new CustomerDao();

				CustomerTO customer = new CustomerTO(-1, request.getParameter("email"),
						request.getParameter("password"), request.getParameter("fname"), request.getParameter("lname"),
						request.getParameter("phone"), 1);

				customerDao.saveCustomer(customer);

				request.setAttribute("message", "New FunnyGrill Account Successfully Created!!! Please Log In");
				request.setAttribute("loggedIn", false);
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
				requestDispatcher.forward(request, response);

			}

		} catch (Exception e) {

			request.setAttribute("message", "Error: " + e.getMessage());
			request.setAttribute("loggedIn", false);
			if (request.getParameter("redirect") != null) {
				requestDispatcher = request
						.getRequestDispatcher("Login.jsp?redirect=" + request.getParameter("redirect"));
			} else {
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
			}

			requestDispatcher.forward(request, response);

		}

	}

}
