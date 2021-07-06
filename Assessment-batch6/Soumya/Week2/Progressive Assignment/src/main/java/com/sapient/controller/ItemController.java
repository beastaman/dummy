package com.sapient.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.ItemDAO;
import com.sapient.dao.TableDAO;
import com.sapient.entity.Item;
import com.sapient.entity.Table;

/**
 * Servlet implementation class ItemController
 */
public class ItemController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ItemController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

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

		RequestDispatcher rd = null;
		try {

			if (option != null && option.equals("Book Table")) {
				TableDAO tableDao = new TableDAO();
				List<Table> tables = tableDao.getAllTables();

				request.setAttribute("tables", tables);
				request.setAttribute("orderType", "Book Table");
				rd = request.getRequestDispatcher("Item.jsp");
				rd.forward(request, response);

			}

			else if (option != null && option.equals("Pickup")) {

				System.out.println("Inside else if");
				ItemDAO itemDao = new ItemDAO();
				List<Item> items = itemDao.getAllItem();

				request.setAttribute("items", items);
				request.setAttribute("orderType", "Pickup");
				rd = request.getRequestDispatcher("Item.jsp");
				rd.forward(request, response);

			}

			else if (bookorpick != null && bookorpick.equals("book")) {

				String bookedTable = request.getParameter("btnradio");
				System.out.println("In booktable" + bookedTable);
				TableDAO dao = new TableDAO();

				Table table = dao.getTableById(bookedTable.replaceAll(" ", ""));

				rd = request.getRequestDispatcher("Confirmation.jsp");

				request.setAttribute("table", table);

				rd.forward(request, response);
			}

			else if (bookorpick != null && bookorpick.equals("pick")) {
				System.out.println("In pickup");
				String order = "";
				Map<String, String[]> params = request.getParameterMap();
				int totalPrice = 0;
				Map<String, String[]> itemsQuantity = new HashMap<>();

				ItemDAO dao = new ItemDAO();
				for (String key : params.keySet()) {
					if (key.startsWith("quantity_")) {
						String id = key.split("_")[1];
						int qty = Integer.parseInt(params.get(key)[0]);

						Item item = dao.getItemById(id);

						totalPrice += qty * Integer.parseInt(item.getPrice());

						itemsQuantity.put(id, new String[] { item.getName(), Integer.toString(qty),
								Integer.toString(qty * Integer.parseInt(item.getPrice())) });

					}
				}

				request.setAttribute("orderSummary", itemsQuantity);
				request.setAttribute("totalPrice", totalPrice);

				rd = request.getRequestDispatcher("Confirmation.jsp");

				rd.forward(request, response);
			}

		} catch (Exception e) {

		}
	}

}
