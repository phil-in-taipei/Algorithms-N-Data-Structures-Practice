const allCharactersUnique = require('./all-chars-unique');

const result1: boolean = allCharactersUnique('abcdefg');
const result2: boolean = allCharactersUnique('abcdefgA');
const result3: boolean = allCharactersUnique('programming');

console.log(result1);
console.log(result2);
console.log(result3);

export {}