const numbers = [1, 2, 3, 4, 5];

console.log(`This is the original array of numbers: ${numbers}`)
/**
 * map: Transforms array elements with a provided function, creating a new array.
 * note: can also pass in index argument and array argument (for the whole array)
 */

const doubleNumbers = numbers.map((num) => {
    return num * 2;
});

console.log(`This is the numbers doubled: ${doubleNumbers}`);


/**
 * filter: Creates a new array with elements that satisfy a specified condition.
 * example: return only even numbers
 */

const evenNumbers = numbers.filter((num) => {
    return num % 2 === 0;
});

console.log(`These are the even numbers in the array: ${evenNumbers}`);

/**
 * reduce: Accumulates array elements into a single value using a provided function.
 * Takes in two arguments: accumulator and then each element in array
 * In this case it add all of the numbers, with the total starting at zero (in callback)
 */

const sumOfNumbers = numbers.reduce((total, num) => {
    return total + num;
}, 0);

console.log(`The sum of the numbers is: ${sumOfNumbers}`);

/**
 * forEach: Iterates through array elements and applies a function without creating a new array.
 */

const timesThree = [];

numbers.forEach((num) => {
    timesThree.push(num * 3);
});

console.log(`This is the array with each item multiplied by 3: ${timesThree}`);

 /**
 * find: Returns the first array element that satisfies a specified condition.
 */

 const firstNumberGreaterThanTwo = numbers.find((num) => num > 2);

 console.log(`This is the first number greater than two: ${firstNumberGreaterThanTwo}`);


/**
 * some: Checks if at least one array element satisfies a condition.
 * Note: without curly braces (they are also optional in the examples above)
 */

 const hasEvenNumber = numbers.some((num) => num % 2 === 0);

 console.log(`There is at least one even number in the array: ${hasEvenNumber}`)

/**
 * every: Checks if all array elements satisfy a condition.
 */

const allNumbersAreEven = numbers.every((num) => num % 2 === 0);

console.log(`All of the items in the array are even numbers: ${allNumbersAreEven}`);
