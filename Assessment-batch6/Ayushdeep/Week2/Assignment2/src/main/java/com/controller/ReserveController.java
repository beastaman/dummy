package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TableDao;

/**
 * Servlet implementation class ReserveController
 */
public class ReserveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReserveController() {
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

			String s3 = request.getParameter("h3");
			if(s3.equals("reservetable")) {
				TableDao tableDao = new TableDao();
				
				request.setAttribute("reserve", tableDao.getReservation());
				
				requestDispatcher = request.getRequestDispatcher("User.jsp");
				requestDispatcher.forward(request, response);
				
			}
			
	}
		catch (Exception e) {

			requestDispatcher = request.getRequestDispatcher("User.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);

		}
	}

}
