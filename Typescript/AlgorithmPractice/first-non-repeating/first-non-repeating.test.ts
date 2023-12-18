const findFirstNonRepeatingCharacter = require("./first-non-repeating");

test("Test that first non-repeating character in a string is returned", () => {

    const testResult1: string | null = findFirstNonRepeatingCharacter('programming');
    const testResult2: string | null = findFirstNonRepeatingCharacter('abacddbec');

    expect(testResult1).toBe('p');

    expect(testResult2).toBe('e');
});

export {}