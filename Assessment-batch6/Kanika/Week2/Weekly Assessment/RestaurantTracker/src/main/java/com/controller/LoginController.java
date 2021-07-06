package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BranchDao;
import com.dao.CustomerDao;
import com.dao.TableDao;
import com.to.Branch;
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
			/*String s2 = request.getParameter("h2");
			if(s2.equals("showtable")) {
				TableDao tableDao = new TableDao();
				
				request.setAttribute("tables", tableDao.getTable());
				
				requestDispatcher = request.getRequestDispatcher("User.jsp");
				requestDispatcher.forward(request, response);
				
			}*/

			if (s1.equals("Login")) {

				Customer customer = new Customer(null,null,null,request.getParameter("email"), request.getParameter("password"));

				CustomerDao customerDao = new CustomerDao();

				customerDao.getCustomer(customer);

				requestDispatcher = request.getRequestDispatcher("User.jsp");

				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("customer", customer);
				requestDispatcher.forward(request, response);
			}

			else if (s1.equals("Create")) {

					CustomerDao customerDao = new CustomerDao();

					request.setAttribute("choice", 100);

					requestDispatcher = request.getRequestDispatcher("Login.jsp");
					requestDispatcher.forward(request, response);

				}

			
			
			else if(s1.equals("3")) {

				CustomerDao customerDao = new CustomerDao();

				Customer customer = new Customer(request.getParameter("customerName"), request.getParameter("customerNumber"),
						request.getParameter("customerAddress"), request.getParameter("email"), request.getParameter("password"));

				customerDao.insertCustomer(customer);

				request.setAttribute("message", "Record inserted");
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
				requestDispatcher.forward(request, response);

			
			}
			else if(s1.equals("ShowBranch")) {
				BranchDao branchDao = new BranchDao();
				
				
				request.setAttribute("branches", branchDao.getBranch());
				
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
				requestDispatcher.forward(request, response);
			}
			
			
			
			

		} catch (Exception e) {

			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);

		}

	}
	}


