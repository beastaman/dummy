<%@page import="com.to.Customer"%>
<%@page import="com.to.Branch"%>
<%@page import= "java.sql.*"%>
<%@page import="java.util.List"%>
<%@page import="com.to.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Restaurant Landing Page</title>
<style>
	h1 {text-align: center;}
	.register{float:right;}
	.login{float:right;}
	
</style>

<link rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous" href="css/style.css">
</head>
<body padding="5">

<h1> Restaurant Landing Page </h1>
<form action="Login.jsp">
<input type="submit" class="login" value='Login'>
</form>

<form action="Register.jsp">
<input type="submit" class="register" value='Register'>
</form>

	<%
String id = request.getParameter("userId");
String driverName = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "restaurant";
String userId = "root";
String password = "root";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Show Branches Available</strong></font></h2>
<table  cellspacing="5" border="2" padding="5" class="table table-hover">
<thead>
    <tr class="table-warning">
      
      <th scope="col">Branch Id</th>
      <th scope="col">City</th>
      
    </tr>
  </thead>
  
 <tbody>
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT bid, city FROM branch";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr class="table-danger">

<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</tbody>
</table>
	

</body>
</html>

<!-- 
align="center" 
bgcolor="#DEB887"
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">Handle</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td>Larry</td>
      <td>the Bird</td>
      <td>@twitter</td>
    </tr>
  </tbody>
</table>
 -->