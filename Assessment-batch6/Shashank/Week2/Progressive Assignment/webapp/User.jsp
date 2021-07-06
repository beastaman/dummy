<%@page import="com.to.*"%>
<%@page import="com.dao.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
</head>
<body>
On User

<%
		  User user =(User) session.getAttribute("user");
        BranchDao Dao = new BranchDao();
		List<Branch> branches = Dao.getAllBranch();
		
		List<Tables> tables = null;
		
		if(request.getAttribute("tables")!=null){
			tables = (List<Tables>)request.getAttribute("tables");
			
		}
		
		List<Service> services = null;
		
		if(request.getAttribute("services")!=null){
			services = (List<Service>)request.getAttribute("services");
			
		}
		
		
		int choice =0;
		if(request.getAttribute("choice")!=null){
			choice = Integer.parseInt(request.getAttribute("choice").toString());
		}
		String message=null;
		if(request.getAttribute("message")!=null){
			message = request.getAttribute("message").toString();
		}
		


%>


<div>
		
				<%-- 
				<h1>
					User:
					 <%= user.getUserid() %>
				</h1> 
				--%>
				
				<br>
				<form action='UserController' method='post'>
					<input type='hidden' name='h2' value="Home">
				
					
					
			       
					
					<input type='submit' name='choice' value='1'>Display My Tables<br><br>
				
					
					
					<input type='submit' name='choice' value='2'>Display My Order<br><br>
					<%-- 
					<input type='submit' name='choice' value='3'>Book Table in a restaurant<br><br>
				
					<input type='submit' name='choice' value='4'>Add Order for Delivery<br><br><br>
					--%>
					
					
					
					
				
				
				
				</form>
				
		
		
		
		<div>
					<% 
					if(branches!=null){ 
					
					%>
				<table border='1'>
				<tr>
					<th> Branch Id</th>
					
					<th> Branch Phone</th>
					<th> Branch address</th>
				</tr>
				<%
					for(Branch student: branches){
				%>
				<tr>
					<td> <%= student.getBid() %></td>
					
					<td> <%= student.getPhone() %></td>
					<td> <%= student.getArea() %></td>
				</tr>
				
				
					<%
						}
					%>
				
				  </table>
				 <%
					}
				%>
				</div>
				
				
				<div>
				<%----------------------- --%>
				<% 
					if(tables!=null){ 
					
					%>
				<table border='1'>
				<tr>
					<th> Table Id</th>
					<th> Branch Id</th>
					<th> Booking Id</th>
					<th> Table status</th>
				</tr>
				<%
					for(Tables student: tables){
				%>
				<tr>
					<td> <%= student.getTid() %></td>
					<td> <%= student.getBid() %></td>
					<td> <%= student.getBooked() %></td>
					<td> <%= student.getStatus() %></td>
				</tr>
				
				
					<%
						}
					%>
				
				  </table>
				 <%
					}
				%>
				</div>
				
				<div>
					<%----------------------- --%>
				<% 
					if(services!=null){ 
					
					%>
				<table border='1'>
				<tr>
					<th> Table Id</th>
					<th> Branch Id</th>
					<th> Booking Id</th>
					<th> Table status</th>
				</tr>
				<%
					for(Service student: services){
				%>
				<tr>
					<td> <%= student.getSid() %></td>
					<td> <%= student.getBid() %></td>
					<td> <%= student.getBooked() %></td>
					<td> <%= student.getStatus() %></td>
				</tr>
				
				
					<%
						}
					%>
				
				  </table>
				 <%
					}
				%>
				</div>
</div>				
</body>
</html>