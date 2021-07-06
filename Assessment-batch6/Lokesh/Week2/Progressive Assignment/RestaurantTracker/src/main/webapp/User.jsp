<%@page import="com.to.Table"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
<%
	
	List<Table> tables = null;
	
	if (request.getAttribute("tables") != null) {
		tables = (List<Table>) request.getAttribute("tables");
		//System.out.println("helooo from login");
	}
	List<Table> reserve = null;
	if(request.getAttribute("reserve")!= null){
		reserve = (List<Table>) request.getAttribute("reserve");
	}
	

%>

<h1>USER PAGE</h1>

<form action = 'UserController' method = 'post'>
<br> <h2>SHOW ALL TABLES</h2>
<input type = 'submit' name = 'h2' value='showtable'> Show
 
</form>
<div>
			<%
				if (tables != null) {
			%>
			<table border='1'>
				<tr>
					<th>Table Branch</th>
					<th>Table Status</th>
					<th>Table Price</th>
					<th>Table Seating </th>
				</tr>

				<%
					for (Table table: tables) {
				%>
				<tr>
					<td><%=table.getBranch_id()%></td>
					<td><%=table.getStatus()%></td>
					<td><%=table.getPrice()%></td>
					<td><%=table.getSeat()%></td>
					
				</tr>
				<%
					}
				%>
			</table>
			<%
				}
			%>
</div>
<form action = 'ReserveController' method = 'post'>
<br> <h2>RESERVE TABLE</h2>
<input type = 'submit' name = 'h3' value='reservetable'> Reserve
 
</form>
<div>
			<%
				if (reserve != null) {
			%>
			<table border='1'>
				<tr>
					<th>Table Branch</th>
					<th>Table Status</th>
					<th>Table Price</th>
					<th>Table Seating </th>
				</tr>

				<%
					for (Table r: reserve) {
				%>
				
				<tr>
					<td><%=r.getBranch_id()%></td> 
					<td><%=r.getStatus()%></td> 
					<td><%=r.getPrice()%></td> 
					<td><%=r.getSeat()%></td> 
					
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