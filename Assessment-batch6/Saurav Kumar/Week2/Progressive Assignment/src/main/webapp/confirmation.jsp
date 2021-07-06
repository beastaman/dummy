<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
<link rel = "stylesheet" href="style.css">
</head>
<body>
	<%
		int totalPrice = Integer.parseInt(session.getAttribute("totalprice").toString());
	%>
	<h1>Confirm your order</h1>
	<h1>Total price : <%= totalPrice %></h1>
	
	<form action = 'Controller' method = 'post'>
	
	<input type = 'hidden' name = 'page' value = 'confirmation'>
	<br><input type = 'submit' value = 'confirm'>
		
	</form>
	
</body>
</html>