<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to school application</title>
</head>
<body>
	<%
		String msg = "";
		if(request.getAttribute("msg")!=null){
			msg = request.getAttribute("msg").toString();
		}
	%>
	<form action="LoginController" method="post">
		<h1>Roster Restaurant Login</h1>
		<br><%= msg %>
		<br> Enter Email <input type="email" name="email" placeholder="enter your mail" required />
		<br> Enter Password <input type="password" name="password" placeholder="enter your password" required />
		<br><input type="submit" value="Login">
		<input type="hidden"  name="login" value="Login" >
	</form>
</body>
</html>