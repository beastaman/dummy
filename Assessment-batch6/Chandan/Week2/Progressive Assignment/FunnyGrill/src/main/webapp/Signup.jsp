<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<%@ include file="meta/header.jsp"%>
</head>
<body>
	
	<%@ include file="meta/navbar.jsp" %>
	
	<%
		String message = "";
		if(request.getAttribute("message") != null){
			message = request.getAttribute("message").toString();
		}
	%>
	
	<div class="d-flex flex-row justify-content-center mt-5">
		<div class="card" style="width: 40em">
			<div class="card-header text-center h3 bg-primary text-white">
			    Create New Account
			  </div>
			
			<div class="card-body">
			<form action="Welcome" method="post">
				
				<div class="form-group">
					<label>First Name</label>
					<input class="form-control" type="text" placeholder="Bruce" name="fname" required>
				</div>
				<br>
				<div class="form-group">
					<label>Last Name</label>
					<input class="form-control" type="text" placeholder="Wayne" name="lname" required>
				</div>
				<br>
				<div class="form-group">
					<label>Phone Number</label>
					<input class="form-control" type="number" placeholder="1234567890" name="phone" required>
				</div>
				<br>
				<div class="form-group">
					<label>Email</label>
					<input class="form-control" type="email" placeholder="bruce.wayne@funnygrill.com" name="email" required>
				</div>
				<br>
				<div class="form-group">
					<label>Password</label>
					<input class="form-control" type="password" name="password" required>
				</div>
				<br>
				<p><%=message %></p>
				<input type="hidden" value="signup" name="h1">
				<input class="btn btn-primary" type="submit" value="Sign Up">
			</form>
			</div>
			
		</div>
	</div>
	
	<%@ include file="meta/footer.jsp"%>
</body>
</html>