package com.sapient.controller;

import com.sapient.dao.BookingDao;
import com.sapient.dao.CustomerDao;
import com.sapient.dao.OrderingDao;
import com.sapient.dto.UserOrderDTO;
import com.sapient.dto.UserTableDTO;
import com.sapient.entity.Table;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ConfirmationController", value = "/ConfirmationController")
public class ConfirmationController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd=null;
        HttpSession session = request.getSession();
        session.setAttribute("confirmedTime", new Date());
        try {
            request.setAttribute("userId", CustomerDao.findUserIdByEmail(session.getAttribute("username").toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String, List> qtyMap = (Map<String, List>) session.getAttribute("orderSummary");
        int finalQty=0;
        if(session.getAttribute("finalQty")!=null) {
            finalQty = Integer.parseInt(session.getAttribute("finalQty").toString());
        }
        Table BookedTable=null;
        if(session.getAttribute("table")!=null) {
             BookedTable = (Table) session.getAttribute("table");
        }
        int totalPrice = Integer.parseInt(session.getAttribute("totalPrice").toString());
        if(BookedTable != null){
            //user-table mapping
            try {
                BookingDao.insert(UserTableDTO.builder()
                        .uid(CustomerDao.findUserIdByEmail(session.getAttribute("username").toString()))
                        .tid(BookedTable.getTableId())
                        .build());
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }else{
            //user-item-mapping
            for(String key : qtyMap.keySet()) {
                try {
                    OrderingDao.insert(UserOrderDTO.builder()
                            .fid(key)
                            .uid(CustomerDao.findUserIdByEmail(session.getAttribute("username").toString()))
                            .qty(String.valueOf(qtyMap.get(key).get(1)))
                            .build());
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                }
            }
        }
        rd = request.getRequestDispatcher("profile.jsp");
        rd.forward(request,response);
    }
}
