<html>
<body>
	<%
	String message = "";
	if (request.getAttribute("message") != null) {
		message = request.getAttribute("message").toString();
	}
	%>
	<br>
	<center>
		<h1>Welcome!</h1>
		<h2>
			We are now in:
			<list>
			<li>Bangalore</li>
			<li>Delhi</li>
			<li>Gurgaon</li>
			</list>
		</h2>
		<br>
		<h2>
			Login
		</h2>
			<h3>
			<form action='LoginController' method='post'>
				<br>
				<%=message%><br> Username: <input type:"text" name="username" /><br>
				Password: <input type:"password" name="password" /><br> <input
					type='submit' name='button' value='Login'><input
					type='submit' name='button' value='SignUp'> <input
					type='hidden' name='page' value='Login'>
			</form>
			</h3>
	</center>
</body>
</html>
