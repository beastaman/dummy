package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.StudentDao;
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
	@Override
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
			User user = new User(request.getParameter("userid"), request.getParameter("password"), null);

			UserDao userdao = new UserDao();

			userdao.getStudent(user);

			String s1 = request.getParameter("h1");
			if (s1.equals("Login")) {
				if (user.getStatus().equals("admin")) {
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				} else {
					requestDispatcher = request.getRequestDispatcher("User.jsp");
				}
				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("user", user);
				requestDispatcher.forward(request, response);
			}
			else if (s1.equals("Home")) {

				int choice = Integer.parseInt(request.getParameter("choice"));

				if (choice == 1) {

					StudentDao studentDao = new StudentDao();

					request.setAttribute("students", studentDao.getAllStudent());

					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					requestDispatcher.forward(request, response);

				}

				else if (choice == 2) {
					// insert data
					//

					StudentDao studentDao = new StudentDao();

					request.setAttribute("choice", 100);

					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					requestDispatcher.forward(request, response);

				}

				else if (choice == 3) {
					StudentDao studentDao = new StudentDao();

					Student student = new Student(request.getParameter("sid"), request.getParameter("fname"),
							request.getParameter("lname"), request.getParameter("dob"), request.getParameter("area"),
							request.getParameter("phoneNo"));

					studentDao.insertStudent(student);

					request.setAttribute("message", "Record inserted");
					requestDispatcher = request.getRequestDispatcher("Admin.jsp");
					requestDispatcher.forward(request, response);

				}

			}
		} catch (Exception e) {
			// HttpSession httpSession=request.getSession();
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}
}
