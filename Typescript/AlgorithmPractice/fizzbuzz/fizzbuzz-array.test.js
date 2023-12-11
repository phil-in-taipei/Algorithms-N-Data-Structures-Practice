"use strict";
const fizzBuzzTest = require('./fizzbuzz-array');
test('FizzBuzz Array', () => {
    expect(fizzBuzzTest(15)).toEqual([
        1,
        2,
        'fizz',
        4,
        'buzz',
        'fizz',
        7,
        8,
        'fizz',
        'buzz',
        11,
        'fizz',
        13,
        14,
        'fizzbuzz',
    ]);
});
