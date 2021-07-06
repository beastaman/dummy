<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<%@ include file="meta/header.jsp"%>
</head>
<body>

	<%@ include file="meta/navbar.jsp" %>
	
	<div class="d-flex flex-row justify-content-center mt-5">
		<div class="card" style="width: 40em">
			<div class="card-header text-center h3 bg-primary text-white">
			    Your Details
			  </div>
			
			<div class="card-body">
				
				
				<table class="table">
					<tr>
						<td>First Name</td>
						<td><%=customer.getFname() %></td>
					</tr>
							<tr>
						<td>Last Name</td>
						<td><%=customer.getLname() %></td>
					</tr>
							<tr>
						<td>Email</td>
						<td><%=customer.getEmail() %></td>
					</tr>
							<tr>
						<td>Phone Number</td>
						<td><%=customer.getPhNo() %></td>
					</tr>
					
					
				</table>
				
				<form action="Customer" method="post">
					<input class="btn btn-dark" type="submit" name="button" value="Logout">
				</form>
				
			</div>
			
			
			
		</div>
	</div>
	
	
	
	
	<%@ include file="meta/footer.jsp"%>

</body>
</html>