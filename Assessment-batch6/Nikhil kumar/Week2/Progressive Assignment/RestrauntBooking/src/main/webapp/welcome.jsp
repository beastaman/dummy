<%@ page import="com.sapient.entity.Branch" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 01/07/21
  Time: 11:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Restraunt</title>
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
    </style>
</head>
<body>
    <%
        String username="";
        if(session.getAttribute("username")!=null) {
            username = session.getAttribute("username").toString();
        }
        List<Branch> branches = (List<Branch>)request.getAttribute("branches");
    %>
    <center>
        <div align="right" style="padding-right: 2%; margin-top: 2%">
            <div class="user-profile"><%= username %></div>
            <br>
            <a href="/RestrauntBooking/login.jsp"><button class="btn btn-dark">logout</button></a>
        </div>
        <div class="contrainer-fluid">
            <h1>Welcome To Roster Restraunt</h1>
            <p>Best Delicious Food</p>
            <p>Select the branch</p>
        </div>
        <table>
            <tr>
                <th> Branch Name </th>
                <th> Branch Address </th>
                <th> Branch Contact </th>
                <th> Branch Checkout </th>
            </tr>
            <%
               if(branches!=null){
                 for(Branch branch: branches){
            %>
<%--            <input type="hidden" name="bid" />--%>
            <tr>
                <td><%= branch.getBranchName() %> </td>
                <td> <%= branch.getAddress() %> </td>
                <td> <%= branch.getPhoneNo() %> </td>
                <td><a href="/RestrauntBooking/BranchController?id=<%=branch.getBranchId()%>">Click to view</a></td>
            </tr>
            <%
                  }
                }
            %>
    </center>
</body>
</html>
