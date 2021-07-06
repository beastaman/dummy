<%--
  Created by IntelliJ IDEA.
  User: aniket
  Date: 30-06-2021
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login to school application</title>
</head>
<body>
<h1>Welcome</h1>
<form action='LoginController' method=post>
    <br> Enter user id <input type="text" name="user_id" required="required">
    <br> Enter user password <input type="password" name="password" required="required">
    <br><input type="submit" value="login">
</form>
</body>
</html>
