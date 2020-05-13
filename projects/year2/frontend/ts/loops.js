for (var i = 1; i <= 5; i++) {
    console.log(i);
}
var numbers = [4, 7, 1, 5, 3, 9];
numbers.push(24);
console.log(numbers + "\n\n");
var saygac = 0;
for (var _i = 0, numbers_1 = numbers; _i < numbers_1.length; _i++) {
    var n = numbers_1[_i];
    saygac++;
    console.log(saygac + ' = ' + n);
}
