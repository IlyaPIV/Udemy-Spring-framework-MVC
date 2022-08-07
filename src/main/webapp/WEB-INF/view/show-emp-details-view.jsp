<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 07.08.2022
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Show</title>
</head>
<body>

  <h2>Dear user, you are WELCOME!!!</h2>

  <br>
  <br>
  <br>

<%--  <h3>Your name: ${param.employeeName}</h3>--%>
  <h4>Your name: ${employee.name}</h4>
  <h4>Your surname: ${employee.surname}</h4>
  <h4>Your salary: ${employee.salary}</h4>
  <h4>Your department: ${employee.department}</h4>
  <h4>Your car: ${employee.carBrand}</h4>
  <h4>Language(s):</h4>
  <ul>
    <c:forEach var="lang" items="${employee.languages}">
      <li>
          ${lang}
      </li>
    </c:forEach>
  </ul>

</body>
</html>
