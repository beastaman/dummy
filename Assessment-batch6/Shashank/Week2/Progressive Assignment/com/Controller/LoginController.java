package com.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.*;

import com.to.*;


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
		System.out.println("inside Controller");
		try {
			System.out.println("inside try");
			
			String s1 = request.getParameter("h1");
			System.out.println("got parameter " + s1);
			
			User user=null;
			if(s1.equals("Login"))
			{		
				System.out.println("inside login");
					// get parameter reutrns the field from form with name as user id and userpassword
			 user= new User( request.getParameter("uid") , request.getParameter("pass") , null );
			
			UserDao userDao = new UserDao();
			
			user = userDao.getUser(user);
			System.out.println("user created");
			
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
			//System.out.println("Home "+ user.getUserid());
			
			int choice = Integer.parseInt(request.getParameter("choice"));
			
			if(choice==1) {
				CustomerDao Dao = new CustomerDao();
				
				request.setAttribute("customers", Dao.getAllCustomer());
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);
				
			}
			else if(choice%2==0) {
				//CustomerDao Dao = new CustomerDao();
				
				request.setAttribute("choice", choice);
				
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);
				
				
			}
			
			if(choice==3) {
				BranchDao Dao = new BranchDao();
				
				request.setAttribute("branches", Dao.getAllBranch());
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);
				
			}
			
			if(choice==5) {
				TablesDao Dao = new TablesDao();
				
				request.setAttribute("tables", Dao.getAllTables());
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);
				
			}
			
			if(choice==7) {
				ServiceDao Dao = new ServiceDao();
				
				request.setAttribute("services", Dao.getAllService());
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
				requestDispatcher.forward(request, response);
				
			}
			
			
			
		}
			
		else if(s1.equals("2")) {
			System.out.println("inside 2");
			CustomerDao Dao = new CustomerDao();
			System.out.println("DAo object created");
			Customer customer = new Customer(request.getParameter("cid") , request.getParameter("fname") , request.getParameter("lname") , request.getParameter("phone") , request.getParameter("area"));
			
			Dao.insertCustomer(customer);
			

			System.out.println("called insert Customer");
			
			request.setAttribute("message", "Customer Record Inserted");
			requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			requestDispatcher.forward(request, response);
			
		}
		
		else if(s1.equals("4")) {
			System.out.println("inside 4");
			BranchDao Dao = new BranchDao();
			System.out.println("DAo object created");
			Branch NEW = new Branch(request.getParameter("bid") , request.getParameter("bmanager") ,  request.getParameter("phone") , request.getParameter("area"));
			
			Dao.insertBranch(NEW);
			

			System.out.println("called insert Branch");
			
			request.setAttribute("message", "Branch Record Inserted");
			requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			requestDispatcher.forward(request, response);
			
		}
			
		else if(s1.equals("6")) {
			System.out.println("inside 6");
			TablesDao Dao = new TablesDao();
			System.out.println("DAo object created");
			Tables NEW = new Tables(request.getParameter("tid") , request.getParameter("bid") ,  request.getParameter("booked") , request.getParameter("status"));
			
			Dao.insertTables(NEW);
			

			System.out.println("called insert Tables");
			
			request.setAttribute("message", "Tables Record Inserted");
			requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			requestDispatcher.forward(request, response);
			
		}
			
			
		else if(s1.equals("8")) {
			System.out.println("inside 8");
			ServiceDao Dao = new ServiceDao();
			System.out.println("DAo object created");
			Service NEW = new Service(request.getParameter("sid") , request.getParameter("bid") ,  request.getParameter("booked") , request.getParameter("status"));
			
			Dao.insertService(NEW);
			

			System.out.println("called insert Service");
			
			request.setAttribute("message", "Service Record Inserted");
			requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			requestDispatcher.forward(request, response);
			
		}
			
		} catch (Exception e) {
			System.out.println("inside catch");
			
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
			
		}
	}

}
