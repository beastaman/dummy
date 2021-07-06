package com.sapient.controller;

import com.sapient.dao.TableDao;
import com.sapient.dao.FoodItemDao;
import com.sapient.entity.FoodItem;
import com.sapient.entity.Table;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

@WebServlet(name = "FoodItemController", value = "/FoodItemController")
public class FoodItemController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String option = "";
        String isBookOrPick = "";
        String branchId = request.getSession().getAttribute("bid").toString();
        System.out.println("FoodItem bid: "+branchId);
        if (request.getParameter("option") != null) {
            option = request.getParameter("option");
        }

        if (request.getParameter("isBookOrPick") != null) {
            isBookOrPick = request.getParameter("isBookOrPick");
        }

        RequestDispatcher rd = null;
        try {

            System.out.println("FoodItem :" + option);
            System.out.println("IsBookOrPick :" + isBookOrPick);
            if (option.equals("BookTable")) {
                request.setAttribute("tables", TableDao.findAllByBranchId(branchId));
                request.setAttribute("orderSelection", "BookTable");
                rd = request.getRequestDispatcher("item.jsp");
                rd.forward(request, response);
            }
            else if (option.equals("Pickup")) {
                System.out.println("Food Item Controller In Pick Up");
                request.setAttribute("foodItems", FoodItemDao.findAll());
                request.setAttribute("orderSelection", "Pickup");
                rd = request.getRequestDispatcher("item.jsp");
                rd.forward(request, response);
            }
            else if (isBookOrPick.equals("book")) {
                System.out.println("In isBookorPick Book");
                String bookedTable = request.getParameter("tableRadio");
                rd = request.getRequestDispatcher("order.jsp");
                Table table = TableDao.findTableById(bookedTable);
                request.getSession().setAttribute("totalPrice", table.getPrice());
                request.getSession().setAttribute("table", table);
                rd.forward(request, response);
            }
            else if (isBookOrPick.equals("pick")) {
                System.out.println("In isBookorPick Pick");
                Map<String, String[]> params = request.getParameterMap();
                int totalPrice = 0;
                Map<String , List> itemsQuantity = new HashMap<>();
                int fqty=0;
                for(String key : params.keySet()) {
                    if(key.startsWith("quantity_")) {
                        String id = key.split("_")[1];
                        int qty = Integer.parseInt(params.get(key)[0]);
                        if(qty>0) {
                            fqty+=qty;
                            FoodItem foodItem = FoodItemDao.findById(id);
                            totalPrice += qty * Integer.parseInt(foodItem.getFoodPrice());
                            itemsQuantity.put( id, new ArrayList<>(Arrays.asList(foodItem.getFoodName(), Integer.toString(qty), Integer.toString(qty * Integer.parseInt(foodItem.getFoodPrice())))));
                        }
                    }
                }
                System.out.println(totalPrice);
                System.out.println(itemsQuantity);
                rd = request.getRequestDispatcher("order.jsp");
                request.getSession().setAttribute("orderSummary", itemsQuantity);
                request.getSession().setAttribute("totalPrice", totalPrice);
                request.getSession().setAttribute("finalQty",fqty);
                rd.forward(request, response);
            }

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
