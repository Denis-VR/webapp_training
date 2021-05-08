<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Изучение Spring MVC</title>
</head>
<body>
<!-- заголовок и его id -->
<h3 id="text">Dear Employee, Please enter your details</h3>
<!-- кнопкни для раскрашивания заголовка -->
<button onclick="changeColor('blue');">Blue</button>
<button onclick="changeColor('red');">Red</button>
<button onclick="changeColor('green');">Green</button>
<br> <br>

<!-- action связан с кнопкой submit. При нажатии на кнопку произойдет
переход по адресу showDetails, а этот запрос перехватит контроллер -->
<form name="myForm" onsubmit="validateForm()" action="showDetails"  method="get">
    <!-- тип - текст, name - имя поля формы, placeholder - подсказка -->
    Name: <input type="text" name="employeeName"
                 placeholder="Write your name"/>
    <!-- сама кнопка submit -->
    <input type="submit">
</form>

<!-- js скрипт для раскрашивания заголовка -->
<script>
    function changeColor(newColor) {
        var element = document.getElementById("text");
        element.style.color = newColor;
    }

    function validateForm() {
        var element = document.forms["myForm"]["employeeName"].value;
        if (element === "") {
            alert("Имя должно быть");
            return false;
        }
    }
</script>
</body>
</html>