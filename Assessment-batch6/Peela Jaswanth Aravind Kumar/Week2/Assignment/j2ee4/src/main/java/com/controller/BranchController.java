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
public class BranchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BranchController() {
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
			String s2 = request.getParameter("branchId");
			
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("branchId", s2);
			BranchDao bd = new BranchDao();
			List<Table> orders = bd.getAllOrders(s2);		
			httpSession.setAttribute("orders", orders);
			
			requestDispatcher = request.getRequestDispatcher("branch.jsp");	
			requestDispatcher.forward(request, response);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
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