<%@ page import="com.spaient.entity.BranchTable" %>
<%@ page import="java.util.List" %>
<%@ page import="com.spaient.dao.BranchTableDAO" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: aniket
  Date: 01-07-2021
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Tables</h2>
<table border="1px">
    <tr>
        <th>Table Status</th>
        <th>Table Id</th>
        <th>Branch Id</th>
        <th>Table Number</th>
    </tr>
    <%
        List<BranchTable> freeTables = null;
        try {
            freeTables = new BranchTableDAO().getAllTables();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        for (BranchTable branchTable : freeTables) {
    %>
    <tr>
        <td><%=branchTable.getTableStatus().name()%>
        </td>
        <td><%=branchTable.getTableId()%>
        </td>
        <td><%=branchTable.getBranchId()%>
        </td>
        <td><%=branchTable.getTableNumber()%>
        </td>
    </tr>
    <%}%>
</table>
<h2>Book table here</h2>
<form action="${pageContext.request.contextPath}/ReservationController" method="post">
    <br>BranchTable <input type="text" name="tableId" required="required"/>
    <br><input type="submit" value="Reservation">
</form>
</body>
</html>
