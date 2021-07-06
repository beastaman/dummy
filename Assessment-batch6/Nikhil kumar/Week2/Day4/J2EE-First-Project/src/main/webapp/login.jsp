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
   <style><%@include file="css/login.css"%></style>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
  <%
    String message = "";
    if(request.getAttribute("message")!=null){
      message = request.getAttribute("message").toString();
    }
  %>
  <form action="LoginController" method="post">
    <h1>California University login</h1>
    <br> <em><%= message %></em>
    <h6> Enter User Id: <input type="email" name="userid" placeholder="user id" required></h6>
    <h6> Enter User Password: <input type="password" name="password" placeholder="user password" required></h6>
    <h6> <input type="submit" value="login"></h6>
     <input type= 'hidden' name = 'h1' value = 'Login'>
  </form>
</body>
</html>
