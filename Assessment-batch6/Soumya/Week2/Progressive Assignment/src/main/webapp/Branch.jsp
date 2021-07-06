<%@page import="com.sapient.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.sapient.entity.Branch"%>
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
			List<Branch> branches = null;
	
			if (request.getAttribute("branch") != null) {
				branches = (List<Branch>) request.getAttribute("branch");
			}
			User user = (User)request.getAttribute("user");
		%>

		<h1>
			Welcome
			<%=user.getfName()%>
		</h1>

		<%
			if(branches != null) {
		%>

		<table border="1" style="width: 50%">
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
				<td name=<%= branch.getBranchId() %>><a href="/RosterRestaurant/BranchController?id=<%=branch.getBranchId()%>"  onclick="goToItems()" >Click to view</a></td>
			</tr>
			<%
					}
				%>


		</table>

		<%
			}
		%>
	
</body>
</html>