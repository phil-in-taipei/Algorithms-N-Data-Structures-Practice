"use strict";
function calculator(a, b, operator) {
    let value;
    switch (operator) {
        case "+":
            value = a + b;
            break;
        case "-":
            value = a - b;
            break;
        case "/":
            value = a / b;
            break;
        case "*":
            value = a * b;
            break;
        default:
            throw new Error('Invalid operator');
    }
    return value;
}
module.exports = calculator;
