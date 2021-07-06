package com.controller;

import com.dao.UserDao;
import com.entity.User;
import lombok.extern.java.Log;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginController", value = "/LoginController")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = null;
        try{
            UserDao userDao = new UserDao();
            User user = userDao.getUser(User.builder()
                    .userId(request.getParameter("userid"))
                    .password(request.getParameter("password"))
                    .build());
            if(user.getStatus().equals("admin")){
                rd = request.getRequestDispatcher("admin.jsp");
            }else{
                rd = request.getRequestDispatcher("user.jsp");
            }
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            rd.forward(request, response);
        }catch (Exception e){
            rd = request.getRequestDispatcher("login.jsp");
            request.setAttribute("message", e.getMessage());
            rd.forward(request,response);
            System.out.println(e.getLocalizedMessage());
        }
    }
}
