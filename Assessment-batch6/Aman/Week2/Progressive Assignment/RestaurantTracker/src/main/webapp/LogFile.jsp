<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to Roster Restaurant Tracker</title>
</head>
<body>
	<%
		String message = "";
		if(request.getAttribute("message")!=null){
			message = request.getAttribute("message").toString();
		}
	%>
	<form action = 'LogController' method = 'post'>
		<h1>Roster Restaurant Login</h1>
		<br> <%= message %>
		<br> Enter user id <input type ='text' name ='userid' placeholder = 'user id' required = 'required'>
		<br> Enter user password <input type ='password' name ='password' required = 'required'>
		<br> <input type = 'submit' value = 'Login'>
		<input type= 'hidden' name = 'h1' value = 'Login'>
	</form>
</body>
</html>