<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 06/07/21
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <title>Create New Product</title>
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
    <h1>Create New Product</h1>
    <br />
    <form:form action="add-product" modelAttribute="product" method="post">
        <table border="0" cellpadding="10">
            <tr>
                <td>Product Name:</td>
                <td><input class="form form-control" type="text" name="name" required/></td>
            </tr>
            <tr>
                <td>Brand:</td>
                <td><input class="form form-control" type="text" name="brand" required/></td>
            </tr>
            <tr>
                <td>Made In:</td>
                <td><input class="form form-control" type="text" name="madeIn" required/></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input class="form form-control" type="text" name="price" required/></td>
            </tr>
        </table>
        <input class="btn btn-primary" type="submit" value="Save"/>
    </form:form>
</div>
</body>
</html>