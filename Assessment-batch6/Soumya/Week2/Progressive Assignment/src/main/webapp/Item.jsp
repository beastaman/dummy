<%@page import="com.sapient.entity.Table"%>
<%@page import="com.sapient.entity.Item"%>
<%@page import="java.util.*"%>
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
		List<Item> items = null;
		List<Table> tables = null;
		if(request.getAttribute("items") != null) {
			items = (List<Item>) request.getAttribute("items");
		}
		
		if(request.getAttribute("tables") != null) {
			tables = (List<Table>) request.getAttribute("tables");
		}
				
		String orderType = null;
		
		if(request.getAttribute("orderType") != null) {
			orderType = request.getAttribute("orderType").toString();
		}
				
	%>

	<form action="ItemController" method="post">
		
		<input type="submit" name="option" value="Book Table"> 
		<input type="submit" name="option" value="Pickup">
		
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
				<input type="hidden" name="bookorpick" value="book">
				<input type="submit" value = "Book">
				
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
			
			<input type="submit" value ="Order">
			<input type="hidden" name="bookorpick" value="pick">
		
		<%
			}
		%>
		
	</form>
	
</body>
</html>