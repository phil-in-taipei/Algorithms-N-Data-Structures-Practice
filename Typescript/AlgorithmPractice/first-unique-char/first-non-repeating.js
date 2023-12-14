"use strict";
function findFirstNonRepeatingCharacter(submittedString) {
    const charCount = new Map();
    for (const char of submittedString) {
        charCount.set(char, (charCount.get(char) || 0) + 1);
    }
    for (const char of submittedString) {
        if (charCount.get(char) === 1) {
            return char;
        }
    }
    return null;
}
module.exports = findFirstNonRepeatingCharacter;
