<%@ page import="com.spaient.entity.Branch" %>
<%@ page import="java.util.List" %>
<%@ page import="com.spaient.dao.BranchTableDAO" %>
<%@ page import="com.spaient.dao.BranchDAO" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: aniket
  Date: 01-07-2021
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parcel</title>
</head>
<body>
<table>
    <h2>All Branch details</h2>
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
    %>
    <%
        assert allBranches != null;
        for (Branch branch : allBranches) { %>
    <tr>
        <th><%=branch.getLocation()%>
        </th>
        <th><%=branch.getContact()%>
        </th>
        <th><%=branch.getBranchId()%>
        </th>
    </tr>

    <%}%>
</table>

<form action="${pageContext.request.contextPath}/ParcelController" method="post">
    <br>Branch <input type="number" name="branchId" required="required"/>
    <br><input type="submit" value="Parcel">
</form>
</body>
</html>
