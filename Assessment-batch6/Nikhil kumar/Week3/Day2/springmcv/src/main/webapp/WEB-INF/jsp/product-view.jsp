<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 06/07/21
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ProductCatalog</title>
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
    <div align="center">
        <div align="right" style="padding: 2%">
            <form:form action="show-product" method="get">
                <input class="btn btn-primary" type="submit" value="refresh">
            </form:form>
        </div>
        <h1>Products</h1>
            <table>
                <tr>
                    <th>Product Id</th>
                    <th>Name</th>
                    <th>Brand</th>
                    <th>Made In</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
                <c:forEach items="${products}" var="product">
                    <tr>
                        <td><c:out value="${product.pid}"/></td>
                        <td><c:out value="${product.name}"/></td>
                        <td><c:out value="${product.brand}"/></td>
                        <td><c:out value="${product.madeIn}"/></td>
                        <td><c:out value="${product.price}"/></td>
                        <td>
                            <a href="delete-product?id=${product.pid}">
                                <input class="btn btn-warning" type="submit" value="delete">
                            </a>
                        </td>
                    </tr>
                </c:forEach>
        </table>
    </div>
</body>
</html>
