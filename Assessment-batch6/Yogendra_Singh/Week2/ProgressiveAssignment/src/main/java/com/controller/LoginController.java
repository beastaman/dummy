package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDAO;
import com.to.Customer;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		try {
			String s1=request.getParameter("login");
			if(s1.equals("Login"))
			{
				Customer customer= new Customer(0, request.getParameter("email"), request.getParameter("password"),
								null, null, null, null );
				CustomerDAO customerDAO = new CustomerDAO();
				customer=customerDAO.getCustomerByEmail(customer.getEmail());
				if(customer.getPassword().equals( request.getParameter("password")))
				{
					requestDispatcher = request.getRequestDispatcher("Home.jsp");
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("customer",customer);
				}
				else
				{
					requestDispatcher = request.getRequestDispatcher("Login.jsp");
					request.setAttribute("msg","Username or Password Incorrect !! ");
				}
				requestDispatcher.forward(request, response);
			}
				
		} catch (Exception e) {
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("msg",e.getMessage());
			requestDispatcher.forward(request, response);
		}
		doGet(request, response);
	}

}
