<%@page import="java.util.Map"%>
<%@page import="com.sapient.entity.Table"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<div>
		<h2>Roster Restaurant</h2>
		<h3>Order Detalis</h3>
		<h5><%=new Date()%></h5>

		
		
		<%
			
		Table table = null;
		Map<String, String[]> itemsMap = null;
		
		if(session.getAttribute("table") != null) {
			table = (Table)session.getAttribute("table");
		}
		
		if(session.getAttribute("orderSummary") != null) {
			itemsMap = (Map)session.getAttribute("orderSummary");
		}
		
		Integer totalPrice = null;
		if(session.getAttribute("totalPrice") != null) {
			totalPrice = (Integer)session.getAttribute("totalPrice");
		}
		
		
	%>
		<br>
	<%
		if(table != null) {
				
		
	%>	
		<h3>Table Booked</h3>
		<table border="1">
			<tr>
				<th>Table booked</th>
				<th>Table price</th>
			</tr>
				
			<tr>
				<td><%= table.getTid() %></td>
				<td><%= table.getPrice() %></td>
			</tr>
			
			<tr bgcolor="#FFEBCD" style="font-weight: bold;">
				<td>Amount Paid: </td>
				<td><%= table.getPrice() %></td>
			</tr>
			
			
			</table>
			
			
	<%
	
		
		}
		
		else if(itemsMap != null) {
	%>
	
		<h3>Pickup Order</h3>
		
		<table border="1">
			<tr>
				<th>Item</th>
				<th>Quantity</th>
				<th>Price</th>
			</tr>
				
		
			<%
				int totalQty = 0;
				for(String id : itemsMap.keySet()) {
					if(itemsMap.get(id)[1].equals("0")) {
						continue;
					}
					
					totalQty += Integer.parseInt(itemsMap.get(id)[1]);
					
			%>	
				<tr>
					<td><%= itemsMap.get(id)[0] %></td>
					<td><%= itemsMap.get(id)[1] %></td>
					<td><%= itemsMap.get(id)[2] %></td>
				</tr>
			<%
				}
			%>
			<tr bgcolor="#FFEBCD" style="font-weight: bold;">
				<td>Total</td>
				<td><%= totalQty %></td>
				<td> <%= totalPrice %></td>
			</tr>
			
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