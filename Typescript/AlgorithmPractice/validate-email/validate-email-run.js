"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const validateEmail = require('./validate-email');
const result = validateEmail('sweeney.phil@gmx.com');
console.log(`The email sweeney.phil@gmx.com is valid: ${result}`);
