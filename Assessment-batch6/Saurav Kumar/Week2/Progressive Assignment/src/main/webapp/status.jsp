<%@page import="com.to.Order"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href="style.css">
</head>
<body>
	<%
		Order order = (Order)session.getAttribute("order");
		String message = order.getStatus();
	%>
	
	<h1><%= message %></h1>
</body>
</html>