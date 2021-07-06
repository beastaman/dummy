<%@ page import="com.sapient.entity.User" %>
<%@ page import="com.sapient.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 30/06/21
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        User user = (User)session.getAttribute("user");
        List<Student> students=null;
        if(request.getAttribute("students")!=null){
            students = (List<Student>) request.getAttribute("students");
        }
        int userChoice = 0;
        if(request.getAttribute("choice")!=null){
            userChoice = Integer.parseInt(request.getAttribute("choice").toString());
            System.out.println(userChoice);
        }
        String message=null;
        if(request.getAttribute("message")!=null){
            message = request.getAttribute("message").toString();
        }
    %>
    <div>
        <h1>
            Admin: <%=user.getUserId()%>
        </h1>
        <br>
        <form action="LoginController" method="post">
            <input type="hidden" name="h1" value="Home">
            <input type="submit" name="choice" value="1"> Display All Students
            <br>
            <input type="submit" name="choice" value="2"> Insert Student
        </form>
        <div>
            <%
                if(userChoice==1){
                    if(students!=null){
            %>
            <table border="1">
                <tr>
                    <th>Student Id</th>
                    <th>Student FName</th>
                    <th>Student LName</th>
                    <th>Student Dob</th>
                    <th>Student Phone</th>
                    <th>Student Area</th>
                </tr>
                <%
                    for(Student student: students){
                %>
                <tr>
                    <td><%=student.getId()%></td>
                    <td><%=student.getFName()%></td>
                    <td><%=student.getLName()%></td>
                    <td><%=student.getDob()%></td>
                    <td><%=student.getPhone()%></td>
                    <td><%=student.getArea()%></td>
                </tr>
                <%
                        }
                      }
                    }
                    else if(userChoice==2){
                %>
                <form action="LoginController" method="post">
                    <h1>Enter new Student Details</h1>
                    <br> Student Id: <input type="text" name="sid"/>
                    <br> First Name: <input type="text" name="fname"/>
                    <br> Last Name: <input type="text" name="lname"/>
                    <br> Phone Number: <input type="text" name="phone"/>
                    <br> DOB: <input type="text" name="dob"/>
                    <br> Address: <input type="text" name="area"/>
                    <input type="hidden" name="h1" value="3"/>
                    <br><input type="submit" value="insert"/>
                </form>
                <%
                    }
                    if (message != null){
                %>
                    <h1><%=message%></h1>
                <%
                    }
                %>
            </table>
        </div>
    </div>

</body>
</html>
