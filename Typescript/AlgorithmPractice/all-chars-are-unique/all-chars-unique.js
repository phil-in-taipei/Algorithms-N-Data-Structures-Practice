"use strict";
function allCharactersUnique(inputString) {
    let objectOfStringChars = {};
    for (let i = 0; i < inputString.length; i++) {
        if (objectOfStringChars[inputString[i]]) {
            return false;
        }
        objectOfStringChars[inputString[i]] = true;
    }
    return true;
}
module.exports = allCharactersUnique;
