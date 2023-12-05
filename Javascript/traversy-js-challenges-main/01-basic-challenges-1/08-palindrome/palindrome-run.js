const isPalindrome = require('./palindrome');

console.log("-------------------------------------------------------------------------------------------------------")

console.log("Running isPalindrone function with 'racecar' as the argument string")

const result1 = isPalindrome('racecar');

console.log(result1);

console.log("-------------------------------------------------------------------------------------------------------")

console.log("Running isPalindrone function with 'racecars' as the argument string")
const result2 = isPalindrome('racecars');

console.log(result2);

console.log("-------------------------------------------------------------------------------------------------------")

console.log(result1, result2);
