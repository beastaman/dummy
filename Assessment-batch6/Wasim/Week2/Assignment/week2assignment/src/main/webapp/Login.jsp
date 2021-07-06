
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to Roster Restaurant Tracker</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<%
	
		String message = "";
		if (request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
		
	%>

	<div>
		<form action="LoginController" method="post">
			<br>
			<h2>Roster Restaurant</h2>
			<h4>Customer Login</h4>
			<br><%=message%><br>Email <input
				type="text" name="email" placeholder="email" required="required" />
			
			<br>
			<br> Password <input type="password" name="password"
				placeholder="password" required="required" /> <br>
			<br> <input style="background-color: #00ffff" type="submit" value="Login" />

		</form>


	</div>

		<style>

			div {
				text-align: center;
			}
			
			
			table {
				width: 50%;
				margin-left: auto;
				margin-right: auto;
			}
			
			th {
				background-color: #FF6347;
			}
			
			body {
				background-color: #F0F8FF;
			}
			
			
		</style>

</body>
</html>