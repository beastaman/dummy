<%@ page import="com.spaient.entity.Branch" %>
<%@ page import="java.util.List" %>
<%@ page import="com.spaient.dao.BranchDAO" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Assignment2</title>
</head>
<body>
<div>
    <h1>Budget Swiggy</h1>
</div>

<div class="topNav">
    <ul>
        <li><a href="login.jsp">Login</a></li>
    </ul>
</div>

<h2>All Branches of Rooster Restaurant</h2>

<table border="1px">
    <tr>
        <th>Location</th>
        <th>Contact</th>
        <th>Branch Id</th>
    </tr>
    <%
        List<Branch> allBranches = null;
        try {
            allBranches = new BranchDAO().getAllBranches();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        assert allBranches != null;
        for (Branch branch : allBranches) {
    %>
    <tr>
        <td><%=branch.getLocation()%>
        </td>
        <td><%=branch.getContact()%>
        </td>
        <td><%=branch.getBranchId()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>