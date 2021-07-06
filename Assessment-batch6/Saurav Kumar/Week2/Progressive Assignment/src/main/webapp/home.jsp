<%@page import="com.to.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel = "stylesheet" href="style.css">
</head>
<body>

	<%
		User user1 = (User)session.getAttribute("user");
	%>

	<h1>Hi, <%= user1.getFname() %></h1>
	
	<h1>Select a branch</h1>
			<form action = 'Controller' method = 'post'>
			
				<input type = 'hidden' name = 'page' value = 'home'>
				
				<input type = 'submit' name = 'branch' value = 'Delhi'><br>
				<br><input type = 'submit' name = 'branch' value = 'Noida'><br>
				<br><input type = 'submit' name = 'branch' value = 'Gurgaon'><br>
				<br><input type = 'submit' name = 'branch' value = 'Mumbai'><br>
				<br><input type = 'submit' name = 'branch' value = 'Bangalore'><br>
				<br><input type = 'submit' name = 'branch' value = 'Kolkata'><br>
				
			</form>
</body>
</html>