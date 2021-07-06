<%@page import="com.to.Booking"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Booking booking = (Booking) session.getAttribute("booking");
	%>
	<div>
	<h1>Thank You for booking with us.Your table has been booked.</h1>
	<p>Details of order are</p>
	<p>Order id:<%=booking.getOrderid() %></p>
	<p>Branch id:<%=booking.getBranchid() %></p>
	<p>Table id:<%=booking.getTableid() %></p>
	<p>User id:<%=booking.getUserid() %></p>
	<p>Time:<%=booking.getTime() %></p>
	</div>
</body>
</html>