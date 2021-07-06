<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Customer Registration Page</h1>
  <form action="<%= request.getContextPath() %>/CustomerDetails" method="post">
   <table style="with: 80%">
    <tr>
     <td>Customer Id</td>
     <td><input type="text" name="cidc" /></td>
    </tr>
    <tr>
     <td>First Name</td>
     <td><input type="text" name="firstname" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lastname" /></td>
    </tr>
    <tr>
     <td>Phone Number</td>
     <td><input type="text" name="phoneNo" /></td>
    </tr>
    <tr>
     <td>City</td>
     <td><input type="text" name="city" /></td>
    </tr>
    <tr>
     <td>Date of Birth</td>
     <td><input type="text" name="dob" /></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><input type = "password" name ="password"/></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>