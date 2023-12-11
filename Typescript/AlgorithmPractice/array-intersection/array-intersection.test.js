"use strict";
const arrayIntersectionTest = require('./array-intersection');
test('Finding array intersection', () => {
    expect(arrayIntersectionTest([1, 2, 3, 4, 5], [3, 4, 5, 6, 7])).toEqual([
        3, 4, 5,
    ]);
    expect(arrayIntersectionTest([10, 20, 30], [30, 40, 50])).toEqual([30]);
    expect(arrayIntersectionTest([1, 2, 3], [4, 5, 6])).toEqual([]);
});
