<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 	String message="";
		if(request.getAttribute("message")!=null){
			message=request.getAttribute("message").toString();
		}
	%>
	<form action='LoginController' method='post'>
	<h1>School login</h1>
	<br> <%= message%>
	<br>Enter User id <input type='text' name='userid' placeholder='userid' required='required'/>
	<br>Enter password <input type='password' name='password' required='required'/>
	
	<br> <input type='submit' value='Login'>
	</form>
</body>
</html>