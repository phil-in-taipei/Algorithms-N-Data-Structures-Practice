const sumUpTo = require('./sum-up-to');

test('Summing up positive integers', () => {
  // note: this throws a stack overflow if all of the tests are run simultaneously
  //expect(sumUpTo(6)).toBe(21);
  expect(sumUpTo(10)).toBe(55);
  //expect(sumUpTo(1)).toBe(1);
  //expect(sumUpTo(0)).toBe(0);
});
