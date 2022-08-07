<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 07.08.2022
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Asking</title>
</head>
<body>
    <h2>Dear user, please enter your name:</h2>

    <br>
    <br>

    <form action="showDetails" method="get">
        <input type="text" name="employeeName" placeholder="Write your name"/>
        <input type="submit">
    </form>
</body>
</html>
