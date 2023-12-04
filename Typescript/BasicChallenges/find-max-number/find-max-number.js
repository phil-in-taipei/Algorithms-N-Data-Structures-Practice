"use strict";
function findMaxNumber(arrayOfNums) {
    let maxValue = arrayOfNums[0];
    for (let i = 1; i < arrayOfNums.length; i++) {
        if (arrayOfNums[i] > maxValue) {
            maxValue = arrayOfNums[i];
        }
    }
    return maxValue;
    // return Math.max(...arrayOfNums);
}
module.exports = findMaxNumber;
