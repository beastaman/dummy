<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title>Create Student</title>
</head>
<body>
    <div align="center">
        <h1>Create New Product</h1>
        <br />
        <form action="save" 
            method="post" ModelAttribute="student">
 
            <table border="0" cellpadding="10">
                <tr>
                    <td>Student Id:</td>
                    <td><input type="text" name="id" /></td>
                </tr>
                <tr>
                    <td>Fname:</td>
                    <td><input type="text" name="fname" /></td>
                </tr>
                <tr>
                    <td>Lname:</td>
                    <td><input type="text" name="lname" /></td>
                </tr>
                <tr>
                    <td>dob:</td>
                    <td><input type="text" name="dob" /></td>
                </tr> 
                <tr>
                    <td>area:</td>
                    <td><input type="text" name="area" /></td>
                </tr>
                <tr>
                    <td>Phoneno:</td>
                    <td><input type="text" name="mobileno" /></td>
                </tr>                             
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
