<%@page import="com.to.Student"%>
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
		
		List<Student> students = null;
		
		if(request.getAttribute("students") != null){
			students = (List<Student>) request.getAttribute("students");
		}
		
		int choice = 0;
		if(request.getAttribute("choice") != null){
			
			choice = Integer.parseInt((request.getAttribute("choice").toString()));
			
		}
		
		
	%>
	
	
	<div>
		<h1> Admin : <%= user1.getUserId() %>> </h1>
		<br>
		<form action='LoginController' method='post'>
			
			<input type='hidden' name='h1' value='Home'>
			
			<input type='submit' name='choice' value='1'>
			Display all Students
			<br>
			
			<input type='submit' name='choice' value='2'> 
			Insert Students
			
		</form>
		
		
		<div>
			<%
				if(students !=null){
			%>
				<table border = '1'>
					<tr>
						<th>
							Student Id
						</th>
						<th>
							First Name
						</th>
						<th>
							Last Name
						</th>
						<th>
							Area
						</th>
						<th>
							DOB
						</th>
					</tr>
					
			<% 
					for(Student student: students){
			%>
						<tr>
							<td>
								<%= student.getId() %>
							</td>
							<td>
								<%= student.getFname() %>
							</td>
							<td>
								<%= student.getLname() %>
							</td>
							<td>
								<%= student.getArea() %>
							</td>
							<td>
								<%= student.getDob() %>
							</td>
						</tr>
			
			<% 
					}
			%>
			
					</table>
			
			<%
				}
			%>
				
				
			<%
				if(choice!=0){
			%>
				
				<form action = 'LoginController' method='post'>
					<br>
					<h1>Enter New Student</h1>
					<br>
					
					Student Id: <input type='text' name='sid'>
					Fname: <input type='text' name='fname'>
					Lname: <input type='text' name='lname'>
					Area: <input type='text' name='area'>
					DOB: <input type='text' name='dob'>
					
					<input type="hidden" name='h1' value='3'>
					<input type='submit' value='Insert'>
				</form>
			
			<%
				}
			%>
			
		</div>
		
		
		
		
	</div>
	
	
</body>
</html>