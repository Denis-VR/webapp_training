<html>
<head>
    <style>
        <%@ include file="WEB-INF/view/style.css" %>
    </style>
</head>
<body>
<div class="container">
    <a href="api/employees"><button class="btn btn1">All employees</button></a>
    <br>
    <a href="api/employees/16"><button class="btn btn1">Employee 16</button></a>
    <br>
    <a href="api/employees/0"><button class="btn btn1">Not found Employee 0</button></a>
    <br>
    <a href="api/employees/abs"><button class="btn btn1">Employee with id = "abs"</button></a>
<%--    <button class="btn btn2">Hover Me</button>--%>
<%--    <button class="btn btn3">Hover Me</button>--%>
<%--    <button class="btn btn4">Hover Me</button>--%>
</div>
</body>
</html>
