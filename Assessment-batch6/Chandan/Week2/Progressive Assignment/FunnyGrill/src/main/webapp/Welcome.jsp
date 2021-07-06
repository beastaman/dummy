<%@page import="com.to.BranchTO"%>
<%@page import="java.util.List"%>
<%@page import="com.to.CustomerTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<%@ include file="meta/header.jsp"%>
</head>
<body>


	<%@ include file="meta/navbar.jsp" %>
	
	
	<div class="container p-3 mt-5">
		<h1 class="display-5 text-center">Where We Serve</h1>

		<%
		if (request.getAttribute("branches") != null) {
	
			List<BranchTO> branches = (List<BranchTO>) request.getAttribute("branches");
		%>
		
		<div class="d-flex justify-content-center mt-4">
		<div class="list-group w-50">
	
			<%
			for (BranchTO branch : branches) {
			%>
	
			<a class="list-group-item list-group-item-primary list-group-item-action text-center" 
			href="/FunnyGrill/Branch?id=<%=branch.getId()%>"> <%=branch.getArea()%>,
					<%=branch.getCity()%>, <%=branch.getState()%>
			</a>
	
			<%
			}
			%>
	
		</div>
		</div>
	
		<%
		}
		%>
	</div>


	<%@ include file="meta/footer.jsp"%>
</body>
</html>