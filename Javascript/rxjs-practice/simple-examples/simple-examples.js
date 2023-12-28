import { from } from 'rxjs';
import { map, filter, reduce, every, take, defaultIfEmpty } from 'rxjs/operators';


console.log("------------------------------------------------------------------------------------------")
console.log("------------------------------------------------------------------------------------------")
console.log('Map practice with an array, observer, and subscription:')
const numbers = [1, 2, 3, 4, 5];
console.log(`This is the original array of numbers: ${numbers}`)
console.log("------------------------------------------------------------------------------------------")
let doubledNumbers = [];

const numbersObservable = from(numbers)
  .pipe(
    map(num => num * 2)
  )
  
console.log('Executing code and logging numbers as they are being doubled');
console.log("------------------------------------------------------------------------------------------")
numbersObservable.subscribe((doubled) =>
  {
     doubledNumbers.push(doubled)
     console.log(doubled)

  }
).unsubscribe();
console.log("------------------------------------------------------------------------------------------")
console.log(`This is the new array with the numbers doubled: ${doubledNumbers}`);
console.log("------------------------------------------------------------------------------------------")
console.log("------------------------------------------------------------------------------------------")
console.log('Filter practice with an array, observer, and subscription:')
let evenNumbersArray = [];
console.log("------------------------------------------------------------------------------------------")

console.log('Setting up observable event which will filter out the even items in the array');
console.log("------------------------------------------------------------------------------------------")
const evenNumbersObserverable = from(numbers)
  .pipe(
    filter(num => num % 2 === 0)  
  );

console.log('Observable is subscribed to and the new array of only even numbers is populated')
console.log("------------------------------------------------------------------------------------------")
evenNumbersObserverable.subscribe((evenNum) => {
  console.log(`Even number: ${evenNum}`);
    evenNumbersArray.push(evenNum);
}).unsubscribe();
  
console.log("------------------------------------------------------------------------------------------")
console.log(`This is the new array of only even numbers: ${evenNumbersArray}`)
console.log("------------------------------------------------------------------------------------------")
console.log("------------------------------------------------------------------------------------------")
console.log('Reduce practice with an array, observer, and subscription to find sum of numbers in array:')
console.log("------------------------------------------------------------------------------------------")
let sumOfNumbersInArray
console.log('Setting up observable event which will reduce the sum from items in the array');
const sumOfNumbersObservable = from(numbers)
  .pipe(
    reduce((total, num) => total + num, 0)  
  )
console.log("------------------------------------------------------------------------------------------")
console.log("Subscribed to the array and logging the sum during execution:")
sumOfNumbersObservable.subscribe((sum) => {
  console.log(`The sum of the numbers is: ${sum}`); 
  sumOfNumbersInArray = sum;
}).unsubscribe();
console.log("------------------------------------------------------------------------------------------")
console.log(`This is the sum after being assigned to a variable: ${sumOfNumbersInArray}`)
console.log("------------------------------------------------------------------------------------------")
console.log("------------------------------------------------------------------------------------------")
console.log('Setting up observable event which will filter out the even items and get the sum');
console.log("------------------------------------------------------------------------------------------")
const sumOfEvenNumbersObserverable = from(numbers)
  .pipe(
    filter(num => num % 2 === 0),
    reduce((total, num) => total + num, 0)  
  );
 console.log("------------------------------------------------------------------------------------------")
 let sumofEvenNumbers;
 console.log("Subscribed to the array and logging the sum of even numbers during execution:")
 sumOfEvenNumbersObserverable.subscribe((sum) => {
   console.log(`The sum of the even numbers is: ${sum}`); 
   sumofEvenNumbers = sum;
 }).unsubscribe();
console.log("------------------------------------------------------------------------------------------")
console.log(`The sum of even numbers assigned to a variable is ${sumofEvenNumbers}`)
console.log("------------------------------------------------------------------------------------------")

console.log("------------------------------------------------------------------------------------------")


console.log('Every practice with an array, observer, and subscription to determine if all values are odd')
const arrayOfAllOddNumbers = [1, 3, 5, 11, 21];

const isAllOddNumbers = from(arrayOfAllOddNumbers).pipe(
    every(num => num % 2 !== 0),
  )

console.log('Now subscribing to execute and log the result:')
console.log("------------------------------------------------------------------------------------------")

isAllOddNumbers.subscribe((e) => console.log(`All items are odd: ${e}`))
console.log("------------------------------------------------------------------------------------------")
console.log('Every practice with an array, observer, and subscription to determine if one value if even using a negative')

const arrayWithJustOneEvenNumber = [1, 3, 5, 11, 22];

const isAllOddNumbersOpposite = from(arrayWithJustOneEvenNumber).pipe(
   every(num => num % 2 !== 0),
)
console.log("------------------------------------------------------------------------------------------")
console.log("Logging the opposite to determine if there is an exception (at least one even value)")
isAllOddNumbersOpposite.subscribe((e) => console.log(`At least one item is even: ${!e}`))

console.log("------------------------------------------------------------------------------------------")


console.log('Filter/take/map/defaultIfEmpty practice with an array, observer, and subscription to determine if all values are odd')

let hasEven;
console.log("------------------------------------------------------------------------------------------")
console.log("The first observable determines whether an array with just one even number has an even number")
const hasEvenObserver1 = from(arrayWithJustOneEvenNumber).pipe(
  filter(n => n % 2 === 0), 
  take(1),
  map(num => !!num),
  defaultIfEmpty(false)  
)

console.log('In the subscription, the result is logged the value is assigned to a boolean upon execution')
hasEvenObserver1.subscribe(result => {
  console.log(`Has even number: ${result}`);
  hasEven = result;
});
console.log("------------------------------------------------------------------------------------------")

console.log(`This is the result: ${hasEven}`);

console.log("------------------------------------------------------------------------------------------")
console.log("------------------------------------------------------------------------------------------")
console.log("The second observable determines whether an array of all odd numbers has an even number")

const hasEvenObserver2 = from(arrayOfAllOddNumbers).pipe(
  filter(n => n % 2 === 0), 
  take(1),
  map(num => !!num),
  defaultIfEmpty(false)  
)

console.log("------------------------------------------------------------------------------------------")
console.log('In the subscription, the result is logged the value is assigned to a boolean upon execution')

hasEvenObserver2.subscribe(result => {
  console.log(`Has even number: ${result}`);
  hasEven = result;
});

console.log(`This is the result: ${hasEven}`);

console.log("------------------------------------------------------------------------------------------")
console.log("------------------------------------------------------------------------------------------")
