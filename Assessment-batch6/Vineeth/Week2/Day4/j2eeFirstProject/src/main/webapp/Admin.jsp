<%@page import="com.sapient.to.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<%
		String message = "";
		if(session.getAttribute("message") != null) {
			message = session.getAttribute("message").toString();
			session.setAttribute("message", "");
		}
		String tab = "dashboard";
		if(session.getAttribute("tab") != null)
			tab = session.getAttribute("tab").toString().toLowerCase();
		User user = (User) session.getAttribute("user");
	%>
	<h1>Admin : <%= user.getId() %></h1>
	
	<h6><%=message %></h6>
	
	<form action="LoginController" method="post">
		<input type="hidden" name="page" value="admin">
		<button type="submit" name="tab" value="displayStudents">Display Students</button>
		<button type="submit" name="tab" value="addStudentForm">Add Student</button>
	</form>
	
	<%
		if(tab.equalsIgnoreCase("displayStudents")) {
			List<Student> students = null;
			if(request.getSession().getAttribute("students") != null)
				students = (List<Student>) session.getAttribute("students");
	%>
			<h3>Students</h3>
			<table border=1>
				<tr>
					<th>Student ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>DOB</th>
					<th>Area</th>
				</tr>
				<%
					for(Student student : students) {
				%>
					<tr>
						<td><%=student.getId()%></td>
						<td><%=student.getFname()%></td>
						<td><%=student.getLname()%></td>
						<td><%=student.getDob()%></td>
						<td><%=student.getArea()%></td>
					</tr>
				<%
					}
				%>
			</table>
	<%
		}
		else if (tab.equalsIgnoreCase("addStudentForm")) {
	%>
			<h3>Add Student</h3>
			
			<form action="LoginController" method="post">
				<input type="hidden" name="page" value="admin">
				<br>Student ID <input type="text" name="id">
				<br>First Name <input type="text" name="fname">
				<br>Last Name <input type="text" name="lname">
				<br>DOB <input type="date" name="dob">
				<br>Area <input type="text" name="area">
				<button type="submit" name="tab" value="addStudent">Add</button>
			</form>
	<%
		}
		else {
	%>
			<h3>Dashboard</h3>
	<%
		}
	%>
</body>
</html>