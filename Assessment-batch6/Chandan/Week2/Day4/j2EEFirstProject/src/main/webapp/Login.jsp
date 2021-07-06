<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to School Application</title>
</head>
<body>

	<%
		String msg = "";
		if(request.getAttribute("message") != null){
			msg = request.getAttribute("message").toString();
		}
	%>
	
	<h1>California University Login</h1>
	<br>
	<form action= LoginController method="post">
		Enter user id:
		<input type="text" name='userId' plceholder="User id" required="required" />
		Enter password:
		<input type="password" name='password' required="required" />
		<br>
		<input type="submit" value="Login" />
		
		<input type='hidden' name='h1' value='Login'>
	</form>
	<br>
	<%= msg %>
	
</body>
</html>