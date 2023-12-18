"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const findFirstNonRepeatingCharacter = require("./first-non-repeating");
test("Test that first non-repeating character in a string is returned", () => {
    const testResult1 = findFirstNonRepeatingCharacter('programming');
    const testResult2 = findFirstNonRepeatingCharacter('abacddbec');
    expect(testResult1).toBe('p');
    expect(testResult2).toBe('e');
});
