const calculator = require('./calculator');

console.log('-------------------------------------------')

console.log('Running calculator function in typescript:')

console.log('-------------------------------------------')

const add:number = calculator(1, 2, '+');
console.log(`This is the added result: ${add}`);

console.log('-------------------------------------------')

const sub:number = calculator(1, 2, '-');
console.log(`This is the subtracted result: ${sub}`);

console.log('-------------------------------------------')


const div:number = calculator(1, 2, '/');
console.log(`This is the divided result: ${div}`);

console.log('-------------------------------------------')

const mult:number = calculator(1, 2, '*');
console.log(`This is the multiplied result: ${mult}`);

console.log('-------------------------------------------')



export {}