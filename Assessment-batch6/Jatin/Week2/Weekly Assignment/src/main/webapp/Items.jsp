<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Branches</title>
</head>
<body>
	<%/*	List<Items> allItems=null;
		if(request.getAttribute("allItems") != null){
			allItems = (List<Items>) request.getAttribute("allItems"); 
		}
		*/
	%>
	<h1>Items</h1>
	<% //if(allbranches !=null) { 
	%>
		<form action='LoginController' method='post'>
			<input type='hidden' name='h1' value='branches'>
			<%// for(Items branch:allItems){ 
			%>
    		<br> <!-input type='submit' name='branch' value='<%=Items.getItemid()%>'-><%= //branch.getItemid()% >
			//<% }
			%>
		</form>
	<%// }
	%>
</body>
</html>