package com.sapient.controller;

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
            String s1 = request.getParameter("h1");
            if(s1.equals("Login")) {
                UserDao userDao = new UserDao();
                User user = userDao.getUser(User.builder()
                        .userId(request.getParameter("userid"))
                        .password(request.getParameter("password"))
                        .build());
                if (user.getStatus().equals("admin")) {
                    rd = request.getRequestDispatcher("admin.jsp");
                } else {
                    rd = request.getRequestDispatcher("user.jsp");
                }
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                rd.forward(request, response);
            }else if(s1.equals("Home")){
                int userChoice = Integer.parseInt(request.getParameter("choice"));
                if(userChoice==1){
                    request.setAttribute("choice",1);
                    request.setAttribute("students", StudentDao.findAll());
                    rd = request.getRequestDispatcher("admin.jsp");
                    rd.forward(request,response);
                }else if(userChoice==2){
                    request.setAttribute("choice",2);
                    rd = request.getRequestDispatcher("admin.jsp");
                    rd.forward(request,response);
                }
            }else if(s1.equals("3")){
                StudentDao.insert(
                        Student.builder()
                                .id(request.getParameter("sid"))
                                .fName(request.getParameter("fname"))
                                .lName(request.getParameter("lname"))
                                .dob(request.getParameter("dob"))
                                .area(request.getParameter("area"))
                                .phone(request.getParameter("phone"))
                                .build()
                );
                request.setAttribute("message", "Record Successfully Inserted");
                rd = request.getRequestDispatcher("admin.jsp");
                rd.forward(request,response);
            }
        }catch (Exception e){
            rd = request.getRequestDispatcher("login.jsp");
            request.setAttribute("message", e.getMessage());
            rd.forward(request,response);
            System.out.println(e.getLocalizedMessage());
        }
    }
}
