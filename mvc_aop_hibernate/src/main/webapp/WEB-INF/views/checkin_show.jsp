<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your phone: ${employee.phoneNumber}
<br>
Your email: ${employee.email}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrand}
<br>
Languages(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
    <li>${lang}</li>
    </c:forEach>
</ul>
</body>
</html>
