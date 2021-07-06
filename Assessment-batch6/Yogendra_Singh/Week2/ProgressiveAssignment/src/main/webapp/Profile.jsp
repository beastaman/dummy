<%@page import="com.to.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<%
		Customer customer =(Customer) session.getAttribute("customer");
	%>
	<div align="center">
		<table border='1'>
				<tr>
					<th>First Name</th>
					<td><%= customer.getFirstName() %></td>
				</tr>
				<tr>
					<th>Last Name</th>
					<td><%= customer.getLastName() %></td>
				</tr>
				<tr>
					<th>Email</th>
					<td><%= customer.getEmail() %></td>
				</tr>
				<tr>
					<th>Contact</th>
					<td><%= customer.getPhoneNo() %></td>
				</tr>
				<tr>
					<th>Address</th>
					<td><%= customer.getAddress() %></td>
				</tr>
		</table>
	</div>
		
</body>
</html>