<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurant Menu - Non-Veg</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
    }
    h1, h3 {
        color: #333;
    }
    table {
        width: 50%;
        margin: 20px auto;
        border-collapse: collapse;
    }
    table, th, td {
        border: 1px solid #999;
        padding: 8px;
        text-align: center;
    }
    th {
        background-color: #f2f2f2;
    }
    .order-form {
        width: 50%;
        margin: 20px auto;
        padding: 20px;
        background-color: #fff;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        border-radius: 8px;
    }
    input[type="text"], input[type="submit"] {
        padding: 10px;
        font-size: 16px;
    }
    input[type="submit"] {
        background-color: #28a745;
        color: #fff;
        border: none;
        cursor: pointer;
        border-radius: 5px;
    }
    input[type="submit"]:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
    <center>
        <h1>Restaurant Menu Non-Veg</h1>
        <h3><a href="GetVeg">VEG</a></h3>
        <h3><a href="GetNonVeg">NON-VEG</a></h3>
    </center>
    <hr>
    <center>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
        <c:forEach items="${non_veg}" var="i">
            <tr>
                <td><c:out value="${i.non_veg_id}"></c:out></td>       
                <td><c:out value="${i.name}"></c:out></td>
                <td><c:out value="${i.price}"></c:out></td>
            </tr>
        </c:forEach>
    </table>
    </center>
    
    <!-- Order Form -->
    <div class="order-form">
        <form action="OrderNonVegServlet" method="post">
            <label for="non_veg_id">Enter Item ID to Order:</label><br><br>
            <input type="text" id="non_veg_id" name="non_veg_id" placeholder="Non-Veg Item ID"><br><br>
            <input type="submit" value="Place Order">
        </form>
    </div>
</body>
</html>
