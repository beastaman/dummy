package com.sapient.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.*;
import com.sapient.entity.*;
import com.sapient.to.*;

/**
 * Servlet implementation class ConfirmationController
 */

public class ConfirmationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConfirmationController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("Confirmation ");

		String tableBooking = null;
		String onlineBooking = null;
		RequestDispatcher rd = null;

		if (request.getParameter("confirmTableBooking") != null) {
			tableBooking = request.getParameter("confirmTableBooking").toString();
		}

		if (request.getParameter("confirmOnlineBooking") != null) {
			onlineBooking = request.getParameter("confirmOnlineBooking").toString();
		}

		try {

//			System.out.println("table booking : " + tableBooking);
//			System.out.println("Online booking : " + onlineBooking);
			User user = (User) request.getSession().getAttribute("user");

			if (tableBooking != null) {
				// table booking

//				System.out.println(user);

				Table table = (Table) request.getSession().getAttribute("table");
//				System.out.println(table);

				ConfirmTableDao confirmTableDao = new ConfirmTableDao();

				UserTable userTable = new UserTable(user.getUserId(), table.getTid());

				confirmTableDao.insert(userTable);

				rd = request.getRequestDispatcher("OrderDetails.jsp");

				rd.forward(request, response);

			}

			else {

//				 Online booking
//				System.out.println("Confirmation Controller: Online booking ");
				Map<String, String[]> itemsMap = (Map) request.getSession().getAttribute("orderSummary");
				ConfirmOnlineDao confirmTableDao = new ConfirmOnlineDao();

				for (String key : itemsMap.keySet()) {
//					System.out.println("Line 91:" + key + " : " + Arrays.toString(itemsMap.get(key)));
					UserItem item = new UserItem(user.getUserId(), key, itemsMap.get(key)[1]);
//					System.out.println(item);
					confirmTableDao.insert(item);
				}

				rd = request.getRequestDispatcher("OrderDetails.jsp");
				rd.forward(request, response);

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
