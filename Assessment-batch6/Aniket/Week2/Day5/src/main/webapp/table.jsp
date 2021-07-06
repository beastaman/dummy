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
    <title>Table</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>Status</th>
        <th>Table Id</th>
        <th>Branch Id</th>
    </tr>
    <%
        List<BranchTable> allTables = null;
        try {
            allTables = new BranchTableDAO().getAllTables();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        assert allTables != null;
        for (BranchTable branchTable : allTables) {
    %>
    <tr>
        <td><%=branchTable.getTableStatus().name()%>
        </td>
        <td><%=branchTable.getTableId()%>
        </td>
        <td><%=branchTable.getBranchId()%>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
