<%@ page import="com.spaient.entity.Customer" %>
<%@ page import="com.spaient.entity.Reservation" %>
<%@ page import="java.util.List" %>
<%@ page import="com.spaient.dao.ReservationDAO" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.spaient.entity.BranchTable" %>
<%@ page import="com.spaient.dao.BranchTableDAO" %>
<%@ page import="com.spaient.entity.Parcel" %>
<%@ page import="com.spaient.dao.ParcelDAO" %><%--
  Created by IntelliJ IDEA.
  User: aniket
  Date: 01-07-2021
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Info</title>
</head>
<body>
<h2>Customer Personal Information</h2>
<table border="1px">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Contact</th>
        <th>Address</th>
        <th>Customer Id</th>
    </tr>
    <%
        Customer customer = (Customer) session.getAttribute("Customer");
        System.out.println(customer);
    %>
    <tr>
        <td><%=customer.getName()%>
        </td>
        <td><%=customer.getEmail()%>
        </td>
        <td><%=customer.getContact()%>
        </td>
        <td><%=customer.getAddress()%>
        </td>
        <td><%=customer.getCustomerId()%>
        </td>
    </tr>
</table>

<h2>Customer Reservation</h2>
<table border="1px">
    <tr>
        <th>Customer Id</th>
        <th>Table Id</th>
        <th>Table Number</th>
        <th>Reservation Id</th>
        <th>Table Status</th>
        <th>Branch Id</th>
    </tr>
    <%
        List<Reservation> allReservationOfCustomer = null;
        try {
            allReservationOfCustomer = new ReservationDAO().getReservationByCustomer(customer.getCustomerId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        for (Reservation reservation : allReservationOfCustomer) {
            BranchTable branchTable = new BranchTableDAO().getTableById(reservation.getTableId());
    %>
    <tr>
        <td><%=customer.getCustomerId()%>
        </td>
        <td><%=branchTable.getTableId()%>
        </td>
        <td><%=branchTable.getTableNumber()%>
        </td>
        <td><%=reservation.getReservationId()%>
        </td>
        <td><%=branchTable.getTableStatus().name()%>
        </td>
        <td><%=branchTable.getBranchId()%>
        </td>
    </tr>
    <%}%>
</table>
<table>
    <tr>
        <th>Customer Id</th>
        <th>Branch Id</th>
        <th>Status</th>
    </tr>
    <%
        List<Parcel> allParcelOfCustomer = null;
        try {
            allParcelOfCustomer = new ParcelDAO().getAllParcelByCustomer(customer.getCustomerId());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        for (Parcel parcel : allParcelOfCustomer) {
    %>

    <tr>
        <td><%=parcel.getCustomerId()%>
        </td>
        <td><%=parcel.getBranchId()%>
        </td>
        <td><%=parcel.getStatus().name()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
