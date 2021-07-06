package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/Customer")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		RequestDispatcher requestDispatcher = null;

		try {

			HttpSession httpSession = request.getSession();

			if (httpSession.getAttribute("customer") == null) {
				
				request.setAttribute("loggedIn", false);
				requestDispatcher = request
						.getRequestDispatcher("Login.jsp?redirect=/FunnyGrill/Customer");
				requestDispatcher.forward(request, response);

			} else {
				
				request.setAttribute("loggedIn", true);
				requestDispatcher = request.getRequestDispatcher("Customer.jsp");
				requestDispatcher.forward(request, response);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.getWriter().append(e.getMessage() + "Error at: ").append(request.getContextPath());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("button")!=null) {
			String val = request.getParameter("button").toString(); 
			if(val.equals("Logout")) {
				
				HttpSession httpSession = request.getSession();
				httpSession.invalidate();
				
				request.setAttribute("loggedIn", false);
				response.sendRedirect("/FunnyGrill/Welcome");
				
			}
			
		}else {
			doGet(request, response);
		}
	}

}
