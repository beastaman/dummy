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

import com.logic.ServiceTracking;
import com.to.CustomerTO;

/**
 * Servlet implementation class ServiceController
 */
@WebServlet("/tracking")
public class ServiceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceController() {
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
						.getRequestDispatcher("Login.jsp?redirect=/FunnyGrill/tracking");
				requestDispatcher.forward(request, response);

			} else {
				request.setAttribute("loggedIn", true);
				requestDispatcher = request.getRequestDispatcher("Tracking.jsp");
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
		
		RequestDispatcher requestDispatcher = null;

		try {

			HttpSession httpSession = request.getSession();

			if (httpSession.getAttribute("customer") == null) {
				request.setAttribute("loggedIn", false);
				requestDispatcher = request
						.getRequestDispatcher("Login.jsp?redirect=/FunnyGrill/tracking");
				requestDispatcher.forward(request, response);

			} else {
				
				CustomerTO customer = (CustomerTO) httpSession.getAttribute("customer");
				
				String trackChoice = request.getParameter("trackChoice").toString();
				ServiceTracking serviceTracking = new ServiceTracking();
				
				
				if(trackChoice.equals("Track Table Reserve")) {
					
					List<String[]> recentTableHistory = serviceTracking.getTableTracking(customer);
					
					request.setAttribute("tableHistory", recentTableHistory);
					request.setAttribute("loggedIn", true);
					request.setAttribute("trackChoice", 1);
					requestDispatcher = request.getRequestDispatcher("Tracking.jsp");
					requestDispatcher.forward(request, response);
					
				}
				else if(trackChoice.equals("Track Parcel Order")) {
					
					List<String[]> recentParcelHistory = serviceTracking.getParcelTracking(customer);
					
					request.setAttribute("parcelHistory", recentParcelHistory);
					request.setAttribute("loggedIn", true);
					request.setAttribute("trackChoice", 2);
					requestDispatcher = request.getRequestDispatcher("Tracking.jsp");
					requestDispatcher.forward(request, response);
				}
				
				
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			response.getWriter().append(e.getMessage() + "Error at: ").append(request.getContextPath());
		}
		
		
	}

}
