package com.sapient.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.*;
import com.sapient.entity.*;

/**
 * Servlet implementation class ItemController
 */
public class ItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ItemController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String option = null;
		String bookorpick = null;

		
		if (request.getParameter("option") != null) {
			option = request.getParameter("option").toString();
		}

		if (request.getParameter("bookorpick") != null) {
			bookorpick = request.getParameter("bookorpick").toString();
		}
//		System.out.println("Inside get : with option : " + option + " | bookorpick : " + bookorpick);

		RequestDispatcher rd = null;
		try {


			if (option != null && option.equals("Book Table")) {
//				System.out.println("Inside Book table with option : " + option);

				TableDao tableDao = new TableDao();
				List<Table> tables = tableDao.getAllTables();

				request.setAttribute("tables", tables);
				request.setAttribute("orderType", "Book Table");
				rd = request.getRequestDispatcher("Item1.jsp");
				rd.forward(request, response);

			}

			else if (option != null && option.equals("Pickup")) {

//				System.out.println("Inside pickup with option : " + option);
				ItemDao itemDao = new ItemDao();
				List<Item> items = itemDao.getAllItem();

				request.setAttribute("items", items);
				request.setAttribute("orderType", "Pickup");
				rd = request.getRequestDispatcher("Item1.jsp");
				rd.forward(request, response);

			}
			
			else if (bookorpick != null && bookorpick.equals("book")) {
				
//				System.out.println("Line 107 : Inside book with bookorpick  : " + bookorpick);

				String bookedTable = request.getParameter("btnradio").trim();
//				System.out.println("radio button :" + bookedTable);
				
				TableDao dao = new TableDao();
				Table table = dao.getPriceById(bookedTable);
//				System.out.println("table : " + table);
				rd = request.getRequestDispatcher("BillSummary.jsp");
				
				request.getSession().setAttribute("table", table);
				
				rd.forward(request, response);
			}

			else if (bookorpick != null && bookorpick.equals("pick")) {
				String order = "";
				System.out.println("Inside pick with bookorpick  : " + bookorpick);

				Map<String, String[]> params = request.getParameterMap();
				int totalPrice = 0;
				Map<String , String[]> itemsQuantity = new HashMap<>();
				
				ItemDao dao = new ItemDao();
				
				for(String key : params.keySet()) {
					if(key.startsWith("quantity_")) {
						String id = key.split("_")[1];
						int qty = Integer.parseInt(params.get(key)[0]);
						
						if(qty == 0) {
							continue;
						}
						
						Item item = dao.getItemById(id);
						
						totalPrice += qty * Integer.parseInt(item.getPrice());
						
						itemsQuantity.put(id, new String[] {item.getName() ,Integer.toString(qty) ,Integer.toString(qty * Integer.parseInt(item.getPrice()))});
						//fname , fqty, fprice
						
					}
				}
				rd = request.getRequestDispatcher("BillSummary.jsp");

				request.getSession().setAttribute("orderSummary", itemsQuantity);
				request.getSession().setAttribute("totalPrice", totalPrice);
				
				
				rd.forward(request, response);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
