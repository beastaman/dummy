<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<a href="saveproduct">click here</a>

</head>
<body>
	<h1>List of students</h1>
	<%-- 
	<table>
		<c:forEach items="${users}" var="user">
		<tr>
			<td><c:out value="${user.id}"/></td>
			<td><c:out value="${user.fname}"/></td>
			<td><c:out value="${user.dob}"/></td>
		</tr>
	</table> --%>
	
	<ul>
		<c:forEach items="${users}" var="user">
			<li>${user.fname}</li>
		</c:forEach>
	</ul>
	
</body>
</html>