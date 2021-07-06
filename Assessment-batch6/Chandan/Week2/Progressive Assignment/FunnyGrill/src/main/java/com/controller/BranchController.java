package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BranchDao;
import com.dao.FoodDao;
import com.logic.OrderingService;
import com.to.BranchTO;
import com.to.CustomerTO;
import com.to.FoodItemTO;
import com.to.ParcelOrderTO;
import com.to.TableReserveTO;
import com.to.TimeSlotsTO;

/**
 * Servlet implementation class Branch
 */
@WebServlet("/Branch")
public class BranchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BranchController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("id") == null) {
			return;
		}

		String branchId = request.getParameter("id");

		RequestDispatcher requestDispatcher = null;

		try {

			HttpSession httpSession = request.getSession();

			if (httpSession.getAttribute("customer") == null) {
				
				request.setAttribute("loggedIn", false);
				requestDispatcher = request
						.getRequestDispatcher("Login.jsp?redirect=/FunnyGrill/Branch?id=" + branchId);
				requestDispatcher.forward(request, response);

			} else {

				BranchDao branchDao = new BranchDao();
				BranchTO branch = branchDao.getBranch(Integer.parseInt(branchId));
				
				request.setAttribute("loggedIn", true);
				request.setAttribute("branch", branch);
				requestDispatcher = request.getRequestDispatcher("BranchHome.jsp?id=" + branchId);
				requestDispatcher.forward(request, response);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.getWriter().append(e.getMessage() + "Error at: ").append(request.getContextPath());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher = null;

		String branchId = request.getParameter("branchId");

		try {

			HttpSession httpSession = request.getSession();

			if (httpSession.getAttribute("customer") == null) {
				
				request.setAttribute("loggedIn", false);
				requestDispatcher = request
						.getRequestDispatcher("Login.jsp?redirect=/FunnyGrill/Branch?id=" + branchId);
				requestDispatcher.forward(request, response);

			} else {

				BranchDao branchDao = new BranchDao();
				BranchTO branch = branchDao.getBranch(Integer.parseInt(branchId));
				request.setAttribute("branch", branch);

				int step = Integer.parseInt(request.getParameter("step").toString());

				if (step == 1) {

					String orderType = request.getParameter("orderType").toString();

					if (orderType.equals("Book Table")) {

						List<TimeSlotsTO> timeSlots = branchDao.getTimeSlots();

						request.setAttribute("timeSlots", timeSlots);
						request.setAttribute("orderType", 1);

					} else if (orderType.equals("Order Parcel")) {

						List<FoodItemTO> foodItems = branchDao.getFoodItems(branch);

						request.setAttribute("foodItems", foodItems);
						request.setAttribute("orderType", 2);

					}
					
					request.setAttribute("loggedIn", true);
					requestDispatcher = request.getRequestDispatcher("BranchHome.jsp?id=" + branchId);
					requestDispatcher.forward(request, response);

				} else if (step == 2) {

					OrderingService orderingService = new OrderingService();

					String option = request.getParameter("option");

					if (option.equals("Order Parcel")) {

						List<FoodItemTO> foodItems = new ArrayList<>();
						List<Integer> quantities = new ArrayList<>();

						Map<String, String[]> params = request.getParameterMap();
						for (String key : params.keySet()) {
							if (key.startsWith("quantity_")) {

								int qty = Integer.parseInt(params.get(key)[0]);
								if (qty > 0) {
									int foodId = Integer.parseInt(key.split("_")[1]);
									FoodDao foodDao = new FoodDao();
									foodItems.add(foodDao.getFoodItemTO(foodId));
									quantities.add(qty);
								}

							}
						}

						ParcelOrderTO parcelOrderTO = new ParcelOrderTO(-1,
								((CustomerTO) httpSession.getAttribute("customer")).getId(), branch.getId(),
								null);

						orderingService.placeParcelOrder(parcelOrderTO, foodItems, quantities);
						
						request.setAttribute("loggedIn", true);
						
						response.sendRedirect("/FunnyGrill/tracking");
						

					} else if (option.equals("Book Table")) {

						String date = request.getParameter("dateTable").toString();
						int slotId = Integer.parseInt(request.getParameter("slot").toString());

						TableReserveTO tableReserveTO = new TableReserveTO(-1,
								((CustomerTO) httpSession.getAttribute("customer")).getId(), branch.getId(), slotId,
								null, date.replace("-", "/"));

						orderingService.bookTable(tableReserveTO);
						
						response.sendRedirect("/FunnyGrill/tracking");
						
					}

				}

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			response.getWriter().append(e.getMessage() + "Error at: ").append(request.getContextPath());
		}

	}

}
