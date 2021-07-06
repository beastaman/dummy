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
		String message = "";
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
		
%>>

<form action = 'LoginController' method = 'post' > 
	
		<h1> Login </h1>
			
		<br> Enter user id <input type = 'text' name = 'userid' placeHolder = 'user id' required = 'required'/>
		<br> Enter user password <input type = 'password' name = 'userpassword' required = 'required'/>
		
		<br> <input type = 'submit' value = 'Login'>
		
		<br> <%= message %>>
		
		<input type= 'hidden' name = 'h1' value = 'Login'>  
		
	
	</form>>


</body>
</html>