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
		<h1>Sapient Login</h1>
		<br><%= msg %>
		<br> Enter User id <input type="text" name="userid" placeholder="enter user id" required />
		<br> Enter User Password <input type="password" name="password" placeholder="enter password" required />
		<br><input type="submit" value="Login">
	</form>
</body>
</html>