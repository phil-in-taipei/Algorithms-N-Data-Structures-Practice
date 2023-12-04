"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const calculator = require('./calculator');
console.log('-------------------------------------------');
console.log('Running calculator function in typescript:');
console.log('-------------------------------------------');
const add = calculator(1, 2, '+');
console.log(`This is the added result: ${add}`);
console.log('-------------------------------------------');
const sub = calculator(1, 2, '-');
console.log(`This is the subtracted result: ${sub}`);
console.log('-------------------------------------------');
const div = calculator(1, 2, '/');
console.log(`This is the divided result: ${div}`);
console.log('-------------------------------------------');
const mult = calculator(1, 2, '*');
console.log(`This is the multiplied result: ${mult}`);
console.log('-------------------------------------------');
