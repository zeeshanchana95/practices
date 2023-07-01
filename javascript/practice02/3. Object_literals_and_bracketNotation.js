/**
 * Ways of Creating and Initializing an object
var carA = {
    color:'red',
    speed: 200
}

var carB = {}
carB.color = 'red';
carB.speed = 200;


var carC = {}
car["color"] = "red";
car[speed] = 200;
 */



//brackets notation
/**earlier:
var house2 = {};
house2.rooms = 4;
house2.color = "pink";
house2.priceUSD = 12345;
 */

//Now, by using brackets notation, same house2 object can be created as
var house2 = {};
house2["rooms"] = 4;
house2['color']= "pink";
house2["priceUSD"] = 12345;
console.log(house2); // {rooms: 4, color: 'pink', priceUSD: 12345}


//I can both access and update properties on objects using either the dot notation, or the brackets notation, or a combination of both, like in the following example:
var car = {};
car.color = "red";
car["color"] = "green";
car["speed"] = 200;
car.speed = 100;
console.log(car); // {color: "green", speed: 100}

//With the brackets notation, I can add space characters inside property names, like this:  
car["number of doors"] = 4;
console.log(car); // {color: 'green', speed: 100, number of doors: 5}

//Additionally, I can add numbers (as the string data type) as property keys:  
car["2022"] = 1901;
console.log(car); // {2022: 1901, color: 'green', speed: 100, number of doors: 5}
//However, doing this is discouraged, due to obvious reasons of having a property key as a number string not really conveying a lot of useful information.




/**
 * Finally, there's one really useful thing that bracket notation has but is not available in the dot notation: It can evaluate expressions.

To understand what that means, consider the following example:
 */
var arrOfKeys = ['speed', 'altitude', 'color'];
var drone = {
    speed: 100,
    altitude: 200,
    color: "red"
}
for (var i = 0; i < arrOfKeys.length; i++) {
    console.log(drone[arrOfKeys[i]])
}
/**
 * outptu:
 *  100
    200
    red
 */

/**
 * Specifically, the first time it ran, it was evaluated like this: 

The value of i was 0 

The value of arrOfKeys[i] was arrOfKeys[0], which was "speed" 

Thus, drone[arrOfKeys[i]] was evaluated to drone["speed"] which is equal to 100

This allowed me to loop over each of the values stored inside the drone object, based on each of its properties' keys.


 */