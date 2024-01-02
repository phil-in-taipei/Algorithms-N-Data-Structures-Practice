function wordFrequencyCounter(inputString) {
    const wordCountMap = new Map();
    stringAsArray = inputString.toLowerCase().split(" ");
    for (let i=0; i < stringAsArray.length; i++) {
        const formattedWord = stringAsArray[i].replace(/[^a-zA-Z]+/g, '');
        if (RegExp(/^\p{L}/,'u').test(stringAsArray[i])) {
            if (wordCountMap.has(formattedWord)) {
                wordCountMap.set(formattedWord, wordCountMap.get(formattedWord) + 1);
            } else {
                wordCountMap.set(formattedWord, 1);
            }
            
        }
    }
    return wordCountMap;
}

module.exports = wordFrequencyCounter;
