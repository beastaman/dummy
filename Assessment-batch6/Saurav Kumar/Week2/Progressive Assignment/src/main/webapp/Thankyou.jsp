<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thankyou</title>
<link rel = "stylesheet" href="style.css">
</head>
<body>

	<%
		String choice = session.getAttribute("choice").toString();
	%> 

	<h1>Thankyou for ordering</h1>
	
	<form action = 'Controller' method = 'post'>
	
	<input type = 'hidden' name = 'page' value = 'thankyou'>
	<br><input type = 'submit' value = 'order again'> 
		
	</form>
	
	<%
		if(choice.equals("Book for home delivery")) {
	%>
		<form action = 'Controller' method = 'post'>
	
		<input type = 'hidden' name = 'page' value = 'status'>
		<br><input type = 'submit' value = 'check status'> 
		
		</form>
	<%
		}
	%>
	
</body>
</html>