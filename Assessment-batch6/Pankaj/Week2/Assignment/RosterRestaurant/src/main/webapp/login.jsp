<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roster Login</title>
</head>
<body>

	<%
	String message = "";
	if (request.getAttribute("message") != null) {
		message = request.getAttribute("message").toString();
	}
	%>>
	<form action="LoginController" method="post">
		<h1>Roster Restaurant Login</h1>
		<br>
		<%=message%>><br><br> Enter customer id <input type='text' name='customer_id'
			required='required' /> <br> Enter password <input
			type="password" name='password' required='required' /> <br> <input
			type='submit' value='Login'> <input type='hidden' name='h1'
			value='Login'>
	</form>
</body>
</html>
