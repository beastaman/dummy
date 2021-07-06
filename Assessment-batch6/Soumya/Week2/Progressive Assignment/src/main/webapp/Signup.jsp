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
	String message = null;
	
	if(request.getAttribute("message") != null) {
		message = request.getAttribute("message").toString();
	}
	%>

	<form action = 'SignupController' method='post'>
		<br> <h1>Enter new Student </h1>
		
		<br> User id : <input type = 'text' name="uid" />
		<br> first name : <input type = 'text' name="fname" />
		<br> last name : <input type = 'text' name="lname" />
		<br> Email : <input type = 'text' name="email" />
		<br> Password : <input type = 'text' name="password" />
		<input type ="submit" value = 'Insert' />
	</form>
	
	<%
				if(message != null) {
						
				
			
			%>
			
			<h1><%= message %></h1>
				
			<%
				}
			%>
</body>
</html>