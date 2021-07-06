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
			<form action = 'Controller' method = 'post'>
				<br> <h1>Enter your Information</h1>
				<br>id : <input type = 'text' name = 'userid'/>
				<br>fname : <input type = 'text' name = 'fname'/>
				<br>lname : <input type = 'text' name = 'lname'/>
				<br>phone : <input type = 'text' name = 'phone'/>
				<br>password : <input type = 'text' name = 'password'/>
				<input type = 'hidden' name = 'page' value = 'signup'>
				<input type = 'submit' value = 'submit'/> 
				
			</form>
</body>
</html>