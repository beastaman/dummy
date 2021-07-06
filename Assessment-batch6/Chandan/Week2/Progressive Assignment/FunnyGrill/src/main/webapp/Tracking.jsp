<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tracking</title>
<%@ include file="meta/header.jsp"%>
</head>
<body>
	
	<%@ include file="meta/navbar.jsp" %>
	
	<%
	
	int trackChoice = 0;
	if(request.getAttribute("trackChoice")!=null){
		trackChoice = Integer.parseInt(request.getAttribute("trackChoice").toString());
	}
	
	%>
	
	
	<div class="container d-flex flex-column justify-content-around mt-5">
	
	
	
	<form action="tracking" method="post">
		<div class="d-flex flex-row justify-content-around">
		<input class="btn btn-dark" style="width: 20em" type="submit" name="trackChoice" value="Track Table Reserve"> 
		<input class="btn btn-dark" style="width: 20em" type="submit" name="trackChoice" value="Track Parcel Order">
		</div>
	</form>
	
	
	
	<%
	if(trackChoice==1){
	
	%>
	
	<table class="table mt-5">
		<tr>
			<th>Branch</th>
			<th>Reserved Date</th>
			<th>Reserved Time</th>
			<th>Status</th>
		</tr>
		
		<%
			if(request.getAttribute("tableHistory")!=null){
				List<String[]> tableHistory = (List<String[]>) request.getAttribute("tableHistory");
				
				for (String[] row: tableHistory){
					%>
					
					<tr>
						<td><%=row[0] %></td>
						<td><%=row[1] %></td>
						<td><%=row[2] %></td>
						<td><%=row[3] %></td>
					</tr>
					
					<%
				}
				
			}
		%>
	
	</table>
	
	<%	
	}
	else if(trackChoice==2)
	{
	%>
	
	<table class="table mt-5">
		<tr>
			<th>Branch</th>
			<th>Order Details</th>
			<th style="max-width: 40%">Ordered On</th>
			<th>Status</th>
		</tr>
		
		<%
			if(request.getAttribute("parcelHistory")!=null){
				List<String[]> parcelHistory = (List<String[]>) request.getAttribute("parcelHistory");
				
				for (String[] row: parcelHistory){
					%>
					
					<tr>
						<td><%=row[0] %></td>
						<td style="max-width: 20rem"><%=row[1] %></td>
						<td><%=row[2] %></td>
						<td><%=row[3] %></td>
					</tr>
					
					<%
				}
				
			}
		%>
	
	</table>
	
	<%
	}
	%>
	
	</div>
	
	
	
<%@ include file="meta/footer.jsp"%>
</body>
</html>