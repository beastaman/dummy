<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 06/07/21
  Time: 12:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
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
    <h1>Student Data</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>DOB</th>
            </tr>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td><c:out value="${student.id}"/></td>
                    <td><c:out value="${student.fName}"/></td>
                    <td><c:out value="${student.dob}"/></td>
                </tr>
            </c:forEach>
        </table>
    </center>
</body>
</html>
