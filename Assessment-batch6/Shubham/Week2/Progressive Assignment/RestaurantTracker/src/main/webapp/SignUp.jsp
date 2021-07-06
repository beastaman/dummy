<%@page import="com.to.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
	<h1>SignUp Page</h1>
	<%
		int choice = 0;
		
		String message = null;
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
	%>
	<div>
		
		<br>
		<div>
			<form action = 'LoginController' method='post'>
				<br> <h1>Enter New User Details </h1>
				<br> Username : <input type = 'text' name="username" />
				<br> Password : <input type = 'password' name="password" />
				<br> first name : <input type = 'text' name="fname" />
				<br> last name : <input type = 'text' name="lname" />
				<br> Phone number : <input type = 'text' name="phoneno" />
				<input type = "hidden" name = 'page' value = 'SignUp'>
				<br><input type ="submit" value = 'Insert' />
			</form>
		</div>


	</div>
	
	
</body>
</html>