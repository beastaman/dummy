<%@page import="java.util.*"%>
<%@page import="com.sapient.entity.Table"%>
<%@page import="java.awt.print.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill summary</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

	
</head>
<body>

	<div>
	<br>
	<h2>Roster Restaurant</h2>
		<h3>Bill Summary</h3>
		<br>
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
		
	<form action="ConfirmationController" method="post">
	<%
		if(table != null) {
				
	
	%>
		<table border="1">
			<tr>
				<th>Table booked</th>
				<th>Table price</th>
			</tr>
				
			<tr>
				<td><%= table.getTid() %></td>
				<td><%= table.getPrice() %></td>
			</tr>
			
			
			<tr bgcolor="#FFEBCD" style="font-weight: bold";>
				<td>Total Amount: </td>
				<td><%= table.getPrice() %></td>
			</tr>
			
			</table>
			<br>
			<input type="submit" name = "confirmTableBooking" value = "Order" style="background-color: #00ffff"/>
			
	<%
	
		
		}
		
		else if(itemsMap != null) {
	%>
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
			<tr bgcolor="#FFEBCD" style="font-weight: bold";>
				<td>Total</td>
				<td><%= totalQty %></td>
				<td> <%= totalPrice %></td>
			</tr>
			
		</table>
		<br>
		<input type="submit" name = "confirmOnlineBooking" value = "Order" style="background-color: #00ffff"/>
				
		
					
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