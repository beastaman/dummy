package com.sapient.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.UserDAO;
import com.sapient.entity.User;

/**
 * Servlet implementation class SignupController
 */
@WebServlet(name = "SignupController", value = "/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignupController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = null;

		try {
			rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		try {

			UserDAO UserDao = new UserDAO();

			User user = new User(request.getParameter("uid"), request.getParameter("fname"),
					request.getParameter("lname"), request.getParameter("email"), request.getParameter("password"));

			UserDao.insertStudent(user);

			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", "Sign up done");
			requestDispatcher.forward(request, response);

		} catch (Exception e) {

			requestDispatcher = request.getRequestDispatcher("Signup.jsp");
			request.setAttribute("message", "wrong data");
			requestDispatcher.forward(request, response);

		}
	}

}
