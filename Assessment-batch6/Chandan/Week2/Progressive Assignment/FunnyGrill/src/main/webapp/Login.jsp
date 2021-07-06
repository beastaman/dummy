<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
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
		    Log In
		  </div>
		  <div class="card-body">
		<form action="Welcome" method="post">
			<div class="form-group">
				<label>Email</label>
			<input class="form-control" type="email" placeholder="Email" name="email" required>
			</div>
			<br>
			<div class="form-group">
				<label>Password</label>
				<input class="form-control" type="password" name="password" required>
			</div>
			<br>
			
			<input type="hidden" value="login" name="h1">
			<%
				if(request.getParameter("redirect")!=null){
			%>
				<input type="hidden" value=<%=request.getParameter("redirect") %> name="redirect">
			<%
				}
			%>
			
			<p><%=message %></p>
			<input class="btn btn-primary" type="submit" value="Log In">
		</form>
		</div>
	</div>
	</div>
	
	
	<%@ include file="meta/footer.jsp"%>
</body>
</html>