"use strict";
const findFirstUniqueCharTest = require('./first-non-repeating');
test('Find First Non-Repeating Character', () => {
    expect(findFirstUniqueCharTest('aabccdeff')).toBe('b');
    expect(findFirstUniqueCharTest('aabbcc')).toBe(null);
    expect(findFirstUniqueCharTest('hello world')).toBe('h');
});
