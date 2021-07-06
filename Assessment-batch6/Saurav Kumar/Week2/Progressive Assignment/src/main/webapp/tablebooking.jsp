<%@page import="com.to.User"%>
<%@page import="com.to.Item"%>
<%@page import="java.util.List"%>
<%@page import="com.to.Branch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserve Table</title>
<link rel = "stylesheet" href="style.css">
</head>
<body>

	<%
		Branch branch = (Branch)request.getAttribute("branch");
		String message = "";
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
	%>
	

	<div>
		
		<h1> Country Restaurant, <%= branch.getLocation() %></h1>
		<h2>Do your booking!</h2>
		<h2>Tables available : <%= branch.getAvailable() %></h2>
	
		<form action = 'Controller' method = 'post'>
			<br><%= message %>
			<br>Number of tables to reserve  <input type = 'text' name = 'table' value = '0'>
			<input type = 'hidden' name = 'branch' value = '<%= branch.getLocation() %>'>
			<input type = 'hidden' name = 'page' value = 'tablebooking'>
			<br><input type = 'submit' value = 'reserve'> 
		
		</form>
	
	
	</div>
	
	
</body>
</html>