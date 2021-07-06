package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.RestaurantDAO;
import com.dao.TableDAO;
import com.to.Restaurants;

/**
 * Servlet implementation class RestaurantController
 */
@WebServlet("/RestaurantController")
public class RestaurantController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RestaurantController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stubRequestDispatcher requestDispatcher = null;

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;
		String h1 = request.getParameter("h1");
		try {

			if (h1.equals("display")) {

				RestaurantDAO resturantdao = new RestaurantDAO();
				request.setAttribute("restaurants", resturantdao.getAllRestaurant());
				request.setAttribute("button", "1");
				requestDispatcher = request.getRequestDispatcher("Restaurant.jsp");
				requestDispatcher.forward(request, response);
			}
			else if(h1.equals("book")){
				TableDAO tabledao = new TableDAO();
				String rid = request.getParameter("rid");
				
				RestaurantDAO resturantdao = new RestaurantDAO();
				Restaurants res = resturantdao.getRestaurant(rid);
				
				request.setAttribute("tables", tabledao.getAllTables(rid));
				requestDispatcher = request.getRequestDispatcher("Tables.jsp");

				HttpSession httpSession = request.getSession();
				httpSession.setAttribute("restaurants", res);
				
				requestDispatcher.forward(request, response);
				
			}

		} catch (Exception e) {
			requestDispatcher = request.getRequestDispatcher("Restaurant.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
		}
	}

}
