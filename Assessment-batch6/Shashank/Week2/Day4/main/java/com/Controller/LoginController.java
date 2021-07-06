package com.Controller;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher requestDispatcher = null;
		System.out.println("inside Controller");
		try {
			
			String s1 = request.getParameter("h1");
			
			
			if(s1.equals("Login"))
			{		
					// get parameter reutrns the field from form with name as user id and userpassword
			User user = new User( request.getParameter("uid") , request.getParameter("pass") , null );
			
			UserDao userDao = new UserDao();
			
			userDao.getUser(user);
			
			if(user.getStatus().equals("admin")) {
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			}	
			
			else {
				requestDispatcher = request.getRequestDispatcher("User.jsp");
			}
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", user);
			requestDispatcher.forward(request, response);
		}
			
		else if(s1.equals("Home")) {
			
			int choice = Integer.parseInt(request.getParameter("choice"));
			
			if(choice==1) {
				StudentDao studentDao = new StudentDao();
				
				request.setAttribute("students", studentDao.getAllStudent());
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);
				
			}
			else if(choice==2) {
				StudentDao studentDao = new StudentDao();
				
				request.setAttribute("choice", 100);
				
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);
				
				
			}
			
		}
			
		else if(s1.equals("3")) {
			System.out.println("inside 3");
			StudentDao studentDao = new StudentDao();
			System.out.println("DAo object created");
			Student student = new Student(request.getParameter("sid") , request.getParameter("fname") , request.getParameter("lname") , request.getParameter("dob") , request.getParameter("area"));
			
			studentDao.insertStudent(student);
			

			System.out.println("called insert Student");
			
			request.setAttribute("message", "Record Inserted");
			requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			requestDispatcher.forward(request, response);
			
		}
		
			
		} catch (Exception e) {
			
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
			
		}
	}

}
