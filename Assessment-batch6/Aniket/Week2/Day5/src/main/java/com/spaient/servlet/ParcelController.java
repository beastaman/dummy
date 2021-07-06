package com.spaient.servlet;

import com.spaient.dao.BranchDAO;
import com.spaient.dao.ParcelDAO;
import com.spaient.entity.Branch;
import com.spaient.entity.Customer;
import com.spaient.entity.DeliveryStatus;
import com.spaient.entity.Parcel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ParcelController", value = "/ParcelController")
public class ParcelController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        Integer branchId = Integer.valueOf(request.getParameter("branchId"));

        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("Customer");

        Branch branch = null;
        try {
            branch = new BranchDAO().getBranchById(branchId);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        if (branch == null) {
            requestDispatcher = request.getRequestDispatcher("parcel.jsp");
            requestDispatcher.forward(request, response);
        } else {
            requestDispatcher = request.getRequestDispatcher("customer.jsp");
            Parcel parcel = new Parcel(customer.getCustomerId(), branchId, DeliveryStatus.UNDELIVERED);
            try {
                new ParcelDAO().addParcel(parcel);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                requestDispatcher.forward(request, response);
            }
        }
    }
}
