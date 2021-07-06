<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>Create New Product</title>
</head>
<body>
	<div align="center">
		<h1>Create New Product</h1>
		<br />
		<form action="delete" method="delete" modelAttribute="product">

			<table border="0" cellpadding="10">
				<tr>
					<td>Enter name of the product to delete:</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit">Save</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>


