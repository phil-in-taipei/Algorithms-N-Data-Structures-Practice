"use strict";
function arrayIntersection(arr1, arr2) {
    let inBothArrays = [];
    for (let i = 0; i < arr1.length; i++) {
        if (arr2.includes(arr1[i])) {
            inBothArrays.push(arr1[i]);
        }
    }
    return inBothArrays;
}
module.exports = arrayIntersection;
