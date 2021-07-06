package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.*;
//import com.dao.UserDao;
//import com.dao.UserDao;
import com.to.*;

/**
 * Servlet implementation class LogController
 */
public class LogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogController() {
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
		// TODO Auto-generated method stub
		RequestDispatcher requestDispatcher = null;
		try {
			String s1 = request.getParameter("h1");
			if(s1.equals("Login")) {
				User user = new User(request.getParameter("userid"), request.getParameter("password"));
				CustomerDao customerDao = new CustomerDao();
				Customer customer = new Customer();
				customer = 	customerDao.getCustomer(user);
				requestDispatcher = request.getRequestDispatcher("Avail.jsp");
				HttpSession httpSession = request.getSession();
				//httpSession.setAttribute("user", user);
				httpSession.setAttribute("customer", customer);
				requestDispatcher.forward(request, response);
			}
			else if(s1.equals("Home")) {
				int choice = Integer.parseInt(request.getParameter("choice"));
				if(choice==1) {
					BranchDao branchDao = new BranchDao();
					request.setAttribute("branchs", branchDao.getAllBranch());
					requestDispatcher = request.getRequestDispatcher("Avail.jsp");
					requestDispatcher.forward(request, response);
				}
				else if(choice==2) {
					TableDao tableDao = new TableDao();
					request.setAttribute("tables", tableDao.getAvailableTable());
					requestDispatcher = request.getRequestDispatcher("Avail.jsp");
					requestDispatcher.forward(request, response);
				}
				else if(choice==3) {
					request.setAttribute("choice", 100);
					requestDispatcher = request.getRequestDispatcher("Avail.jsp");
					requestDispatcher.forward(request, response);
				}
				else if(choice==4) {
					request.setAttribute("choice", 102);
					requestDispatcher = request.getRequestDispatcher("Avail.jsp");
					requestDispatcher.forward(request, response);
				}
			}
			else if(s1.equals("TableOrder")) {

				OrderDao orderDao = new OrderDao();

				Order order = new Order(request.getParameter("cid"), request.getParameter("bname"),
						request.getParameter("tableid"),"012");

				orderDao.insertTableOrder(order);

				request.setAttribute("message", "Table Order Received");
				requestDispatcher = request.getRequestDispatcher("Avail.jsp");
				requestDispatcher.forward(request, response);
			}
			else if(s1.equals("ParcelOrder")) {

				OrderDao orderDao = new OrderDao();

				Order order = new Order(request.getParameter("cid"), request.getParameter("bname"),
						null,"012");

				orderDao.insertParcelOrder(order);

				request.setAttribute("message", "Parcel Order Received");
				requestDispatcher = request.getRequestDispatcher("Avail.jsp");
				requestDispatcher.forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			requestDispatcher = request.getRequestDispatcher("LogFile.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
			
		}
	}

}
