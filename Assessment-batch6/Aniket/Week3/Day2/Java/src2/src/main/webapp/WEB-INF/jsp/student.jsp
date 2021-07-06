<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
	<c:forEach items="${users}" var="user" >
		<tr>
			<td><c:out value="${user.id}"/></td>
			<td><c:out value="${user.fname}"/></td>
			<td><c:out value="${user.lname}"/></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>