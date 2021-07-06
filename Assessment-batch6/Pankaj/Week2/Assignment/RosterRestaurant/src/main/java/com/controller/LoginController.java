package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.BranchDAO;
import com.dao.CustomerDAO;
import com.dao.ItemDAO;
import com.to.Customer;

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
		String h1 = request.getParameter("h1");
		if (h1.equals("Login")) {
			Customer customer = new Customer(request.getParameter("customer_id"), null, null, null,
					request.getParameter("password"));
			CustomerDAO customerDAO = new CustomerDAO();
			try {
				customer = customerDAO.getCustomer(customer);
				BranchDAO branchDAO = new BranchDAO();
				request.setAttribute("branches", branchDAO.getAllBranches());
				ItemDAO itemDAO = new ItemDAO();
				request.setAttribute("items", itemDAO.getAllItems());
				requestDispatcher = request.getRequestDispatcher("index.jsp");
				requestDispatcher.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				requestDispatcher = request.getRequestDispatcher("login.jsp");
				request.setAttribute("message", e.getMessage());
				requestDispatcher.forward(request, response);
			}
		} // if
	}// f

}// c
