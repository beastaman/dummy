<%@page import="com.sapient.entity.Item"%>
<%@page import="java.util.List"%>
<%@page import="com.sapient.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>


	<h1>Item page</h1>

	<%
			List<Item> items = null;
	
			if (request.getAttribute("items") != null) {
				items = (List<Item>) request.getAttribute("items");
			}
	%>


	<%
			if(items != null) {
		%>


	<table border="1" style="width: 50%">
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
		</tr>

		<%
					for(Item item : items) {
				%>
		<tr>
			<td><%= item.getName() %></td>
			<td><%= item.getPrice() %></td>
			<td><input type="number" step="1" min="0" value="0"></td>
		</tr>
		<%
					}
				%>


	</table>

	<%
			}
		%>

	<form action="ItemController" method="post">

		<br>
		<br>
		<input type="submit" name="option" value="Book Table"> <input
			type="submit" name="option" value="Pickup">

	</form>
</body>
</html>