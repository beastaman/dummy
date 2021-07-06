<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to the school application</title>
</head>
<body>
	
	<%
		String msg = "";
		if(request.getAttribute("msg")!=null){
			msg = request.getAttribute("msg").toString();
		}
	%>
	
	<form action='LoginController' method = 'post'>
		<h1>UCLA Login</h1>
		<br><%= msg %>
		<br>Enter user id <input type = 'text' name = 'userid' placeHolder = 'user id' required = 'required'></input>
		<br>Enter password <input type = 'password' name = 'password' required = 'required'></input>
		
		<br><input type = 'submit' value='Login'>
	</form>
	
</body>
</html>