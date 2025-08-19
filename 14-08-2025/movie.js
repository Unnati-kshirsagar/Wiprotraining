
let movie = {
    movieName: "Inception",
    movieLanguage: "English",
    imdbRating: 8.8
};
let { movieName, movieLanguage, imdbRating } = movie;

console.log("Movie Name:", movieName);
console.log("Language:", movieLanguage);
console.log("IMDB Rating:", imdbRating);

// Ex7: Use spread operator to merge two objects
console.log("\n=== Ex7: Merging Objects with Spread Operator ===");
let obj1 = { a: 1, b: 2 };
let obj2 = { b: 3, c: 4 };
let mergedObj = { ...obj1, ...obj2 };

console.log("obj1:", obj1);
console.log("obj2:", obj2);
console.log("mergedObj:", mergedObj);
console.log("Value of mergedObj.b:", mergedObj.b); // Will be 3 (obj2 overwrites obj1)

// Ex8: Use spread operator to combine arrays with additional elements
console.log("\n=== Ex8: Combining Arrays with Spread Operator ===");
let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6];
let newArr = [4, 5, ...arr1, 6, 7, ...arr2, 8, 9];

console.log("arr1:", arr1);
console.log("arr2:", arr2);
console.log("newArr:", newArr);

// Ex9: Use spread operator to pass array elements as function arguments
console.log("\n=== Ex9: Spread Operator with Function Arguments ===");
function sum(a, b, c) {
    return a + b + c;
}

let numbers = [1, 2, 3];
let result = sum(...numbers);

console.log("numbers array:", numbers);
console.log("sum(...numbers) result:", result);
console.log("This is equivalent to sum(1, 2, 3):", sum(1, 2, 3));
