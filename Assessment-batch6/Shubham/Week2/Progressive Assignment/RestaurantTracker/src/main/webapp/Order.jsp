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
<%
	List<FoodItems> fooditems = null;
		if (request.getAttribute("fooditems") != null) {
			System.out.println("Should print");
			fooditems = (List<FoodItems>) request.getAttribute("fooditems");
		}
		%>
		<center>
			<form action='LoginController' method='post'>
			
			<table border='1'>
			<tr>
			<th>Food name</th>
			<th>Price</th>
			<th>Quantity</th>
			</tr>
			<% 
			for(int i=0;i<fooditems.size();i++){
				%>		
			<tr>
			<td><%=fooditems.get(i).getName()%></td>
			<td><%=fooditems.get(i).getPrice()%></td>
			<td><input type="number" name="<%=i%>" value="0" /></td>
			</tr>
		
		
			<% } %>
			</table>
			<input type="submit" value="Order">
			<input type='hidden' name='page' value='Order'/>
			</form>
			</center>
</body>
</html>