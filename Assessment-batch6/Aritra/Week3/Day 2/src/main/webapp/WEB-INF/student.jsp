<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h1>Next page</h1>
	<table>
		<c:forEach items="${students}" var="students">
			<tr>
				<td><c:out value="${students.id}" /></td>
				<td><c:out value="${students.fname}" /></td>
				<td><c:out value="${students.dob}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>