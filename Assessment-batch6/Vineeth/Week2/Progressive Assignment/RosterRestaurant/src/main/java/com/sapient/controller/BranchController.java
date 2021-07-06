package com.sapient.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.BranchDao;
import com.sapient.dao.UserDao;
import com.sapient.dto.Branch;
import com.sapient.dto.Reservation;
import com.sapient.dto.ReservationDetails;
import com.sapient.dto.Table;
import com.sapient.dto.User;

/**
 * Servlet implementation class BranchController
 */
public class BranchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private static BranchDao branchDao = new BranchDao();
	private UserDao userDao = new UserDao();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BranchController() {
    	
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = "";
		if(request.getAttribute("path") != null)
			path = ((String) request.getAttribute("path")).toLowerCase();
		else if(request.getParameter("path") != null)
			path = request.getParameter("path").toLowerCase();

		System.out.println("Get Path : " + path);

		switch(path) {
		case "branch":
			try {
				if(request.getSession().getAttribute("user") == null) {
					request.setAttribute("path", "login");
					request.getRequestDispatcher("Login.jsp").forward(request, response);
					return;
				}
				int branchId = Integer.parseInt(request.getParameter("branchId"));
				Branch branch = branchDao.getBranchById(branchId);
				if(branch == null)
					response.sendRedirect("BranchController");
				request.setAttribute("branch", branch);
				System.out.println("User : " + request.getSession().getAttribute("user"));
				request.getRequestDispatcher("Reservations.jsp").forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case "reservations":
			try {
				int branchId = Integer.parseInt(request.getParameter("branchId"));
				Branch branch = branchDao.getBranchById(branchId);
				if(branch == null) {
					response.sendRedirect("BranchController");
					return;
				}
				request.setAttribute("branch", branch);
				String dateString = request.getParameter("date");
				Date date = Date.valueOf(dateString);
				request.setAttribute("date", date);
				List<Table> tables = branchDao.getReservations(branchId, date);
				request.setAttribute("tables", tables);
				request.getRequestDispatcher("Reservations.jsp").forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;			
		case "reservation":
			try {
				int tableId = Integer.parseInt(request.getParameter("tableId"));
				Table table = branchDao.getTableById(tableId);
				if(table == null) {
					response.sendRedirect("BranchController");
					return;
				}
				Branch branch = branchDao.getBranchById(table.getBranchId());
				String date = request.getParameter("date");
				String timeRange = request.getParameter("timeRange");
				String message = request.getParameter("message");
				request.setAttribute("branch", branch);
				request.setAttribute("table", table);
				request.setAttribute("date", date);
				request.setAttribute("timeRange", timeRange);
				if(message != null)
					request.setAttribute("message", message);
				request.getRequestDispatcher("ReserveTable.jsp").forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case "myreservations":
			try {
				User user = (User) request.getSession().getAttribute("user");
				if(user == null) {
					request.getRequestDispatcher("Login.jsp").forward(request, response);
					return;
				}
				int userId = user.getId();
				List<ReservationDetails> reservations = branchDao.getReservationsOfUser(userId);
				reservations.forEach(System.out::println);
				request.setAttribute("reservations", reservations);
				request.getRequestDispatcher("MyReservations.jsp").forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case "login":
			request.setAttribute("path", "login");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			break;
		case "signup":
			request.setAttribute("path", "signup");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			break;
		default :
			try {
				List<Branch> branchList = branchDao.getAllBranch();
				request.setAttribute("branchList", branchList);
				request.getRequestDispatcher("Home.jsp").forward(request, response);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String path = "";
		if(request.getAttribute("path") != null)
			path = ((String) request.getAttribute("path")).toLowerCase();
		else if(request.getParameter("path") != null)
			path = request.getParameter("path").toLowerCase();

		System.out.println("Post Path : " + path);
		
		switch(path) {
		case "reservation":
			try {
				User user = (User) request.getSession().getAttribute("user");
				if(user == null) {
					request.getRequestDispatcher("Login.jsp").forward(request, response);
					return;
				}
				int userId = user.getId();
				int tableId = Integer.parseInt(request.getParameter("tableId"));
				Table table = branchDao.getTableById(tableId);
				if(table == null) {
					response.sendRedirect("BranchController");
					return;
				}
				String date = request.getParameter("date");
				String timeRange = request.getParameter("timeRange");
				String startTimeString = request.getParameter("startTime");
				String endTimeString = request.getParameter("endTime");
				String message = validateReservation(date, timeRange, startTimeString, endTimeString);
				if(message != null) {
//					request.getRequestDispatcher("BranchController?path=" + path + "&tableId=" + tableId + "&date=" + date + "&timeRange=" + timeRange + "&messsage=" + message)..forward(request, response);
					Branch branch = branchDao.getBranchById(table.getBranchId());
					request.setAttribute("branch", branch);
					request.setAttribute("table", table);
					request.setAttribute("date", date);
					request.setAttribute("timeRange", timeRange);
					request.setAttribute("message", message);
					request.getRequestDispatcher("ReserveTable.jsp").forward(request, response);
					return;
				}
				Reservation reservation = branchDao.saveReservation(getReservation(tableId, userId, date, startTimeString, endTimeString));
				if(reservation != null) {
					request.setAttribute("path", "MyReservations");
					request.getRequestDispatcher("BranchController").forward(request, response);
				}
				else
					response.sendRedirect("BranchController");
			} catch(Exception e) {
				e.printStackTrace();
			}
			break;
		case "login":
			try {
				User user = new User();
				user.setEmail(request.getParameter("email"));
				user.setPassword(request.getParameter("password"));
				
				user = userDao.getUser(user);

				request.setAttribute("path", "home");
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("BranchController").forward(request, response);
			}
			catch(Exception e) {
				request.setAttribute("path", "login");
				request.setAttribute("message", e.getMessage());
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			break;
		case "signup":
			try {
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				String confirmPassword = request.getParameter("comfirm-password");
				String fname = request.getParameter("fname");
				String lname = request.getParameter("lname");
				String phone = request.getParameter("phone");
				
				if(!password.equals(confirmPassword))
					throw new Exception("Passwords do not match");
				
				if(!validatePassword(password))
					throw new Exception("Password must be atleast 8 characters long");
				
				User user = new User(0, email, password, fname, lname, phone);
				user = userDao.saveUser(user);
				
				if(user == null)
					throw new Exception("Could not create User");

				request.setAttribute("path", "home");
				request.getSession().setAttribute("user", user);
				request.getRequestDispatcher("BranchController").forward(request, response);
			}
			catch(Exception e) {
				request.setAttribute("path", "signup");
				request.setAttribute("message", e.getMessage());
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
			break;
		default :
			doGet(request, response);
		}
	}

	private String validateReservation(String date, String timeRange, String startTimeString, String endTimeString) {

		String[] time = timeRange.split("-");
		Timestamp minStartTime = Timestamp.valueOf(date + " " + time[0] + ":00");
		Timestamp maxEndTime = Timestamp.valueOf(date + " " + time[1] + ":00");
		Timestamp startTime = Timestamp.valueOf(date + " " + startTimeString + ":00");
		Timestamp endTime = Timestamp.valueOf(date + " " + endTimeString + ":00");

		if(startTime.before(minStartTime))
			return "Start Time should be atleast " + time[0];
		if(endTime.after(maxEndTime))
			return "End Time should be atmost " + time[1];
		if(startTime.after(endTime))
			return "End Time should be after Start Time";
		
		return null;
	}

	private Reservation getReservation(int tableId, int userId, String date, String startTimeString, String endTimeString) {
		
		Timestamp startTime = Timestamp.valueOf(date + " " + startTimeString + ":00");
		Timestamp endTime = Timestamp.valueOf(date + " " + endTimeString + ":00");
		Long duration = (endTime.getTime() - startTime.getTime())/(60*1000);
		Reservation reservation = new Reservation(0, tableId, userId, startTime, duration.intValue());
		
		return reservation;
	}

	private boolean validatePassword(String password) {
		
		return password.length() >= 8;
	}

}
