<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sapient.dto.User"%>
<%@page import="com.sapient.dto.ReservationDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Reservations</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<body>
	<%
		User user = (User) session.getAttribute("user");
		List<ReservationDetails> reservations = null;
		if(request.getAttribute("reservations") != null)
			reservations = (List<ReservationDetails>) request.getAttribute("reservations");
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
	
	<h3>My Resrvations</h3>
	<%
		if(reservations != null && reservations.size() != 0) {
	%>
			<table border="1">
				<tr>
					<th>Branch Name</th>
					<th>Table No.</th>
					<th>Date</th>
					<th>Start Time</th>
					<th>End Time</th>
					<th>Duration (min)</th>
				</tr>
				<%
					for(ReservationDetails reservation : reservations) {
				%>
					<tr>
						<td><%=reservation.getBranchName() %></td>
						<td>Table <%=reservation.getTableNo() %></td>
						<td><%=reservation.getStartTime().toString().substring(0, 10) %></td>
						<td><%=reservation.getStartTime().toString().substring(11, 16) %></td>
						<td><%=reservation.getEndTime().toString().substring(11, 16) %></td>
						<td><%=reservation.getDuration() %></td>
					</tr>
				<%
					}
				%>
			</table>
	<%
		}
		else {
	%>
			<h4>No Reservations available</h4>
	<%
		}
	%>
</body>
</html>