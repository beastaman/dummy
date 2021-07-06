<%@page import="java.util.*"%>
<%@page import="com.sapient.entity.Table"%>
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
			
		Table table = null;
		Map<String, String[]> itemsMap = null;
		
		if(request.getAttribute("table") != null) {
			table = (Table)request.getAttribute("table");
		}
		
		if(request.getAttribute("orderSummary") != null) {
			itemsMap = (Map)request.getAttribute("orderSummary");
		}
	
		
	%>
	
	I am here
	<%
		if(table != null) {
		
	
	%>
		<%= table %>		
	
	<%
		}
		
		else if(itemsMap != null) {
			for(String id : itemsMap.keySet()) {
	%>
			
		<%= id %> <%= Arrays.toString(itemsMap.get(id)) %>
		
	<%
			}
		}
	%>
</body>
</html>