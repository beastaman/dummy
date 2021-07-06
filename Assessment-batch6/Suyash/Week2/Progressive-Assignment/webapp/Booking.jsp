<%@page import="com.to.Table"%>
<%@page import="com.dao.TableDao"%>
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
	List<Table> tables=(List<Table>)request.getAttribute("tables");
		String message="";
	if (request.getAttribute("message") != null) {
		message =(String) request.getAttribute("message");
	}
	%>
	
	<form action='CLoginController' method='post'>
		<h1>Welcome user-name</h1>
	<br> Enter user id<input type='text' name='userid' required='required'>
	<br> Enter branch id<input type='text' name='branchid' required='required'>
	<br> Please Enter time at which you will be visiting<input type='text' name='time' required='required'/>
	<br> <input type='submit' value='Booking'>
	<input type='hidden' name='h1' value='Booking' >
	
	
	</form>
	
	<div>
		<%=message%>
	</div>
</body>
</html>