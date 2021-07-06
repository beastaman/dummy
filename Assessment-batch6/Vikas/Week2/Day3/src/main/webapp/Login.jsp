<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to University Application</title>
</head>
<body>

	<h1>California University Login</h1>
	
	<%
		String message = "";
		if(request.getAttribute("message")!=null) {
			message = request.getAttribute("message").toString();
		}
	%>
	
	
	<br><%=message %>>
		
	<form action = 'LoginController' method='POST'>
		<br> Enter userid <input type='text' name = 'userid' placeholder='userid' required='required' />
		<br> Enter password <input type='password' name = 'password' placeholder='password' required='required' />
		
		<br><input type='submit' value='Login'/>
	</form>


</body>
</html>