<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<style>
	.bg {
		background-color: powderblue;
    	display: flex;
    	flex-direction: row;
    	justify-content: center;
	}
	.card {
		background-color: white;
	    padding: 10px;
	    border-radius: 5px;
	    margin-top: 10vw;
	}
	.login-form {
	    display: flex;
	    flex-direction: column;
	}
</style>
<body class="bg">
	<%
		String message = "";
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
	%>

	<div class="card">
		<form class="login-form" action="LoginController" method="post">
			<center><h1>Login</h1></center>
			<%= message %>
			<br>Enter user id <input type="text" name="id" required>
			<br>Enter password <input type="password" name="password" required>
			<br><input type="submit" value="Login">
		</form>
	</div>
</body>
</html>