const stringIsAPalindrome = require('./palindrome-experiment');

test('Checking for palindrome strings via the experimental approach', () => {
  expect(stringIsAPalindrome('racecar')).toBe(true);
  expect(stringIsAPalindrome('Hello')).toBe(false);
  expect(stringIsAPalindrome('A man, a plan, a canal, Panama')).toBe(true);
  expect(stringIsAPalindrome('12321')).toBe(true);
});