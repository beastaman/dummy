<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>Order Placed</h1>
	<%
	String status=null;
		if (request.getAttribute("status") != null) {
			status = (String) request.getAttribute("status");
		}
		%>
			<form action='LoginController' method='post'>
			
			<input type="submit" value="Referesh Status">
			<%if(status!=null){ %>
			Status: <%=status%>
			<%} %>
			<input type='hidden' name='page' value='OrderPlaced'/>
			</form>
</center>
</body>
</html>