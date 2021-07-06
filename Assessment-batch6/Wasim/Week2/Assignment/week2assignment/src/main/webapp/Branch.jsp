<%@page import="com.sapient.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.sapient.entity.Branch"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

	
<head>


<meta charset="ISO-8859-1">
<title>Select branch</title>
</head>
<body>
		<div>
		<%
			List<Branch> branches = null;
			
			if (request.getAttribute("branch") != null) {
				branches = (List<Branch>) request.getAttribute("branch");
			}
		%>
		<br>
		<h2>Roster Restaurant</h2>
			<h3>Select Branch</h3>
		<br>

		<%
			if(branches != null) {
		%>

		<table border="1" style="width: 60%">
			<tr>
				<th>Name</th>
				<th>Address</th>
				<th>Phone No</th>
				<th>Click to order</th>
			</tr>

			<%
					for(Branch branch : branches) {
				%>
			<tr>
				<td><%= branch.getName() %></td>
				<td><%= branch.getAddress() %></td>
				<td><%= branch.getPhoneNo() %></td>
				<td name=<%= branch.getbId() %>><a href="/week2assignment/BranchController?id=<%=branch.getbId()%>"  onclick="goToItems()" >Click to view</a></td>
			</tr>
			<%
					}
				%>


		</table>

		<%
			}
		%>
	</div>
		<style>

			div {
				text-align: center;
			}
			
			
			table {
				width: 50%;
				margin-left: auto;
				margin-right: auto;
			}
			
			th {
				background-color: #FF6347;
			}
			
			body {
				background-color: #F0F8FF;
			}
			
			
		</style>

</body>
</html>