<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>
<h3 id="text">Dear Employee, Please enter your details</h3>
<br>
<form:form action="showDetails" modelAttribute="employee" method="get">
    First name <form:input path="name"/> <form:errors path="name"/>
    <br> <br>
    Last name <form:input path="surname"/> <form:errors path="surname"/>
    <br> <br>
    Salary <form:input path="salary"/> <form:errors path="salary"/>

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
    Foreign Language(s)
    <%--    <form:checkbox path="languages" value="English"/> EN--%>
    <%--    <form:checkbox path="languages" value="Deutch"/> DE--%>
    <%--    <form:checkbox path="languages" value="French"/> FR--%>
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <br> <br>
    Phone number <form:input path="phoneNumber"/> <form:errors path="phoneNumber"/>
    <br> <br>
    Email <form:input path="email"/> <form:errors path="email"/>
    <br> <br>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>