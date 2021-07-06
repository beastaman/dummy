<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href="style.css">
</head>
<body>

	<%
		String message = "";
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
	%>
	
	<form action = 'Controller' method = 'post'>
		<br> <h1>  Country Restaurant, Sign In </h1>
		<br> <%= message %> <br>
		Enter user id 
		<input type = 'text' name = 'userid' placeholder = 'userid' required = 'required'/>
		<br>
		Enter user password
		<input type = 'password' name = 'password' required = 'required'/>
		<br> <input type = 'submit' value = 'Login'>
		
		<input type = 'hidden' name = 'page' value = 'signin'>
		
	</form>	

</body>
</html>