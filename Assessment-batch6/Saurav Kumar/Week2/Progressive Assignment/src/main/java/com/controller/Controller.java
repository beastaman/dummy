package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.constant.Constant;
import com.dao.BranchDao;
import com.dao.DeliveryDao;
import com.dao.ItemDao;
import com.dao.OrderDao;
import com.dao.ReservationDao;
import com.dao.UserDao;
import com.to.Branch;
import com.to.Delivery;
import com.to.Item;
import com.to.Order;
import com.to.Reservation;
import com.to.User;

import java.util.*;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
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
		RequestDispatcher requestDispatcher = null;
		
		try {
			String s = request.getParameter("page");
			
			HttpSession httpSession = request.getSession();
			
			if(s.equals("welcome")) {
				String choice = request.getParameter("choice");
				
				if(choice.equals("Sign in")) {
					requestDispatcher = request.getRequestDispatcher("Signin.jsp");
				}
				else {
					requestDispatcher = request.getRequestDispatcher("Signup.jsp");
				}
				
				requestDispatcher.forward(request, response);
			}
			else if(s.equals("signin")) {
				User user = new User(request.getParameter("userid"), null, null, null, 
						request.getParameter("password"));
				
				UserDao userDao = new UserDao();
				userDao.getUser(user);
				
				requestDispatcher = request.getRequestDispatcher("home.jsp");
				
				httpSession.setAttribute("user", user);
				
				requestDispatcher.forward(request, response);
			}
			else if(s.equals("signup")) {
				User user = new User(request.getParameter("userid"), 
						request.getParameter("fname"), 
						request.getParameter("lname"), 
						request.getParameter("phone"), 
						request.getParameter("password"));
				
				UserDao userDao = new UserDao();
				userDao.insertData(user);
				
				requestDispatcher = request.getRequestDispatcher("home.jsp");
		
				httpSession.setAttribute("user", user);
				
				requestDispatcher.forward(request, response);
			}
			else if(s.equals("home")) {
				
				BranchDao branchDao = new BranchDao();
				Branch branch = branchDao.getBranch(request.getParameter("branch"));
				
				ItemDao itemDao = new ItemDao();
				
				request.setAttribute("branch", branch);
				request.setAttribute("items", itemDao.getAllItems());
				requestDispatcher = request.getRequestDispatcher("booking.jsp");
				
				requestDispatcher.forward(request, response);
			}
			else if(s.equals("booking")) {
				
				BranchDao branchDao = new BranchDao();
				Branch branch = branchDao.getBranch(request.getParameter("branch"));
				
				ItemDao itemDao = new ItemDao();
				List<Item> items = itemDao.getAllItems();
				
				httpSession.setAttribute("branch", branch);
				
				request.setAttribute("branch", branch);
				request.setAttribute("items", itemDao.getAllItems());
				
				String choice = request.getParameter("choice");
				
				httpSession.setAttribute("choice", choice);
				
				if(choice.equals("Book Table")) {
					
					requestDispatcher = request.getRequestDispatcher("tablebooking.jsp");
					
					requestDispatcher.forward(request, response);
				}
				else {
					
					requestDispatcher = request.getRequestDispatcher("delivery.jsp");
					
					requestDispatcher.forward(request, response);
				}
			
			}
			else if(s.equals("tablebooking")) {
				
				int tables = (int)Integer.parseInt(request.getParameter("table"));
				BranchDao branchDao = new BranchDao();
				Branch branch = branchDao.getBranch(request.getParameter("branch"));
				
				if(branch.getAvailable() < tables) {
					String message = tables + " tables are not available";
					request.setAttribute("message", message);
					request.setAttribute("branch", branch);
					requestDispatcher = request.getRequestDispatcher("tablebooking.jsp");
					
					requestDispatcher.forward(request, response);
				}
				else {
					// Booking of tables is successfull
					// So, reduce number of tables available
					User user = (User) httpSession.getAttribute("user");
					
					ReservationDao reservationDao = new ReservationDao();
					
					Reservation reservation = new Reservation("u10", branch.getBid(), tables, "");
					
					reservationDao.insertData(reservation);
					
					branchDao.updateBranch(branch.getBid(), branch.getAvailable()-tables);
					
					requestDispatcher = request.getRequestDispatcher("Thankyou.jsp");
					
					requestDispatcher.forward(request, response);
				}
				
			}
			else if(s.equals("delivery")) {
				int totalPrice = 0;
				
				BranchDao branchDao = new BranchDao();
				Branch branch = branchDao.getBranch(request.getParameter("branch"));
				
				ItemDao itemDao = new ItemDao();
				List<Item> items = itemDao.getAllItems();
				
				for(Item item:items) {
					totalPrice = totalPrice + item.getPrice()*(int)Integer.parseInt(request.getParameter(item.getName()));
				}
			
				httpSession.setAttribute("totalprice", totalPrice);
//				request.setAttribute("totalprice", totalPrice);
				requestDispatcher = request.getRequestDispatcher("confirmation.jsp");
				
				requestDispatcher.forward(request, response);
			}
			else if(s.equals("confirmation")) {
				// add record in delivery table and orderstatus table
				// add check status table on thankyou page
				
				User user = (User) httpSession.getAttribute("user");
				
				Branch branch = (Branch) httpSession.getAttribute("branch");
				
				Random rand = new Random();
				String orderid = user.getUserid() + String.valueOf(rand.nextInt(1000)) + 
									String.valueOf(rand.nextInt(1000));
				
				Delivery delivery = new Delivery(orderid, user.getUserid(), branch.getBid(), null);
				
				int totalprice = Integer.parseInt(httpSession.getAttribute("totalprice").toString());
				
				String status = "Your food is being prepared";
				
				Order order = new Order(orderid, status, totalprice);
				
				new OrderDao().insertData(order);
				
				new DeliveryDao().insertData(delivery);
				
				httpSession.setAttribute("order", order);
				
				requestDispatcher = request.getRequestDispatcher("Thankyou.jsp");
				
				requestDispatcher.forward(request, response);
			}
			else if(s.equals("status")) {
				
				requestDispatcher = request.getRequestDispatcher("status.jsp");
				
				requestDispatcher.forward(request, response);
			}
			else if(s.equals("thankyou")) {
				
				requestDispatcher = request.getRequestDispatcher("home.jsp");
				
				requestDispatcher.forward(request, response);
			}
			
			
		} catch (Exception e) {
			requestDispatcher = request.getRequestDispatcher("ErrorPage.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}

}















