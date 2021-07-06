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
	<h1>
		<%
		String date = (String)session.getAttribute("date");
		String guests = (String)session.getAttribute("guests");
		String branch = (String)session.getAttribute("branch");
		String option = (String)session.getAttribute("option");
		List<String> slots= null;
		if (session.getAttribute("slots") != null) {
			slots = (List<String>) session.getAttribute("slots");
		}
	%>
		Welcome to <%=branch%> branch <%=option %><br>
	</h1>

	<div>

		<form action='LoginController' method='post'>
			<br>
			<h1>Enter Booking Details</h1>
			<br> Date(YYYY/MM/DD) : <input type='text' name="date" placeholder="<%=date%>" /> 
			<br> No of Guests : <input type="number" name="guests" placeholder="<%=guests%>" /> 
			<input type="hidden" name='page' value='Booking'> <br>
			<input type="submit" name="sub" value='Search' /><br>
			<%if(slots!=null)
					{%>
			<select id="chooseslot" name="chooseslot">
				<%for(int i=0;i<slots.size();i++)
					{%>
				<option value="<%=slots.get(i)%>"><%=slots.get(i) %></option>

				<%} %>
			</select> <br>
			<input type="submit" name="sub" value='BOOK' />

			<%} %>
		</form>
	</div>
</body>
</html>