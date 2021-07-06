<%@page import="com.to.Branch"%>
<%@page import="com.dao.BranchDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		BranchDao branchDao=new BranchDao();
		List<Branch> branches=branchDao.getAllBranch();
	%>
	<form action='CLoginController' method='post'>
		<h1> Restaurant Login</h1>
		<br> Enter user-name<input type='text' name='userid' placeHolder='userid' required='required'/>
		<br> Enter password<input type='password' name='password' required='required'/>
		<br> Enter branch id<input type='text' name='branchid' required='required'>
		<br> <input type='submit' value='Login'>
		
		<input type='hidden' name='h1' value='Login' >
	
	</form>
	<div>
		<h1>Our restaurant has the following branches</h1>
		<table border='1'>
				<tr>
					<th>Branch Id</th>
					<th>Location</th>
				</tr>
				<%
					for (Branch branch : branches) {
				%>
				<tr>
					<td><%=branch.getBranchid()%></td>
					<td><%=branch.getTables()%></td>
				</tr>
				<%
					}
				%>
		</table>
	</div>
</body>
</html>