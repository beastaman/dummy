<%@page import="com.sapient.dto.User"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.sapient.dto.Branch"%>
<%@page import="com.sapient.dto.Table"%>
<%@page import="com.sapient.dto.User"%>
<%@page import="com.sapient.dto.Reservation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserve Table</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<body>
	<%
		Branch branch = (Branch) request.getAttribute("branch");
		System.out.println("B-Id : " + branch.getId());
		Date date = null;
		if(request.getAttribute("date") != null)
			date = Date.valueOf(request.getAttribute("date").toString());
		List<Table> tables = null;
		if(request.getAttribute("tables") != null)
			tables = (List<Table>) request.getAttribute("tables");
		double total = (branch.getClose().getTime()-branch.getOpen().getTime())/(60*1000);
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
	<form action="BranchController" method="get">
		<input type="hidden" name="path" value="reservations">
		<input type="hidden" name="branchId" value="<%=branch.getId()%>">
		<br> Date <input type="date" name="date" value=<%=date %> required>
		<br> <button type="submit">Show Available Tables</button>
	</form>
	<%
		if(date != null && tables != null) {
			Calendar calendar = Calendar.getInstance();
			for(Table table : tables) {
	%>
				<h5>Table <%=table.getTableNo() %></h5>

				<form action="BranchController" method="get">
					<input type="hidden" name="path" value="reservation">
					<input type="hidden" name="tableId" value="<%=table.getId() %>">
					<input type="hidden" name="date" value="<%=date.toString().substring(0, 10) %>">
					<div style="width: 90vw; display: flex;">
						<%
							double unreserved = 0, width;
							String timeRange = "";
							for(Reservation reservation : table.getReservations()) {
								double start = (reservation.getStartTime().getTime() - Timestamp.valueOf(reservation.getStartTime().toString().substring(0, 11) + branch.getOpen().toString().substring(11)).getTime())/(60*1000);
								if(unreserved < start) {
									width = (start-unreserved)/total*100;
									calendar.setTime(branch.getOpen());
									calendar.add(Calendar.MINUTE, (int) unreserved);
									timeRange = String.format("%02d:%02d-", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
									calendar.add(Calendar.MINUTE, (int) (start-unreserved));
									timeRange += String.format("%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
						%>
									<button type="submit" name="timeRange" value="<%=timeRange %>" style="width: <%=width%>%; background-color: rgb(0 255 0); height: 20px;">
						<%
								}
								width = reservation.getDuration()/total*100;
						%>
								<button type="submit" disabled style="width: <%=width%>%; background-color: rgb(255 0 0); height: 20px;">
						<%
								unreserved = start + reservation.getDuration();
							}
							
							if(unreserved < total) {
								width = (total-unreserved)/total*100;
								calendar.setTime(branch.getOpen());
								calendar.add(Calendar.MINUTE, (int) unreserved);
								timeRange = String.format("%02d:%02d-", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
								calendar.setTime(branch.getClose());
								timeRange += String.format("%02d:%02d", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE));
						%>
								<button type="submit" name="timeRange" value="<%=timeRange %>" style="width: <%=width%>%; background-color: rgb(0 255 0); height: 20px;">
						<%
							}
						%>
					</div>
				</form>
	<%
			}
		}
	%>
</body>
</html>