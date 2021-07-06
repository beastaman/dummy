<%@page import="com.to.Branch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to The Restaurant</title>
</head>
<body>
	
	<%
	
	List<Branch> branches = null;
	
	if (request.getAttribute("branches") != null) {
		branches = (List<Branch>) request.getAttribute("branches");
		//System.out.println("helooo from login");
	}
	if(branches == null){
		System.out.println("helooo from login");
	}
		String message = "";
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
		int choice = 0;
		if (request.getAttribute("choice") != null) {
			choice = Integer.parseInt(request.getAttribute("choice").toString());
		}
		
		
	%>
	
	
	<form action = 'LoginController' method = 'post' > 
	
		<h1> FireFly </h1>
		<br> <%= message %>>	
		<br> Enter email id <input type = 'text' name = 'email' placeHolder = 'email id' required = 'required'/>
		<br> Enter password <input type = 'password' name = 'password' required = 'required'/>
		
		<br> <input type = 'submit' value = 'Login'>
		
		<input type= 'hidden' name = 'h1' value = 'Login'>  
	
	</form>>
	<div>
	<form action='LoginController' method='post'>
		<br> <input type='submit' name='h1' value='Create'>
			Create Account
			</form>
	</div>
	<%
	if(choice !=0){
	%>
	<form action ='LoginController' method ='post'>
	<br> <h1>Enter new Customer </h1>
				
				
				<br> Name : <input type = 'text' name="customerName" />
				<br> Phone Number : <input type = 'text' name="customerNumber" />
				<br> Address : <input type = 'text' name="customerAddress" />
				<br> Email : <input type = 'text' name="email" />
				<br> Password : <input type = 'text' name="password" />
				<input type = "hidden" name = 'h1' value = '3'>
				<input type ="submit" value = 'Insert' />
	</form> 
	<%
	}
	%>
	<form action ='LoginController' method = 'post'>
	<br> <h1>Show Branches of FireFly </h1>
	<br> <input type='submit' name='h1' value='ShowBranch'>
	</form>
	<div>
			<%
				if (branches != null) {
			%>
			<table border='1'>
				<tr>
					<th>Branch Name</th>
					<th>Branch PhoneNumber</th>
				</tr>

				<%
					for (Branch branch: branches) {
				%>
				<tr>
					<td><%=branch.getBranch_name()%></td>
					<td><%=branch.getBranch_number()%></td>
					
				</tr>
				<%
					}
				%>
			</table>
			<%
				}
			%>
			</div>
			

</body>
</html>