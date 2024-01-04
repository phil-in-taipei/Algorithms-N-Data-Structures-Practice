const HashTable = require('../11-custom-hash-table/custom-hash-table');//require('./HashTable');

function anagramGrouping(words) {
    let hashTable = new HashTable();
    for (const word of words) {
        wordKey = word.split("").sort().join("");
        if (hashTable.has(wordKey)) {
            hashTable.get(wordKey).push(word);
        } else {
            hashTable.set(wordKey, [word]);
        }
    }
    return hashTable.getValues();
}

module.exports = anagramGrouping;
