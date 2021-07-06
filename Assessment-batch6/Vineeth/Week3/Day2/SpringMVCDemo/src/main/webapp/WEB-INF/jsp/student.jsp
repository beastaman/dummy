<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
<title>Spring MVC Demo</title>
</head>
<body>
<h3>Welcome to Spring MVC Demo</h3>
<h4>Student</h4>

<h5><c:out value="${student.id}" /></h5>
<h5><c:out value="${student.fname}" /> <c:out value="${student.lname}" /></h5>
<h6><c:out value="${student.dob}" /></h6>
<h6><c:out value="${student.area}" /></h6>

</body>
</html>
