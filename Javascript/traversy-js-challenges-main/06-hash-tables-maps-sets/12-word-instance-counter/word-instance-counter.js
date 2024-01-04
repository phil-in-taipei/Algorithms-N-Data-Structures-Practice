const HashTable = require('../11-custom-hash-table/custom-hash-table');//require('./HashTable');

function wordInstanceCounter(sentence, word) {
    let hashTable = new HashTable();
    const sentenceArray = sentence.toLowerCase().split(" ");
    //console.log(sentenceArray)
    for (let i=0; i < sentenceArray.length; i++) {
        const formattedWord = sentenceArray[i].replace(/[^a-zA-Z]+/g, '');
        //console.log(`${sentenceArray[i]} ----> ${formattedWord}`);
        if (hashTable.has(formattedWord)) {
            hashTable.set(formattedWord, hashTable.get(formattedWord) + 1);
        } else {
            hashTable.set(formattedWord, 1);
        }
            
    }
    return hashTable.get(word);

}

module.exports = wordInstanceCounter;
