<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.Date"%>
<%@page import="com.sapient.dto.Branch"%>
<%@page import="com.sapient.dto.Table"%>
<%@page import="com.sapient.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<body>
	<%
		Branch branch = (Branch) request.getAttribute("branch");
		Table table = (Table) request.getAttribute("table");
		String date = (String) request.getAttribute("date");
		String timeRange = (String) request.getAttribute("timeRange");
		String[] time = timeRange.split("-");
		Timestamp minStartTime = Timestamp.valueOf(date + " " + time[0] + ":00");
		Timestamp maxEndTime = Timestamp.valueOf(date + " " + time[1] + ":00");
		String startTime = time[0], endTime = time[1];
		if(request.getAttribute("startTime") != null)
			startTime = (String) request.getAttribute("startTime");
		if(request.getAttribute("endTime") != null)
			endTime = (String) request.getAttribute("endTime");
		String message = "";
		if(request.getAttribute("message") != null) {
			message = (String) request.getAttribute("message");
			request.removeAttribute("message");
		}
		User user = (User) session.getAttribute("user");
	%>
	<h1>Roster Restaurant</h1>
	<%
		if(user != null) {
	%>
			<h3>Welcome, <%=(user.getFname() + " " + user.getLname()).trim() %></h3>
	<%
		}
		else {
	%>
			<form action="BranchController" method="get">
				<button type="submit" name="path" value="login">Login</button>
				<button type="submit" name="path" value="signup">Sign Up</button>
			</form>
	<%
		}
	%>
	<h3><%=branch.getName() %></h3>
	<h4>Table <%=table.getTableNo() %></h4>
	<h6>Date : <%=date %></h6>
	<h6>Available Time Slot : <%=time[0] %> - <%=time[1] %></h6>
	
	<div><%=message %></div>
	<form action="BranchController" method="post">
		<input type="hidden" name="path" value="reservation">
		<input type="hidden" name="tableId" value="<%=table.getId() %>">
		<input type="hidden" name="date" value="<%=date %>">
		<input type="hidden" name="timeRange" value="<%=timeRange %>">
		Start Time <input type="time" name="startTime" value="<%=startTime %>" required> <br>
		End Time <input type="time" name="endTime" value="<%=endTime %>" required> <br>
		<button type="submit">Reserve Table</button>
	</form>
</body>
</html>