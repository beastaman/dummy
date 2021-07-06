package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.BookingDao;
import com.dao.StudentDao;
import com.dao.TableDao;
import com.dao.UserDao;
import com.to.Booking;
import com.to.Table;
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
			TableDao tableDao=new TableDao();
			List<Table> tables=tableDao.getAllTable();
			httpSession.setAttribute("table", tables);
			requestDispatcher.forward(request, response);
			
		}
			else if(s1.equals("Booking")) {
				String time = request.getParameter("time");
				String branchid=request.getParameter("branchid");
				String userid=request.getParameter("userid");
				BookingDao bookingDao = new BookingDao();
				String tableid=bookingDao.check(time);
				System.out.println(time+" "+branchid+" "+userid+" "+tableid);
				if (tableid!=null) {
					bookingDao.insertBooking(branchid,tableid,userid,time);
					Integer orderid=bookingDao.getOrderid(branchid,tableid,userid,time);
					Booking booking=new Booking(orderid,branchid,tableid,userid,time);
					requestDispatcher = request.getRequestDispatcher("Status.jsp");
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("booking", booking);
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
			requestDispatcher = request.getRequestDispatcher("CLogin.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}

	}

}
