<%--
  Created by IntelliJ IDEA.
  User: aniket
  Date: 06-07-2021
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.id}"/></td>
            <td><c:out value="${user.fname}"/></td>
            <td><c:out value="${user.lname}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
