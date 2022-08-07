<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<%--    <form action="showDetails" method="get">--%>
<%--        <input type="text" name="employeeName" placeholder="Write your name"/>--%>
<%--        <input type="submit">--%>
<%--    </form>--%>

    <form:form action = "showDetails" modelAttribute="employee">

        Name <form:input path="name"/>
        <br>
        Surname <form:input path="surname"/>
        <br>
        Salary <form:input path="salary"/>
        <br>
        Department <form:select path="department">
<%--        Вариант №1--%>
<%--            <form:option value="Information Technology" label="IT"/>--%>
<%--            <form:option value="Human Resources" label="HR"/>--%>
<%--            <form:option value="Sales" label="Sales"/>--%>

<%--        Вариант №2--%>
            <form:options items="${employee.departments}"/>

        </form:select>
        <br>
        Which car do you want? <br>
<%--        BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--        Audi <form:radiobutton path="carBrand" value="Audi"/>--%>
<%--        MB <form:radiobutton path="carBrand" value="Mercedes-Benz"/>--%>
            <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
        <br>
        Foreign languale(s)? <br>
        EN <form:checkbox path="languages" value="English"/>
        DE <form:checkbox path="languages" value="Deutch"/>
        FR <form:checkbox path="languages" value="French"/>
        <br>
        <input type="submit" value="OK">

    </form:form>

</body>
</html>
