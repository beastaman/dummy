<%@page import="com.to.Table"%>
<%@page import="com.to.Branch"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.CustomerDao"%>
<%@page import="com.to.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available table and branches</title>
</head>
<body>
<%
	Customer customer1 = (Customer) session.getAttribute("customer");
	List<Branch> branchs = null;
	if (request.getAttribute("branchs") != null) {
		branchs = (List<Branch>) request.getAttribute("branchs");
	}
	List<Table> tables = null;
	if (request.getAttribute("tables") != null) {
		tables = (List<Table>) request.getAttribute("tables");
	}
	int choice=0;
	if (request.getAttribute("choice") != null) {
		choice = Integer.parseInt(request.getAttribute("choice").toString());
	}
	String message = null;
	
	if(request.getAttribute("message") != null) {
		message = request.getAttribute("message").toString();
	}
%>
<div>
	<h1>
		Hello <%=customer1.getFname() %> <%=customer1.getLname() %> <br>
	</h1>
	<form action='LogController' method ='post'>
		<input type='hidden' name='h1' value='Home'> 
		<input	type='submit' name='choice' value='1'> Display all available branches
		<br> <input type='submit' name='choice' value='2'> Display all available tables
		<br> <input type='submit' name='choice' value='3'> Place a table order
		<br> <input type='submit' name='choice' value='4'> Place a parcel order
	</form>
	<div>
		<%
			if(branchs != null){
		%>
			<table border='1'>
				<tr>
					<th>Branch Location</th>
					<th>Branch Contact</th>
					<th>Branch Id</th>
				</tr>

				<%
					for (Branch branch : branchs) {
				%>
				<tr>
					<td><%=branch.getLocation()%></td>
					<td><%=branch.getContact()%></td>
					<td><%=branch.getBranchid()%></td>
				</tr>
				<%
					}
				%>
			</table>
		<%
			}
		%>
		
	</div>
	<div>
		<%
			if(tables != null){
		%>
			<table border='1'>
				<tr>
					<th>Table id</th>
					<th>Table Status</th>
					<th>Branch Id</th>
				</tr>

				<%
					for (Table table : tables) {
				%>
				<tr>
					<td><%=table.getTableid()%></td>
					<td><%=table.getTablestatus()%></td>
					<td><%=table.getBranchid()%></td>
				</tr>
				<%
					}
				%>
			</table>
		<%
			}
		%>
		<%
				if(choice == 100) {
					
					
			%>
			
			<form action = 'LogController' method='post'>
				<br> <h1>Enter Table Order details: </h1>
				
				<br> Customer Id : <input type = 'text' name="cid" />
				<br> Branch Id : <input type = 'text' name="bname" />
				<br> Table Id : <input type = 'text' name="tableid" />
				<input type = "hidden" name = 'h1' value = 'TableOrder'>
				<input type ="submit" value = 'Insert' />
			</form>
			
			<%
				}
			%>

			
			<%
				if(choice == 102) {
					
					
			%>
			
			<form action = 'LogController' method='post'>
				<br> <h1>Enter Parcel Order details: </h1>
				
				<br> Customer Id : <input type = 'text' name="cid" />
				<br> Branch Id : <input type = 'text' name="bname" />
				<input type = "hidden" name = 'h1' value = 'ParcelOrder'>
				<input type ="submit" value = 'Insert' />
			</form>
			
			<%
				}
			%>

			<%
				if(message != null) {
						
				
			
			%>
			
			<h1><%= message %></h1>
				
			<%
				}
			%>
	</div>
</div>
</body>
</html>