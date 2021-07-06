package com.sapient.controller;

import com.sapient.dao.BranchDao;
import com.sapient.dao.CustomerDao;
import com.sapient.dto.LoginRequest;
import com.sapient.entity.Customer;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@Slf4j
@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
//        request.getSession().removeAttribute("tables");
//        request.getSession().removeAttribute("orderSummary");
//        request.getSession().removeAttribute("totalPrice");
         RequestDispatcher rd = null;
         try {
             boolean isUser = CustomerDao
                     .findUserByIdAndPassword(LoginRequest
                             .builder()
                             .username(request.getParameter("username"))
                             .password(request.getParameter("password"))
                             .build());
             if(isUser){
                 System.out.println("customer exist");
                 rd = request.getRequestDispatcher("welcome.jsp");
                 HttpSession userSession = request.getSession();
                 userSession.setAttribute("username", request.getParameter("username"));
                 request.setAttribute("branches", BranchDao.findAll());
                 rd.forward(request,response);
             }else{
                 System.out.println("customer not exist");
                 request.setAttribute("message", "customer not exist");
                 rd = request.getRequestDispatcher("login.jsp");
                 rd.forward(request,response);
             }
         }catch (Exception e){
             System.out.println(e.getLocalizedMessage());
         }
    }
}
