<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List" %>
<%@page import="com.entity.Branches" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Branches</title>
</head>
<body>
	<%	List<Branches> allbranches=null;
		if(request.getAttribute("allbranches") != null){
			allbranches = (List<Branches>) request.getAttribute("allbranches"); 
		}
	%>
	<h1>Branches</h1>
	<% if(allbranches !=null) { 
	%>
		<form action='LoginController' method='post'>
			<input type='hidden' name='h1' value='branches'>
			<% for(Branches branch:allbranches){ 
			%>
    		<br> <input type='submit' name='branch' value='<%=branch.getBranchid()%>'><%=branch.getBranchName()%>
			<% }
			%>
		</form>
	<% }
	%>
</body>
</html>