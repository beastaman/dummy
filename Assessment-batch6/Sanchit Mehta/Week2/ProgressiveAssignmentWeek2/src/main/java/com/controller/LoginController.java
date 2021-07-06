package com.controller;
import com.dao.UserDao;

import java.io.IOException;

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
  
		    String cid = request.getParameter("cid");
	        String firstname = request.getParameter("firstname");
	        String lastname = request.getParameter("lastname");
	        String phoneNo = request.getParameter("phoneNo");
	        String city = request.getParameter("city");
	        String dob = request.getParameter("dob");
	        String password= request.getParameter("password");
            CustomerDao customerDao= new CustomerDao();
	        Customer customer = new Customer(cid, firstname, lastname, phoneNo, city, dob, password);
	        
	        try {
	            customerDao.insertCustomer(customer);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("CustomerDetails.jsp");
	    
	}

}
