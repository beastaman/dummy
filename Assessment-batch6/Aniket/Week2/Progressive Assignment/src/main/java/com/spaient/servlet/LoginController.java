package com.spaient.servlet;

import com.spaient.dao.CustomerDAO;
import com.spaient.entity.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    private static final long serialVersionUID = 1;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = null;
        try {
            String email = request.getParameter("customerEmail");
            String password = request.getParameter("customerPassword");

            Customer connectedCustomer = new Customer(email, password);

            Customer storedUser = null;
            try {
                storedUser = new CustomerDAO().getCustomerByEmail(email);
            } catch (SQLException | ClassNotFoundException throwables) {
                throwables.printStackTrace();
            }
            assert storedUser != null;

            if (storedUser.getPassword().equals(connectedCustomer.getPassword())) {
                HttpSession httpSession = request.getSession();
                httpSession.setAttribute("Customer", storedUser);
                requestDispatcher = request.getRequestDispatcher("welcome.jsp");
            } else {
                requestDispatcher = request.getRequestDispatcher("invalidLogin.jsp");
            }

            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
