<%--
  Created by IntelliJ IDEA.
  User: aniket
  Date: 02-07-2021
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/LoginController" method="post">
    <h1>Customer Login</h1>
    <br>Email <input type="email" name="customerEmail" required="required"/>
    <br>Enter password<input type="password" name="customerPassword" required="required"/>
    <br><input type="submit" value="Login">
</form>

</body>
</html>
