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

		<h1>Delete Student</h1>
		<br />
		<form action="delete" method="post" modelAttribute="student">

			<table border="0" cellpadding="10">
				<tr>
					<td>Student id:</td>
					<td><input type="text" name="id" /></td>
				</tr>

				<input type="hidden" name="fname" value="1" />
				<input type="hidden" name="lname" value="1" />
				<input type="hidden" name="dob" value="1" />
				<input type="hidden" name="area" value="1" />
				<input type="hidden" name="mobileno" value="1" />


				<tr>
					<td colspan="2"><button type="submit">Delete</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>