package com.spaient.servlet;

import com.spaient.dao.BranchTableDAO;
import com.spaient.dao.ReservationDAO;
import com.spaient.entity.BranchTable;
import com.spaient.entity.Customer;
import com.spaient.entity.Reservation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ReservationController", value = "/ReservationController")
public class ReservationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        Integer tableId = Integer.valueOf(request.getParameter("tableId"));

        HttpSession session = request.getSession();
        Customer customer = (Customer) session.getAttribute("Customer");

        // you can add 100s of exceptions here; keep it simple
        BranchTable branchTable = null;
        try {
            branchTable = new BranchTableDAO().getFreeTableById(tableId);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // If we somehow couldn't occupy table
        if (branchTable != null) {
            requestDispatcher = request.getRequestDispatcher("customer.jsp");
            try {
                new BranchTableDAO().occupyTable(tableId);
                // now add this reservation
                Reservation reservation = new Reservation(
                        customer.getCustomerId(),
                        branchTable.getTableId());
                new ReservationDAO().addReservation(reservation);
                new BranchTableDAO().occupyTable(reservation.getTableId());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                requestDispatcher.forward(request, response);
            }
        } else {
            requestDispatcher = request.getRequestDispatcher("reservation.jsp");
            requestDispatcher.forward(request, response);
        }
    }
}
