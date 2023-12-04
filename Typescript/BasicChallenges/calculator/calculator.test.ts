const calculator = require('./calculator');

test('Performing arithmetic operations using the calculator function', () => {
  // Test case inputs
  const num1: number = 5;
  const num2: number = 7;

  // Addition
  expect(calculator(num1, num2, '+')).toBe(12);

  // Subtraction
  expect(calculator(num1, num2, '-')).toBe(-2);

  // Multiplication
  expect(calculator(num1, num2, '*')).toBe(35);

  // Division
  expect(calculator(num1, num2, '/')).toBeCloseTo(0.7143, 4);

  expect(() => {expect(calculator(num1, num2, 'dlkjdsldsadsa')).toThrow('Invalid operator');});
  
});

export {}