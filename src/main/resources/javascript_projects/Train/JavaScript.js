//alert("Hello World");

var firstNum = 12;
var secondNum = 24;
// document.write("Результат: ", firstNum + secondNum);

var colors = ["Red", "Blue", "Green"];

var colors2 = new Array (3428, "Blue", "Green");
colors2[3] = "Grey";
colors2.push("Red")
// document.write(colors2[0]); 

// for (var i = 0; i < 10; i++) {
// 	document.write("Hello, World ");
// }

// var k = 0;
// while (k < 10) {
// 	console.log(k);
// 	k++;
// }

// k = 10;
// do {
// 	console.log(k);
// 	k--;
// } while (k>0);


for (var i = 0; i < colors2.length; i++) {
	console.log(colors2[i]);
}

var bool = false;
if (!bool && 10%3 == 1) {
	console.log(bool + " is false");
}

// var res = 2;
// switch (res) {
// 	case 1:
// 	alert ("Res is 1");
// 	break;
// 	case 2:
// 	alert ("Res is 2");
// 	break;
// 	default:
// 	alert ("Res is ???");
// }


// function write (word) {
// 	document.write(word);
// }
// write("My text from function");
//write("Inner functions: " + sum(53,87));

var person = {
	firstName: "Brad",
	age: 25,
	children: ['Lizza', 'Perya'],
	adress: {
		street: '555 Some st',
		city: 'Boston',
		state: 'MA'
	},
	NameAge: function () {
		return "Person " + this.firstName + ", age is - " + this.age;
	}
}
document.write(person.NameAge() +
	", from state " + person.adress.state);

// var apple = new Object();
// apple.color = 'green';
// apple.shape = 'round';
// apple.describe = function () {
// 	return 'An apple is ' + this.color;
// }
// console.log(apple.shape);
// console.log(apple.describe());

function Fruit (color, shape) {
	this.color = color;
	this.shape = shape;
}
var melon = new Fruit('yellow', 'round'); 
melon.describe = function () {
	return 'An melon is ' + this.color;
}
console.log(melon.describe());

