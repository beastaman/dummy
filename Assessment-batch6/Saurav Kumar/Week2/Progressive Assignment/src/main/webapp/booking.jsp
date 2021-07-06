<%@page import="com.to.User"%>
<%@page import="com.to.Item"%>
<%@page import="java.util.List"%>
<%@page import="com.to.Branch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking</title>
<link rel = "stylesheet" href="style.css">
</head>
<body>

	<%
		Branch branch = (Branch)request.getAttribute("branch");
		List<Item> items = (List<Item>)request.getAttribute("items");
	%>
	
	
	<div>
		<h1> Country Restaurant, <%= branch.getLocation() %></h1>
		<h2>Do your booking!</h2>
		<h2>Tables available : <%= branch.getAvailable() %></h2>
		<h2>Menu</h2>
		
		<form action = 'Controller' method = 'post'>
			<table border = '1'>
				
				<%
					for(Item item:items) {
						
				%>
				
				<tr> 
				<td> <%= item.getName() %> </td>
				<td> <%= item.getPrice() %> </td>
				<%-- <td> <input type = 'text' name = '<%= item.getName() %>' value = '0'></td> --%>
				</tr> 
				
				<%
					}
				%>
				
				</table>
				
				<input type = 'hidden' name = 'page' value = 'booking'>
				<input type = 'hidden' name = 'branch' value = '<%= branch.getLocation() %>'>
				<input type = 'submit' name = 'choice' value = 'Book Table'> 
				<input type = 'submit' name = 'choice' value = 'Book for home delivery'> 
		</form>
		
	</div>
</body>
</html>