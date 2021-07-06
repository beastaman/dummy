<%@ page import="com.sapient.dao.CustomerDao" %>
<%@ page import="com.sapient.entity.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.sapient.entity.Table" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 02/07/21
  Time: 11:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style type="text/css">
        table {
            border-collapse: separate;
            border-spacing: 0 15px;
        }
        th {
            background-color: #4287f5;
            color: white;
        }
        th,
        td {
            width: 150px;
            text-align: center;
            border: 1px solid black;
            padding: 5px;
        }
        h2 {
            color: #4287f5;
        }
        body{
            padding-top: 2%;
        }
    </style>
</head>
<body>
    <center>
        <%
            Date time = (Date)session.getAttribute("confirmedTime");
        %>
        <h1>Roster Restraunt</h1>
        <h3>Order History</h3>
        <h6><%=time%></h6>
        <%
            Map<String, List> orderSummary = new HashMap<>();
            if(session.getAttribute("orderSummary")!=null) {
                orderSummary = (Map<String, List>) session.getAttribute("orderSummary");
            }
            int totalPrice=0;
            if(session.getAttribute("totalPrice")!=null){
                totalPrice = Integer.parseInt(session.getAttribute("totalPrice").toString());
            }
            Table BookedTable = null;
            if(session.getAttribute("table")!=null){
                BookedTable = (Table) session.getAttribute("table");
            }
            int finalQty=0;
            if(session.getAttribute("finalQty")!=null){
                finalQty=Integer.parseInt(session.getAttribute("finalQty").toString());
            }
            String username = session.getAttribute("username").toString();
        %>
        <div align="right" style="padding-right: 2%; margin-top: 2%">
            <div class="user-profile"><%= username %></div>
            <br>
            <a href="/RestrauntBooking/login.jsp"><button class="btn btn-dark">logout</button></a>
        </div>
        <h1>User Profile</h1>
            <%
            if(BookedTable!=null){
            %>
            <h1>Table Bookings</h1>
            <table style="width: 50%">
                <tr>
                    <th>Table Booked</th>
                    <th>Table Price</th>
                </tr>
                <tr>
                    <td><%=BookedTable.getTableId()%></td>
                    <td><%=BookedTable.getPrice()%></td>
                </tr>
                <tr>
                    <td>Total Paid Amount: </td>
                    <td>Rs. <%=totalPrice%></td>
                </tr>
            </table>

            <%
               }
                if(!orderSummary.isEmpty()){
            %>
            <table style="width: 50%">
                <tr>
                    <th>FoodItem Name</th>
                    <th>FoodItem Quantity</th>
                    <th>FoodItem Price</th>
                </tr>
                <%
                    for(String k : orderSummary.keySet()){
                %>
                <tr>
                    <td><%=orderSummary.get(k).get(0)%></td>
                    <td><%=orderSummary.get(k).get(1)%></td>
                    <td><%=orderSummary.get(k).get(2)%></td>
                </tr>
                <%
                    }
                %>
                <tr>
                    <td>Total Paid</td>
                    <td><%=finalQty%></td>
                    <td>Rs. <%=totalPrice%></td>
                </tr>
            </table>
        <%
         }
        %>
    </center>
</body>
</html>
