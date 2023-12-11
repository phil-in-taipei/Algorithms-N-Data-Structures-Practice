"use strict";
function getFizzbuzz(numberToCountUntil) {
    let fizzBuzzArray = [];
    let i = 0;
    while (i < numberToCountUntil) {
        i++;
        let divisibleBy3Or5 = false;
        let returnString = "";
        if (i % 3 === 0) {
            returnString += "fizz";
            divisibleBy3Or5 = true;
        }
        if (i % 5 === 0) {
            returnString += "buzz";
            divisibleBy3Or5 = true;
        }
        if (divisibleBy3Or5) {
            fizzBuzzArray.push(returnString);
        }
        else {
            fizzBuzzArray.push(i);
        }
    }
    return fizzBuzzArray;
}
module.exports = getFizzbuzz;
