<%@page import="com.sapient.entity.User"%>
<%@page import="com.sapient.entity.Table"%>
<%@page import="com.sapient.entity.Item"%>
<%@page import="java.util.List"%>
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
<title>Select Item</title>
</head>
<body>	

	<div>
	<br>
		<h2>Roster Restaurant</h2>
		<br>
	<%
		List<Item> items = null;
		List<Table> tables = null;
		if(request.getAttribute("items") != null) {
			items = (List<Item>) request.getAttribute("items");
		}
		
		if(request.getAttribute("tables") != null) {
			tables = (List<Table>) request.getAttribute("tables");
		}
				
		String orderType = null;
		HttpSession httpSession = request.getSession();
		User user = null;
		if(httpSession.getAttribute("user") != null) {
			user = (User)httpSession.getAttribute("user");
		}
		if(request.getAttribute("orderType") != null) {
			orderType = request.getAttribute("orderType").toString();
		}
				
	%>
	
	
	<form action="ItemController" method="post">
		
		<input type="submit" name="option" value="Book Table" style="background-color: #6495ed" > 
		<input type="submit" name="option" value="Pickup"  style="background-color: #6495ed" >
		<br><br>
		<%
			if(orderType != null && orderType.equals("Book Table")) {
				
		%>
				
				
				<table>
					
					<tr>
						<th>Price</th>
						<th>Status</th>
						<th>Select</th>
					</tr>
					
					<%
						for(Table table : tables) {
					%>
							
							<tr>
								<td><%= Integer.toString(table.getPrice()) %></td>
								<td><%= table.getStatus() %></td>
								<td><input type="radio" name="btnradio" value=" <%=table.getTid() %> "></td>
							</tr>
														
					<%
						}
					%>
					
					
				</table>
				<br>
				<input type="hidden" name="bookorpick" value="book">
				<input type="submit" value = "Book" style="background-color: #00ffff">
				
		<%
			}	
		
			else if(orderType != null && orderType.equals("Pickup")) {
				System.out.println("Pickup table creattion");
			
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
					<td><input name = "quantity_<%=item.getFid()%>"  type="number" step="1" min="0" value="0"></td>
				</tr>
				<%
					}
				%>
				
				
			</table>
			<br>
			<input type="submit" value ="Order" style="background-color: #00ffff">
			<input type="hidden" name="bookorpick" value="pick" >
		
		<%
			}
		%>
		
	</form>

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