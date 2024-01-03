const HashTable = require('./custom-hash-table');

const myHashTable = new HashTable();

myHashTable.set('Ding-Dong', '404-876-5309')
myHashTable.set('Shling-schlong', '401-293-2104')
console.log('------------------------------------------------------------------------------')
myHashTable.printTable();
console.log('------------------------------------------------------------------------------')

let n = myHashTable.get('Ding-Dong');
console.log(n);
console.log('------------------------------------------------------------------------------')


myHashTable.remove('Ding-Dong');

myHashTable.printTable();
console.log('------------------------------------------------------------------------------')
console.log(myHashTable.has('Ding-Dong'));
console.log('------------------------------------------------------------------------------')

console.log(myHashTable.has('Shling-schlong'));
console.log('------------------------------------------------------------------------------')
console.log('now clearing.....')
console.log('------------------------------------------------------------------------------')
myHashTable.clear();
myHashTable.printTable();
console.log('------------------------------------------------------------------------------')

