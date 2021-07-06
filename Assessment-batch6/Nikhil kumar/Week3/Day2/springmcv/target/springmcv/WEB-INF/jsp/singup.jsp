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
</head>
<body>
<div align="center">
    <h1>Create New Product</h1>
    <br />
    <form action="#" th:action="@{/save}" th:object="${product}"
          method="post">

        <table border="0" cellpadding="10">
            <tr>
                <td>Product Name:</td>
                <td><input type="text" th:field="*{name}" /></td>
            </tr>
            <tr>
                <td>Brand:</td>
                <td><input type="text" th:field="*{brand}" /></td>
            </tr>
            <tr>
                <td>Made In:</td>
                <td><input type="text" th:field="*{madein}" /></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" th:field="*{price}" /></td>
            </tr>
            <tr>
                <td colspan="2"><button type="submit">Save</button> </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>