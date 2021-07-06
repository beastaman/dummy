<%@page import="java.util.List"%>
<%@page import="com.to.User"%>
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
		String date = (String)session.getAttribute("date");
		String guests = (String)session.getAttribute("guests");
		User user = (User)session.getAttribute("user");
		String branch = (String)session.getAttribute("branch");
		String slot = (String)session.getAttribute("slot");
	%>
	<h2>
	<center>Booking Details<br>
	Name:<%=user.getFname()%> <%=user.getLname()%><br>
	Username:<%=user.getUsername()%><br>
	Branch:<%=branch %><br>
	Date:<%=date %><br>
	Time:<%=slot %><br>
	</center>
	</h2>
	
	
</body>
</html>