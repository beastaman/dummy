<%@page import="com.to.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
<center>
	<h1>
		User :
		<%
	User user1 = (User) session.getAttribute("user");
	%>
		Welcome
		<%=user1.getFname()%>
		<%=user1.getLname()%>
	</h1>
	<br>
	<br>
	<div>
		<form action='LoginController' method='post'>
			<select id="branch" name="branch">
				<option value="Bangalore">Bangalore</option>
				<option value="Delhi">Delhi</option>
				<option value="Gurgaon">Gurgaon</option>
			</select> 
			<input type='submit' name='option' value='Dine-In'>
			<input type='submit' name='option' value='Pickup'> 
			<input type='hidden' name='page' value='Selection'>
		</form>
	</div>
</center>
</body>
</html>