/**
 * Arrays are objects
    In JavaScript, arrays are objects. That means that arrays also have some built-in properties and methods.
    One of the most commonly used built-in methods on arrays are the push() and the pop() methods.
 */

//To add new items to an array, I can use the push() method:
var fruits = [];
fruits.push("apple"); // ['apple']
fruits.push('pear'); // ['apple', 'pear']

//To remove the last item from an array, I can use the pop() method:  
fruits.pop();
console.log(fruits); // ['apple']


//Tying into some earlier lessons in this course, I can now build a function that takes all its arguments and pushes them into an array, like this: 
function arrayBuilder(one, two, three) {
    var arr = [];
    arr.push(one);
    arr.push(two);
    arr.push(three);
    console.log(arr);
}
//I can now call the arrayBuilder() function, for example, like this:  
arrayBuilder('apple', 'pear', 'plum'); // ['apple', 'pear', 'plum']


//Even better, I don't have to console log the newly built array.  Instead, I can return it:
function arrayBuilder(one, two, three){
    var arr = [];
    arr.push(one);
    arr.push(two);
    arr.push(three);
    
    return arr;
}


//Additionally, I can save this function call to a variable. 
//I can name it anything, but this time I'll use the name: simpleArr.
var simpleArr = arrayBuilder('apple', 'pear', 'plum');

//And now I can console log the values stored in simpleArr
console.log(simpleArr); // ['apple','pear','plum']