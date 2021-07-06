<%@page import="com.to.CustomerTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%
CustomerTO customer = null;

if(request.getAttribute("loggedIn")!=null){
	if (request.getAttribute("loggedIn").equals(true)) {
		customer = (CustomerTO) request.getSession().getAttribute("customer");
	}
}
%>

<nav class="navbar navbar-light bg-light">
	<div class="container">
		<a class="navbar-brand text-primary" href="/FunnyGrill/Welcome"><strong>FunnyGrill</strong></a>

		<div class="navbar-nav">
			<a class="nav-link" href="/FunnyGrill/Welcome">Home</a>

			<%
			if (customer == null) {
			%>
			<a class="nav-link" href="Signup.jsp">Sign Up</a> <a class="nav-link"
				href="Login.jsp">Login</a>
			<%
			} else {
			%>

			<a class="nav-link" href="/FunnyGrill/tracking">Tracking Service</a>

			<a class="nav-link text-dark"
				href="/FunnyGrill/Customer"> <%=customer.getFname()%>
				<%=customer.getLname()%>
			</a>

			<%
			}
			%>


		</div>
	</div>

</nav>
