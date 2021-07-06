<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
<meta charset="utf-8" />
<title>Create New Product</title>
</head>


<body>
    <div align="center">
        <h1>Create New Product</h1>
        <br />
        <form action="save" modelAttribute = "product" method="post">
 
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
                    <td colspan="2"><button type="submit">Add</button> </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>