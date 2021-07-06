<%@page import="com.to.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<h1>Restaurant Admin page</h1>


	<%
		  User user =(User) session.getAttribute("user");
		
		List<Customer> customers = null;
		
		if(request.getAttribute("customers")!=null){
			customers = (List<Customer>)request.getAttribute("customers");
			
		}
		
		List<Branch> branches = null;
		
		if(request.getAttribute("branches")!=null){
			branches = (List<Branch>)request.getAttribute("branches");
			
		}
		
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
		
				<%--- 
				<h1>
					Admin:
					 <%= user.getUserid() %>
				</h1> 
				--%>
				
				
				<br>
				<form action='LoginController' method='post'>
					<input type='hidden' name='h1' value="Home">
				
					<input type='submit' name='choice' value='1'>Display All Customer<br><br>
				
					<input type='submit' name='choice' value='2'>Insert Customer<br><br>
					
					<input type='submit' name='choice' value='3'>Display All Branches<br><br>
				
					<input type='submit' name='choice' value='4'>Insert Branches<br><br>
					
					<input type='submit' name='choice' value='5'>Display All Tables of restaurant<br><br>
				
					<input type='submit' name='choice' value='6'>Insert Table in a restaurant<br><br>
					
					<input type='submit' name='choice' value='7'>Display All Services<br><br>
				
					<input type='submit' name='choice' value='8'>Insert Service<br><br><br>
					
					
					
					
				
				
				
				</form>
		
		<div>
					<% 
					if(customers!=null){ 
					
					%>
				<table border='1'>
				<tr>
					<th> Customer Id</th>
					<th> Customer name</th>
					<th> Customer Phone</th>
					<th> Customer area</th>
				</tr>
				<%
					for(Customer student: customers){
				%>
				<tr>
					<td> <%= student.getCid() %></td>
					<td> <%= student.getFname() %></td>
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
				
				<% 
					if(choice==2){
				%>
					<form action ='LoginController' method='post'>
					<br><h1> Enter new Customer</h1>
					
					<br> Customer id : <input type='text' name='cid'>
					<br> First Name: <input type='text' name='fname'>
					<br> Last Name : <input type='text' name='lname'>
					<br> Phone No. : <input type='text' name='phone'>
					<br> Address : <input type='text' name='area'>
					<br>  <input type='submit' value='insert'>
					
					<input type='hidden' name='h1' value='2'>
					
					</form>
				<%
				
					}
				%>	
				
				
				
				
				<%----------------------- --%>
				<% 
					if(branches!=null){ 
					
					%>
				<table border='1'>
				<tr>
					<th> Branch Id</th>
					<th> Branch Manager</th>
					<th> Branch Phone No.</th>
					<th> Branch address</th>
				</tr>
				<%
					for(Branch student: branches){
				%>
				<tr>
					<td> <%= student.getBid() %></td>
					<td> <%= student.getBmanager() %></td>
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
				
				<% 
					if(choice==4){
				%>
					<form action ='LoginController' method='post'>
					<br><h1> Enter new Branch</h1>
					
					<br> Branch id : <input type='text' name='bid'>
					<br> Branch manager: <input type='text' name='bmanager'>
					
					<br> Phone No. : <input type='text' name='phone'>
					<br> Address : <input type='text' name='area'>
					<br>  <input type='submit' value='insert'>
					
					<input type='hidden' name='h1' value='4'>
					
					</form>
				<%
				
					}
				%>	
				
				
				
				
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
				
				<% 
					if(choice==6){
				%>
					<form action ='LoginController' method='post'>
					<br><h1> Enter new Table</h1>
					
					<br> Table id : <input type='text' name='tid'>
					<br> Branch Id: <input type='text' name='bid'>
					
					<br> Booking Id : <input type='text' name='booked'>
					<br> Status : <input type='text' name='status'>
					<br>  <input type='submit' value='insert'>
					
					<input type='hidden' name='h1' value='6'>
					
					</form>
				<%
				
					}
				%>	
				
				
				
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
				
				<% 
					if(choice==8){
				%>
					<form action ='LoginController' method='post'>
					<br><h1> Enter new Table</h1>
					
					<br> Service id : <input type='text' name='sid'>
					<br> Branch Id: <input type='text' name='bid'>
					
					<br> Booking Id : <input type='text' name='booked'>
					<br> Status : <input type='text' name='status'>
					<br>  <input type='submit' value='insert'>
					
					<input type='hidden' name='h1' value='8'>
					
					</form>
				<%
				
					}
				%>
				
				
				
				
				
				<%
					if(message!=null){
				%>
				<h1><%= message %></h1>
				
				<%
				}
				%>
		</div>
	</div>

	

</body>
</html>
