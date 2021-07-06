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
		if (request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
	%>

	
		<form action="LoginController" method="post">

			<h1>Roster Restaurant Tracker</h1>
			<br><%=message%><br>
			
			<br> Enter email 
			<input type="text" name="email" placeholder="email" required="required" /> 
			
			<br><br> Enter password
			
			<input type="password" name="password" placeholder="password" required="required" />
				
			<br><br> <input type="submit" value="Login" />
	
		</form>
		<br>
		<a href="/RosterRestaurant/SignupController">
    		<button>SIgn Up</button>
		</a>


</body>
</html>