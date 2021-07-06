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
	<h1>Our Branch</h1>

	<table>
		<c:forEach items="${branches}" var="branch">
			<tr>
				<td><c:out value="${branch.branch_id}" /></td>
				<td><c:out value="${branch.name}" /></td>
				<td><c:out value="${branch.email}" /></td>
				<td><c:out value="${branch.phone}" /></td>
				<td><c:out value="${branch.address}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>