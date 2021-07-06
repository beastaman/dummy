package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.StudentDAO;
import com.dao.UserDao;
import com.to.Student;
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
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher requestDispatcher = null;
		try {
			String s1=request.getParameter("h");
			System.out.println(s1);
			if(s1.equals("Login"))
			{
				User user = new User( request.getParameter("userid"), request.getParameter("password"),null );
				UserDao userDao =  new UserDao();
				userDao.getUser(user);
				if(user.getStatus().equals("admin"))
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				else
					requestDispatcher = request.getRequestDispatcher("User.jsp");
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("user",user);
				requestDispatcher.forward(request, response);
			}
			else if(s1.equals("Home"))
			{
				System.out.println(request.getParameter("choice"));
				int choice = Integer.parseInt(request.getParameter("choice"));
				if(choice==1)
				{
					StudentDAO studentDao = new StudentDAO();
					request.setAttribute("students",studentDao.getAllStudents());
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					requestDispatcher.forward(request, response);
				}
				if (choice == 2) {
					// insert data
					request.setAttribute("choice", 100);

					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					requestDispatcher.forward(request, response);

				}
			}
			else if (s1.equals("3")) {
				StudentDAO studentDao = new StudentDAO();
				System.out.println(request.getParameter("id"));
				Student student = new Student(request.getParameter("id"), request.getParameter("fname"),
						request.getParameter("lname"), request.getParameter("dob"), request.getParameter("area"));

				studentDao.insertStudentData(student);

				request.setAttribute("message", "Record inserted");
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);

			}
				
		} catch (Exception e) {
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("msg",e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}

}
