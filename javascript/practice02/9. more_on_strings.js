//Arrays are iterable
var veggies = ['onion', 'parsley', 'carrot']
console.log(veggies.length);

console.log(veggies[0]);
console.log(veggies[1]);

for(var i=0; i<veggies.length; i++){
    console.log(veggies[i]);
}
/**
 * output:
 *  3
    onion
    parsley
    onion
    parsley
    carrot
 */


//Strings are iterable, too
var greeting = "Hello";
console.log(greeting.length);

console.log(greeting[0]);
console.log(greeting[1]);

for(var i=0; i<greeting.length; i++){
    console.log(greeting[i]);
}
/**
 * output:
 *  5
    H
    e
    H
    e
    l
    l
    o
 */


//strings != array
var greet = 'Hello ';
var user = 'Lisa';

// console.log(greet.pop()); //TypeError: greet.pop is not a function

console.log(greet+user); //Hello Lisa
console.log(greet.concat(user)); //Hello Lisa
