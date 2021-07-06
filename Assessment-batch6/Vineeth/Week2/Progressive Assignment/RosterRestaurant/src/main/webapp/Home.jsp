<%@page import="java.util.List"%>
<%@page import="com.sapient.dto.Branch"%>
<%@page import="com.sapient.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roster Restaurant</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<body>
	<%
		List<Branch> branchList = (List<Branch>) request.getAttribute("branchList");
		User user = (User) session.getAttribute("user");
	%>
	<header>
		<h1>Roster Restaurant</h1>
	</header>
	<%
		if(user != null) {
	%>
			<h3>Welcome, <%=(user.getFname() + " " + user.getLname()).trim() %></h3>
			<form action="BranchController" method="get">
				<button type="submit" name="path" value="MyReservations">My Reservations</button>
			</form>
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
	<h3>Branches</h3>
	<form action="BranchController" method="get">
		<input type="hidden" name="path" value="branch">
		<%
			for(Branch branch : branchList) {
		%>
		<div>
			<button type="submit" name="branchId" value="<%=branch.getId()%>"><%=branch.getName()%></button>
		</div>
		<%
			}
		%>
	</form>
</body>
</html>