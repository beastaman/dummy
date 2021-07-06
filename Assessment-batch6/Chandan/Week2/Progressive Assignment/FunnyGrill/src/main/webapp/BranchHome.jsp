<%@page import="com.to.TimeSlotsTO"%>
<%@page import="com.to.BranchTO"%>
<%@page import="java.util.List"%>
<%@page import="com.to.FoodItemTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FunnyGrill</title>
<%@ include file="meta/header.jsp"%>
</head>
<body>
	
	<%@ include file="meta/navbar.jsp" %>

	<%
	BranchTO branch = (BranchTO) request.getAttribute("branch");

	int orderType = 0;
	if (request.getAttribute("orderType") != null) {
		orderType = Integer.parseInt(request.getAttribute("orderType").toString());
	}
	%>
	
	<div class="container p-3 mt-3 d-flex flex-row-reverse justify-content-around">
	
		<div>
			<div class="card" style="width: 18rem;">
				<div class="card-header">
				    Contact of Branch
				  </div>
			  <div class="card-body">
			    <h6 class="card-subtitle mb-2 text-muted">Address</h6>
			    <p class="card-text">
				    <%=branch.getArea()%>, <%=branch.getCity()%>, <%=branch.getState()%>
			    </p>
			    <h6 class="card-subtitle mb-2 text-muted">Phone Number</h6>
			    <p class="card-text">
				    <%=branch.getPh_no()%>
			    </p>
			  </div>
			</div>
		</div>
		
		<div class="d-block w-50">
			<form action="Branch" method="post">
				
				<input type="hidden" value=<%=request.getParameter("id")%>
					name="branchId"> <input type="hidden" name="step" value="1">
				<div class="d-flex flex-row justify-content-around">
				<input class="btn btn-dark" type="submit" name="orderType" value="Book Table"> 
				<input class="btn btn-dark"
					type="submit" name="orderType" value="Order Parcel">
				</div>
			</form>
		
		
			<br>
		
			<%
			if (orderType == 1) {
			%>
		
			<form action="Branch" method="post" class="card p-4 bg-dark text-white">
				<div class="form-group row">
					<label class="col-sm-3">Enter Date</label>
					<div class="col-sm-6">
					<input class="form-control" type="date" name="dateTable" required> <br>
					</div>
				</div>
				<br>
				<div class="form-group row">
					<label class="col-sm-3">Select Time Slot</label>
				
				<div class="col-sm-6">
				 <select class="form-select" name="slot" required>
					<%
					if (request.getAttribute("timeSlots") != null) {
						List<TimeSlotsTO> timeSlots = (List<TimeSlotsTO>) request.getAttribute("timeSlots");
						for (TimeSlotsTO timeSlot : timeSlots) {
					%>
						<option value=<%=timeSlot.getId()%>>
							<%=timeSlot.getStart()%>
							to
							<%=timeSlot.getEnd()%>
						</option>
					<%
						}
					}
					%>
				</select>
				</div>
				</div>
		
				<br> 
				
				<input type="hidden" value=<%=request.getParameter("id")%>
					name="branchId"> <input type="hidden" name="step" value="2">
				<input class="btn btn-primary" type="submit" name="option" value="Book Table">
		
			</form>
		
			<%
			} else if (orderType == 2) {
			%>
		
			<form action="Branch" method="post" class="card p-4 bg-dark text-white">
				<table class="table table-dark table-striped">
					<tr>
						<th>Food</th>
						<th>Price</th>
						<th>Quantity</th>
					</tr>
		
					<%
					if (request.getAttribute("foodItems") != null) {
						List<FoodItemTO> foodItems = (List<FoodItemTO>) request.getAttribute("foodItems");
					%>
					<%
					for (FoodItemTO foodItem : foodItems) {
					%>
					<tr>
						<td><%=foodItem.getName()%></td>
						<td><%=foodItem.getPrice()%></td>
						<td><input class="form-control" type="number" value=0 step=1
							name="quantity_<%=foodItem.getId()%>" max=5 min=0></td>
					</tr>
					<%
					}
					%>
					<%
					}
					%>
				</table>
		
				<br> <input type="hidden" value=<%=request.getParameter("id")%>
					name="branchId"> <input type="hidden" name="step" value="2">
				<input class="btn btn-primary" type="submit" name="option" value="Order Parcel">
		
			</form>
		
			<%
			}
			%>
		</div>
	
	</div>
	
	


	



<%@ include file="meta/footer.jsp"%>
</body>
</html>