const findMax = require('./find-max-number');

test('Finding the maximum number in an array', () => {
  expect(findMax([1, 5, 3, 9, 2])).toBe(9);
  expect(findMax([0, -1, -5, 2])).toBe(2);
  expect(findMax([10, 10, 10, 10])).toBe(10);
});
