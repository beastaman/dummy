<%@page import="com.to.FoodItems"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>Final Order</h1>
	<%
	List<FoodItems> fooditems = null;
	List<Integer> quantity= null;
	int total=0;
		if (request.getAttribute("fooditems") != null) {
			fooditems = (List<FoodItems>) request.getAttribute("fooditems");
		}
		if (request.getAttribute("quantity") != null) {
			quantity = (List<Integer>) request.getAttribute("quantity");
		}
		if (request.getAttribute("total") != null) {
			total = (int) request.getAttribute("total");
		}
		%>
			<form action='LoginController' method='post'>
			
			<table border='1'>
			<tr>
			<th>Food name</th>
			<th>Quantity</th>
			<th>Price</th>
			</tr>
			<% 
			for(int i=0;i<fooditems.size();i++){
				if(quantity.get(i)!=0){
				%>		
			<tr>
			<td><%=fooditems.get(i).getName()%></td>
			<td><%=quantity.get(i)%></td>
			<td><%=Integer.toString(Integer.parseInt(fooditems.get(i).getPrice())*quantity.get(i))%></td>
			</tr>
			<%} } %>
			<tr>
			<td colspan='2'>Total</td>
			<td><%=total %></td>
			</tr>
			</table>
			<input type="submit" value="Place Order">
			<input type='hidden' name='page' value='FinalOrder'/>
			</form>
</center>
</body>
</html>