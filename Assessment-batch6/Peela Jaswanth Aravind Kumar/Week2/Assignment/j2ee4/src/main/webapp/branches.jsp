<%@page import="com.to.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.to.User"%>
<%@page import="com.controller.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to school application</title>
</head>

<body>
	<h2>Click on the branch to book a table</h2>

	<form action = 'LoginController' method = 'post'>
		<input type = 'hidden' name = 'h1' value = 'branch'>
		<input type = 'submit' name = 'branchId' value = 'b1'>first branch<br>
		<input type = 'submit' name = 'branchId' value = 'b2'>second branch<br>
		<input type = 'submit' name = 'branchId' value = 'b3'>third branch<br>
		<input type = 'submit' name = 'branchId' value = 'b4'>fourth branch<br>
		<input type = 'submit' name = 'branchId' value = 'b5'>fifth branch<br>
		<input type = 'submit' name = 'branchId' value = 'b6'>sixth branch<br>		
	</form>
	
	
	
</body>

</html>