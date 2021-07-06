package com.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.BookingDao;
import com.dao.StudentDao;
import com.dao.UserDao;
import com.to.User;

/**
 * Servlet implementation class CLoginController
 */
public class CLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CLoginController() {
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
		
		RequestDispatcher requestDispatcher=null;
		
		try {
			String s1 = request.getParameter("h1");
			if (s1.equals("Login")) {
				
			User user = new User(request.getParameter("userid"), request.getParameter("password"), null);

			UserDao userDao = new UserDao();

			userDao.getUser(user);

			if (user.getStatus().equals("admin")) {
				requestDispatcher = request.getRequestDispatcher("Booking.jsp");
			}

			else {
				requestDispatcher = request.getRequestDispatcher("User.jsp");
			}

			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", user);
			requestDispatcher.forward(request, response);
			
		}
			else if(s1.equals("Booking")) {
				String time = request.getParameter("time");
				BookingDao bookingDao = new BookingDao();
				String check="hhdh";
				System.out.println(check);
				check=bookingDao.check(time);
				System.out.println(check);
				if (check!=null) {
					requestDispatcher = request.getRequestDispatcher("Status.jsp");
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("user", "");
					requestDispatcher.forward(request, response);
					
				}
				else {
					requestDispatcher = request.getRequestDispatcher("Booking.jsp");
					String message="So sorry all our tables are reserved at the time you entered.Pls book the table at any other time";
					request.setAttribute("message", message);
					requestDispatcher.forward(request, response);
				}
			}
			
		}
		catch(Exception e) {
			
		}

	}

}
