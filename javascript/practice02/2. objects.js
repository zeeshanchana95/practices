var user = {}; //create an object


//creating an object with properties and their values
var assistantManager = {
    rangeTilesPerTurn: 3,
    socialSkills: 30,
    streetSmarts: 30,
    health: 40,
    specialAbility: "young and ambitious",
    greeting: "Let's make some money"
}

//here's a table object:
var table = {
    legs: 3,
    color: "brown",
    priceUSD: 100,
}
console.log(table);//display the object in the developer console

//Additionally, I can console log any individual property, like this: 
console.log(table.color); // 'brown'


//I can build any other object in a similar way: 
var house = {
    rooms: 3,
    color: "brown",
    priceUSD: 10000,
}


//An alternative approach of building objects is to first save an empty object literal to a variable, then use the dot notation to declare new properties on the fly, and use the assignment operator to add values to those properties; for example:
var house2 = {};
house2.rooms = 4;
house2.color = "pink";
house2.priceUSD = 12345;


//Additionally, nothing is preventing me from combining the two approaches. For example:  
console.log(house); // {rooms: 3, color: "brown", priceUSD: 10000}
house.windows = 10;
console.log(house); // {rooms: 3, color: "brown", priceUSD: 10000, windows: 10}

//This flexbility additionally means that I can update already existing properties, not just add new ones:  
house.windows = 11;
console.log(house); // {rooms: 3, color: "brown", priceUSD: 10000, windows: 11}