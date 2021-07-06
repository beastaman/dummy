<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 30/06/21
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login to school application</title>
</head>
<body>
  <%
    String message = "";
    if(request.getAttribute("message")!=null){
      message = request.getAttribute("message").toString();
    }
  %>
  <form action="LoginController", method="POST">
    <h1>California University login</h1>
    <br> <%= message %>
    <br> Enter User Id: <input type="email" name="userid" placeholder="user id" required>
    <br> Enter User Password: <input type="password" name="password" placeholder="user password" required>
    <br> <input type="submit" value="login">
  </form>
</body>
</html>
