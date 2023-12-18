const validateEmail = require('./validate-email');

const result: boolean = validateEmail('sweeney.phil@gmx.com');

console.log(`The email sweeney.phil@gmx.com is valid: ${result}`)

export {}