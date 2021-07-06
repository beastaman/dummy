<%--
  Created by IntelliJ IDEA.
  User: aniket
  Date: 30-06-2021
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%
    String msg = "";
    if (request.getAttribute("msg") != null) {
        msg = request.getAttribute("msg").toString();
    }
%>

<form action='LoginController' method='post'>
    <h1>UCLA Login</h1>
    <br><%= msg %>
    <br>Enter user id <input type='text' name='userid' placeHolder='user id' required='required'/>
    <br>Enter password <input type='password' name='password' required='required'/>

    <br><input type='submit' value='Login'>
</form>
</body>
</html>
