<%@page import="com.to.Item"%>
<%@page import="java.util.List"%>
<%@page import="com.to.Branch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roster Home Page</title>
</head>
<body>

	<%
	List<Branch> branches = null;

	if (request.getAttribute("branches") != null) {
		branches = (List) request.getAttribute("branches");
	}

	List<Item> items = null;
	if (request.getAttribute("items") != null) {
		items = (List) request.getAttribute("items");
	}
	%>>

	<div>
		<h1>Our Branches</h1>
		<%
		if (branches != null) {
		%>
		<table border='1'>
			<tr>
				<th>Branch Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Address</th>
			</tr>

			<%
			for (Branch branch : branches) {
			%>
			<tr>
				<td><%=branch.getBranch_id()%></td>
				<td><%=branch.getName()%></td>
				<td><%=branch.getEmail()%></td>
				<td><%=branch.getPhone()%></td>
				<td><%=branch.getAddress()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		}
		%>
	</div>
	<br>
	<br>
	<div>
		<h1>Menu Items</h1>
		<%
		if (items != null) {
		%>
		<table border='1'>
			<tr>
				<th>Item Id</th>
				<th>Name</th>
				<th>Calories</th>
				<th>Price</th>
			</tr>

			<%
			for (Item item : items) {
			%>
			<tr>
				<td><%=item.getItem_id()%></td>
				<td><%=item.getName()%></td>
				<td><%=item.getCalories()%></td>
				<td><%=item.getPrice()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		}
		%>
	</div>

</body>
</html>
