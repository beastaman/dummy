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
        <h1>Create New Product</h1>
        <br />
        <form action="save" method="post"
        modelAttribute="product">
 
            <table border="0" cellpadding="10">
                <tr>
                    <td>Product Name:</td>
                    <td><input type="text" name="name" /></td>
                </tr>
                <tr>
                    <td>Brand:</td>
                    <td><input type="text" name="brand" /></td>
                </tr>
                <tr>
                    <td>Made In:</td>
                    <td><input type="text" name="madein" /></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" /></td>
                </tr>                            
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>

</body>
</html>