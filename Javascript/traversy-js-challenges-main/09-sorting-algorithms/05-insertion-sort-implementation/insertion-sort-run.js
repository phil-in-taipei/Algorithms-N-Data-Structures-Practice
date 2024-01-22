const insertionSort = require('./insertion-sort');

const array = [4, 3, 2, 10, 12, 1, 5, 6];
console.log('------------------------------------------------------------------------------------------');
console.log('Commencing insertion sort')
const result = insertionSort(array);
console.log('------------------------------------------------------------------------------------------');
console.log(`This is the result: ${result}`);
console.log('------------------------------------------------------------------------------------------');
