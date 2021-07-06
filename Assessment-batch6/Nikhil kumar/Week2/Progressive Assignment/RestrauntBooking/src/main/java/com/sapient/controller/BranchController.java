package com.sapient.controller;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Slf4j
@WebServlet(name = "BranchController", value = "/BranchController")
public class BranchController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = null;
        try {
            HttpSession session = request.getSession();
            System.out.println("bid: "+request.getQueryString().split("=")[1]);
//            request.setAttribute("bid", request.getQueryString().split("=")[1]);
            request.getSession().setAttribute("bid", request.getQueryString().split("=")[1]);
            rd = request.getRequestDispatcher("item.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            log.info("{}", e.getLocalizedMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Branch Controller");
    }
}
