<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
<title>Spring MVC Demo</title>
</head>
<body>
<h2>Hello World!</h2>
<h3>Welcome to Spring MVC Demo</h3>
<h4>Students</h4>

	<a href="./addstudent">
		<button type="button">Add Student</button>
	</a>

	<table border=1>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>DOB</th>
			<th>Area</th>
			<th>View</th>
			<th>Delete</th>
		</tr>
		
	    <c:forEach items="${students}" var="student">
	        <tr>
	            <td><c:out value="${student.id}" /></td>
	            <td><c:out value="${student.fname}" /></td>
	            <td><c:out value="${student.lname}" /></td>
	            <td><c:out value="${student.dob}" /></td>
	            <td><c:out value="${student.area}" /></td>
	            <td><a href="./students/<c:out value="${student.id}" />">View</a></td>
	            <td>
	            	<form action="./students/<c:out value="${student.id}" />" method="post">
	            		<input type="submit" value="Delete">
	            	</form>
	            </td>
	        </tr>
	    </c:forEach>
	</table>
</body>
</html>
