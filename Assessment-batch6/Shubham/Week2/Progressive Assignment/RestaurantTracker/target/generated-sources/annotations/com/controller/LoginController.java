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

import com.dao.FoodItemsDao;
import com.dao.OrdersDao;
import com.dao.ReservationDao;
import com.dao.UserDao;
import com.mongodb.DBObject;
import com.to.FoodItems;
import com.to.Orders;
import com.to.User;

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
			String s1 = request.getParameter("page");
			System.out.println(s1);
			if (s1.equals("Login")) { 
				String option = request.getParameter("button");
				if(option.equals("Login"))
				{
				User user= UserDao.getUser( request.getParameter("username") , request.getParameter("password"));
				requestDispatcher = request.getRequestDispatcher("User.jsp");
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("user", user);
				requestDispatcher.forward(request, response);
				}
				else if(option.equals("SignUp"))
				{
					requestDispatcher = request.getRequestDispatcher("SignUp.jsp");
					requestDispatcher.forward(request, response);
				}
			}
			else if(s1.equals("SignUp"))
			{
				UserDao userDao = new UserDao();

				User user = new User(request.getParameter("username"), request.getParameter("password"), request.getParameter("fname"),
						request.getParameter("lname"), request.getParameter("phoneNo"));

				userDao.insertStudent(user);
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
				requestDispatcher.forward(request, response);
			}
			else if(s1.equals("Selection"))
			{
				String option = request.getParameter("option");
				String branch = request.getParameter("branch");
				if(option.equals("Dine-In"))
				{
					requestDispatcher = request.getRequestDispatcher("Booking.jsp");
					HttpSession httpSession = request.getSession();
//					httpSession.setAttribute("option", option);
					httpSession.setAttribute("branch", branch);
					requestDispatcher.forward(request, response);
				}
				else if(option.equals("Pickup"))
				{
					requestDispatcher = request.getRequestDispatcher("Order.jsp");
					List<FoodItems> fooditems= FoodItemsDao.getAllFoodItems();
					request.setAttribute("fooditems", fooditems);
					HttpSession httpSession = request.getSession();
//					httpSession.setAttribute("option", option);
					httpSession.setAttribute("branch", branch);
					requestDispatcher.forward(request, response);
				}
			}
			else if(s1.equals("Order"))
			{
				int total=0;
				List<FoodItems> fooditems= FoodItemsDao.getAllFoodItems();
				List<Integer> quantity=new ArrayList<>();
				System.out.println("Before loop");
				for(int i=0;i<fooditems.size();i++)
				{
					String para=Integer.toString(i);
					String q=(String)request.getParameter(para);
					
					int qty=Integer.parseInt(q);
					System.out.println("Inside Loop");
					String p=fooditems.get(i).getPrice();
					int price=Integer.parseInt(p);
					total=total+price*qty;
					quantity.add(qty);
					
				}
				if(total==0)
				{
					requestDispatcher = request.getRequestDispatcher("Order.jsp");
				}
				else
				{
					requestDispatcher = request.getRequestDispatcher("FinalOrder.jsp");
					request.setAttribute("quantity", quantity);
					request.setAttribute("fooditems", fooditems);
					request.setAttribute("total", total);
					HttpSession httpSession = request.getSession();
					httpSession.setAttribute("quantity", quantity);
				}
				requestDispatcher.forward(request, response);
			}
			else if(s1.equals("FinalOrder"))
			{
				requestDispatcher = request.getRequestDispatcher("OrderPlaced.jsp");
				HttpSession httpSession = request.getSession();
				User user=(User)httpSession.getAttribute("user");
				List<FoodItems> fooditems= FoodItemsDao.getAllFoodItems();
				List<Integer> quantity=(List<Integer>)httpSession.getAttribute("quantity");
				
				List<List<String>> bill=new ArrayList<>();
				for(int i=0;i<fooditems.size();i++)
				{
					System.out.println("Inside Final Orders");
					if(quantity.get(i)==0) continue;
					List<String> temp= new ArrayList<String>();
					temp.add(fooditems.get(i).getName());
					
					temp.add(Integer.toString(quantity.get(i)));
					
					bill.add(temp);
				}
				Object billno=OrdersDao.addEntry(new Orders(user.getUsername(),user.getFname(),user.getLname(),user.getPhoneno(),bill,"Preparing"));
				request.setAttribute("status","Preparing");
				httpSession.setAttribute("billno", billno);
				requestDispatcher.forward(request, response);
			}
			else if(s1.equals("OrderPlaced"))
			{
				requestDispatcher = request.getRequestDispatcher("OrderPlaced.jsp");
				HttpSession httpSession = request.getSession();
				Object billno=(Object)httpSession.getAttribute("billno");
				String status=OrdersDao.getStatus(billno);
				request.setAttribute("status",status);
				requestDispatcher.forward(request, response);
			}
			else if(s1.equals("Booking"))
			{
				String button = request.getParameter("sub");
				{
					if(button.equals("Search"))
					{
						String date = request.getParameter("date");
						String guests = request.getParameter("guests");
						HttpSession httpSession = request.getSession();
						String branch=(String)httpSession.getAttribute("branch");
						List<String> slots=ReservationDao.getSlots(branch,date,guests);
						
						requestDispatcher = request.getRequestDispatcher("Booking.jsp");
						httpSession.setAttribute("slots", slots);
						httpSession.setAttribute("guests",guests);
						httpSession.setAttribute("date",date);
						requestDispatcher.forward(request, response);
					}
					else if(button.equals("BOOK"))
					{
						HttpSession httpSession = request.getSession();
						String date = (String)httpSession.getAttribute("date");
						String guests = (String)httpSession.getAttribute("guests");
						User user = (User)httpSession.getAttribute("user");
						String branch = (String)httpSession.getAttribute("branch");
						String slot = (String)request.getParameter("chooseslot");
						if(slot.equals(null))
						{
							throw new Exception("Please Select Slot");
						}
						httpSession.setAttribute("slot",slot);
						requestDispatcher = request.getRequestDispatcher("Receipt.jsp");
						requestDispatcher.forward(request, response);
						ReservationDao.bookSlot(branch,date,slot,guests,user.getUsername());
					}
				}
				
			}
		}catch (Exception e) {
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}

}
