<%@page import="com.to.*"%>
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
		List<Table> orders = (List<Table>)session.getAttribute("orders");
		User user1 = (User) session.getAttribute("user");
				
		String message = null;
		
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
		
		String branchId = request.getAttribute("branchId");
		
	%>

	<div>
		<h1>
			Admin :
			<%=user1.getUserId()%>
		</h1>
		<br>
		

		<div>
			<%
				if (orders != null) {
			%>
			<table border='1'>
				<tr>
					<th>order ID</th>
					<th>user ID</th>
					<th>Branch ID</th>
					<th>Table ID</th>
					<th>Start Time</th>
					<th>End Time </th>
				</tr>

				<%
					for (Table order : orders) {
				%>
				<tr>
					<td><%=order.getUserId()%></td>
					<td><%=order.getBranchId()%></td>
					<td><%=order.getTableId()%></td>
					<td><%=order.getStartTime()%></td>
					<td><%=order.getEndTime()%></td>
				</tr>
				<%
					}
				%>
			</table>
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
		
		<form action = 'LoginController' method = 'post' >
			<input type = 'hidden' name = 'userId' value = <%=user1.getUserId()%> > 
			<br><input type = 'hidden' name = 'branchId' value = <%= branchId %> >
			<br><input type = 'text' name = 'tableId' />tableId
			<br><input type = 'text' name = 'startTime' />StartTime
			<br><input type = 'text' name = 'endTime' />endTime
			
			<br><input type = 'submit' name = 'h1' value = 'book' />
		</form>


	</div>






</body>
</html>