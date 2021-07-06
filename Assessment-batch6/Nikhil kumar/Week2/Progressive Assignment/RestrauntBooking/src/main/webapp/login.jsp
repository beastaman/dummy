<%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 01/07/21
  Time: 5:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        body{
            padding-top: 10%;
            text-align: center;
            background: #deecec;
        }
        .usname, .pwd{
            margin: 1%
        }
        input[type='submit']{
            margin: 1%;
        }
    </style>
</head>
<body>
    <h1>Roster Restraunt</h1>
    <h3>Customer Login</h3>
    <p>Please provide your credentials below</p>
    <div class="container">
        <form action="LoginController" method="post">
            <div>username</div>
            <input type="text" name="username" placeholder="username" required/>
            <div>password</div>
            <input type="password" name="password" placeholder="username" required/>
            <br>
            <input class="btn btn-primary" type="submit" name="login" value="Login"/>
        </form>
    </div>
</body>
</html>
