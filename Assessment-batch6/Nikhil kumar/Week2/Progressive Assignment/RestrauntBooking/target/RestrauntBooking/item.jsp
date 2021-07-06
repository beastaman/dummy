<%@ page import="com.sapient.entity.FoodItem" %>
<%@ page import="com.sapient.entity.Table" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: nikhil
  Date: 02/07/21
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Items</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style type="text/css">
        table {
            border-collapse: separate;
            border-spacing: 0 15px;
        }
        th {
            background-color: #4287f5;
            color: white;
        }
        th,
        td {
            width: 150px;
            text-align: center;
            border: 1px solid black;
            padding: 5px;
        }
        h2 {
            color: #4287f5;
        }
        body{
            padding-top: 2%;
        }
    </style>
</head>
<body>
    <center>
        <h1>Roster Restraunt</h1>
        <%
            String username = session.getAttribute("username").toString();
            List<FoodItem> foodItems = new ArrayList<>();
            List<Table> tables = new ArrayList<>();
            String orderSelection = "";
            String bid="";
            if(session.getAttribute("bid")!=null){
                System.out.println("Inside Bid");
                bid = session.getAttribute("bid").toString();
                System.out.println("Bid: "+bid);
            }
            System.out.println("Item JSP Bid: "+bid);
            if(request.getAttribute("foodItems") != null) {
                System.out.println("In foodItems");
                foodItems = (List<FoodItem>) request.getAttribute("foodItems");
            }

            if(request.getAttribute("tables") != null) {
                System.out.println("In tables");
                tables = (List<Table>) request.getAttribute("tables");
            }
            if(request.getAttribute("orderSelection")!=null){
                orderSelection = request.getAttribute("orderSelection").toString();
                System.out.println("In OrderSelection: "+orderSelection);
            }
        %>

        <div align="right" style="padding-right: 2%; margin-top: 2%">
            <div class="user-profile"><%= username %></div>
            <br>
            <a href="/RestrauntBooking/login.jsp"><button class="btn btn-dark">logout</button></a>
        </div>
        <form action="FoodItemController" method="post">
            <input type="hidden" name="bid" value="<%=bid%>">
            <input class="btn btn-primary" type="submit" name="option" value="BookTable">
            <input class="btn btn-primary" type="submit" name="option" value="Pickup">
            <%
                if(orderSelection.equals("BookTable")){
            %>
            <table style="width: 50%">
                <tr>
                    <th>Price</th>
                    <th>Status</th>
                    <th>Select</th>
                </tr>
                <%
                    for(Table table : tables) {
                %>
                <tr>
                    <td><%= table.getPrice() %></td>
                    <td><%= (table.getStatus().equals("A") ? "Available": "Not Available" )%></td>
                    <%
                        if(table.getStatus().equals("NA")){
                    %>
                    <td><input type="radio" name="tableRadio" value="<%=table.getTableId() %>" disabled></td>
                    <%
                        }else{
                    %>
                    <td><input type="radio" name="tableRadio" value="<%=table.getTableId() %>"></td>
                    <%
                        }
                    %>
                </tr>
                <%
                    }
                %>
            </table>
            <input class="btn btn-warning" type="hidden" name="isBookOrPick" value="book">
            <input type="submit" value = "BookTable">
            <%
                }
                else if(orderSelection.equals("Pickup")) {
            %>
            <table>
                <tr>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                </tr>
                <%
                    for(FoodItem item : foodItems) {
                %>
                <tr>
                    <td><%= item.getFoodName() %></td>
                    <td><%= item.getFoodPrice() %></td>
                    <td id="<%=item.getFoodId()%>"><input name = "quantity_<%=item.getFoodId()%>"  type="number" step="1" min="0" value="0"></td>
                </tr>
                <%
                    }
                %>
            </table>
            <input class="btn btn-warning" type="submit" value ="Order">
            <input type="hidden" name="isBookOrPick" value="pick">
            <%
                }
            %>
        </form>
    </center>
</body>
</html>
