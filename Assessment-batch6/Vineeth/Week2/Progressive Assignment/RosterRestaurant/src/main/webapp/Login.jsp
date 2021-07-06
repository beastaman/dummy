<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<style>
	.bg {
		background-color: powderblue;
    	display: flex;
    	flex-direction: row;
    	justify-content: center;
	}
	.card {
		background-color: white;
	    padding: 10px;
	    border-radius: 5px;
	    margin-top: 10vw;
	}
	.form {
	    display: flex;
	    flex-direction: column;
	    width: 30vw;
	    max-width: 300px;
	}
</style>
<body class="bg">
	<%
		String path = "login";
		if(request.getAttribute("path") != null)
			path = (String) request.getAttribute("path");
		String message = "";
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
			request.setAttribute("message", "");
		}
	%>

	<div class="card">
		<form style="display: flex;" action="BranchController" method="get">
			<button style="width: 50%" type="submit" name="path" value="login">Login</button>
			<button style="width: 50%" type="submit" name="path" value="signup">Sign Up</button>
		</form>
		<form class="form" action="BranchController" method="post">
			<div><%= message %></div>
			
			<%
				if(path.equals("login")) {
			%>
				Email <input type="email" name="email" required> <br>
				Password <input type="password" name="password" required> <br>
				<button type="submit" name="path" value="login">Login</button>
			<%
				}
				else {
			%>
				Email <input type="email" name="email" required> <br>
				Password <input type="password" name="password" required> <br>
				Confirm Password <input type="password" name="comfirm-password" required> <br>
				First Name <input type="text" name="fname" required> <br>
				Last Name <input type="text" name="lname" required> <br>
				Phone <input type="text" name="phone" required> <br>
				<button type="submit" name="path" value="signup">Sign Up</button>
			<%
				}
			%>
		</form>
	</div>
</body>
</html>