<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="windows-1251">
    <title>Learn MVC</title>
</head>
<body>
<h3 id="text">Dear Employee, Please enter your details</h3>
<br> <br>

<form:form action="/employee/showDetails" modelAttribute="employee">
    Name: <form:input path="name"/>
    <br> <br>
    Surname: <form:input path="surname"/>
    <br> <br>
    Salary: <form:input path="salary"/>
    <br> <br>
    Department <form:select path="department">
    <!-- значения выпадающего списка. Мы будем видеть label, но значение - value -->
    <%--    <form:option value="Information Technology" label="IT"/>--%>
    <%--    <form:option value="Human Resources" label="HR"/>--%>
    <%--    <form:option value="Sales" label="Sales"/>--%>
    <form:options items="${employee.departments}"/>
</form:select>

    <br> <br>
    Which car do you want?
    <br>
<%--    <form:radiobutton path="carBrand" value="Lada"/> Lada--%>
<%--    <form:radiobutton path="carBrand" value="Audi"/> Audi--%>
<%--    <form:radiobutton path="carBrand" value="Mercedes"/> Mercedes--%>
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>

    <br> <br>
    <input type="submit" value="Submit">

</form:form>
</body>
</html>