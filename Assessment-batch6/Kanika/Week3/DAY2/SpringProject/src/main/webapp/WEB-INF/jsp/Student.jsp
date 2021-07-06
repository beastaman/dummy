<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table>
		<c:forEach items="${students}" var="student">
			
			<tr>
				<td><c:out value="${student.id}"></c:out></td>
				<td><c:out value="${student.fname}"></c:out></td>
				<td><c:out value="${student.dob}"></c:out></td>
			</tr>
			
		</c:forEach>
	</table>
	
</body>
</html>