<%@page import="com.to.Customer"%>
<%@page import="java.util.*"%>
<%@page import="com.dao.BranchDAO"%>
<%@page import="com.to.Branch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Roster Restaurant</title>
</head>
<body>
	<%
		Customer customer =(Customer) session.getAttribute("customer");
	%>
	<h1> Roster Restaurant</h1>
	<div>
	<%
		if(customer == null)
		{
	%>
		<div>
			<a href="Login.jsp"> Sign-In </a>
			<a href="Signup.jsp" > Sign-Up </a>
		</div>
	<% 
		} else {  
	%>
		<div>
		<ul>
			<li><a href="Profile.jsp"><%= customer.getFirstName()%>  </a></li>
			<li><a href="Home.jsp"> LogOut </a></li>
		</ul>
		</div>
	<%
		}
	%>
	</div>
	<div>
			<table border='1'>
				<tr>
					<th>Branch Id</th>
					<th>Branch City</th>
					<th>Branch Contact</th>
					<th>Branch Address</th>
				</tr>

				<%
					List<Branch> branches = new BranchDAO().getAllBranches();
					for (Branch branch : branches) {
				%>
				<tr>
					<td><%= branch.getBranchId() %></td>
					<td><%= branch.getBranchCity() %></td>
					<td><%= branch.getBranchContact() %></td>
					<td><%= branch.getBranchAddress() %></td>
				</tr>
				<%
					}
				%>
			</table>
			
		</div>
</body>
</html>