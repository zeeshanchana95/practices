//building a function
// function listArrayItems(arr) {
//     for (var i = 0; i < arr.length; i++) {
//         console.log(arr[i]) //display the array item where the index is euqal to i
//     }
// }

//declaring and initializing an array
var colors = ['red', 'orange', 'yellow', 'green', 'blue', 'purple', 'pink'];

//calling a function
// listArrayItems(colors); //display all items in the array at once




//function that takes an array as input and display all items of this array
// function listArrayItems(arr) {
//     for (var i = 0; i < arr.length; i++) {
//         console.log(i, arr[i])
//     }
// }
// listArrayItems(colors);


//To start the count from one instead of zero, I can update my function declaration as follows:  
// function listArrayItems(arr) {
//     for (var i = 0; i < arr.length; i++) {
//         console.log(i+1, arr[i])
//     }
// }
// listArrayItems(colors);


//I can even add one or more conditions, such as:  
function listArrayItems(arr) {
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] == 'red') {
            console.log(i*100, "tomato!")
        } else {
            console.log(i*100, arr[i])
        }
    }
}
listArrayItems(colors);