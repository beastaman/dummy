<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete the product</title>
</head>
<body>
	<div align="center">
        <h1>Delete Product</h1>
        <br />
        <form action="del" modelAttribute = "product" method="post">
 
            <table>
                <tr>
                    <td>Product Name:</td>
                    <td><input type="text" name="name" /></td>
                    
                </tr>
                
              
            </table>
            <button type="submit">delete</button> </td>
        </form>
    </div>
</body>
</html>