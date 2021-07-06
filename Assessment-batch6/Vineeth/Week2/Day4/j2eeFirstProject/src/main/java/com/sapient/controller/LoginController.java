package com.sapient.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.StudentDao;
import com.sapient.dao.UserDao;
import com.sapient.to.Student;
import com.sapient.to.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private StudentDao studentDao = new StudentDao();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		
		String page = request.getParameter("page");
		
		if(page.contains("login")) {
			try {
				User user = new User();
				user.setId(request.getParameter("id"));
				user.setPassword(request.getParameter("password"));
				
				UserDao userDao = new UserDao();
				userDao.getUser(user);
				
				if(user.getStatus().equals("admin")) {
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					request.getSession().setAttribute("tab", "dashboard");
				}
				else {
					requestDispatcher = request.getRequestDispatcher("User.jsp");
				}
				
				request.getSession().setAttribute("user", user);
				requestDispatcher.forward(request, response);
			}
			catch(Exception e) {
				requestDispatcher = request.getRequestDispatcher("Login.jsp");
				request.getSession().setAttribute("message", e.getMessage());
				requestDispatcher.forward(request, response);
			}
		}
		else if(page.contains("admin")) {
			try {
				String tab = "";
				if(request.getParameter("tab") != null)
					tab = request.getParameter("tab").toLowerCase();
				
				switch(tab) {
					case "displaystudents":	request.getSession().setAttribute("students", studentDao.getAllStudents());
											requestDispatcher = request.getRequestDispatcher("Admin.jsp");
											request.getSession().setAttribute("tab", "displaystudents");
											break;
					case "addstudentform":	requestDispatcher = request.getRequestDispatcher("Admin.jsp");
											request.getSession().setAttribute("tab", "addstudentform");
											break;
					case "addstudent":		Student student = new Student(request.getParameter("id"), request.getParameter("fname"), request.getParameter("lname"), request.getParameter("dob"), request.getParameter("area"));
											if(studentDao.saveStudent(student)) {
												requestDispatcher = request.getRequestDispatcher("Admin.jsp");
												request.getSession().setAttribute("tab", "dashboard");
												request.getSession().setAttribute("message", "Student successfully added!");
											}
											else {
												requestDispatcher = request.getRequestDispatcher("Admin.jsp");
												request.getSession().setAttribute("tab", "addstudentform");
												request.getSession().setAttribute("message", "Student could not be added!");					
											}
											break;
					default:				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
											request.getSession().setAttribute("tab", "dashboard");
				}
				
				requestDispatcher.forward(request, response);
			}
			catch(Exception e) {
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				request.setAttribute("message", e.getMessage());
				requestDispatcher.forward(request, response);
			}
		}
	}

}
