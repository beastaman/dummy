<%@page import="com.to.Customer"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.List"%>
<%@page import="com.to.User"%>
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
		User user1 = (User) session.getAttribute("user");

		List<Customer> customers = null;

		if (request.getAttribute("customers") != null) {
			customers = (List<Customer>) request.getAttribute("customer");
		}
		int choice = 0;

		if (request.getAttribute("choice") != null) {
			choice = Integer.parseInt(request.getAttribute("choice").toString());
		}
		
		String message = null;
		
		if(request.getAttribute("message") != null) {
			message = request.getAttribute("message").toString();
		}
		
	%>

	<div>
		<h1>
			Admin :
			<%=user1.getUserId()%>
		</h1>
		<br>
		<form action='LoginController' method='post'>
			<input type='hidden' name='h1' value='Home'> <input
				type='submit' name='choice' value='1'> Display All Customers

			<br> <input type='submit' name='choice' value='2'>
			Insert Customers

		</form>

		<div>
			<%
				if (customers != null) {
			%>
			<table border='1'>
				<tr>
					<th>Student Id</th>
					<th>Student name</th>
					<th>Student DOB</th>
					<th>Student PhoneNo</th>
				</tr>

				<%
					for (Customer customer : customers) {
				%>
				<tr>
					<td><%=customer.getCid()%></td>
					<td><%=customer.getFirstname()%></td>
					<td><%=customer.getDob()%></td>
					<td><%=customer.getPhoneNo()%></td>
				</tr>
				<%
					}
				%>
			</table>
			<%
				}
			%>
			
			<%
				if(choice != 0) {
					
					
			%>
			
			<form action = 'LoginController' method='post'>
				<br> <h1>Enter new Student </h1>
				
				<br> Student id : <input type = 'text' name="sid" />
				<br> first name : <input type = 'text' name="fname" />
				<br> last name : <input type = 'text' name="lname" />
				<br> DOB : <input type = 'text' name="dob" />
				<br> Phone number : <input type = 'text' name="phoneNo" />
				<br> Address : <input type = 'text' name="area" />
				<input type = "hidden" name = 'h1' value = '3'>
				<input type ="submit" value = 'Insert' />
			</form>
			
			<%
				}
			%>

			<%
				if(message != null) {
						
				
			
			%>
			
			<h1><%= message %></h1>
				
			<%
				}
			%>
		</div>


	</div>






</body>
</html>