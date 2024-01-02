function anagramGrouping(words) {
    wordsMap = new Map();
    for (const word of words) {
        wordKey = word.split("").sort().join("");
        if (wordsMap.has(wordKey)) {
            //let revised = wordsMap.get(wordKey);
            //revised.push(word);
            //wordsMap.set(wordKey, revised);
            wordsMap.get(wordKey).push(word);
        } else {
            wordsMap.set(wordKey, [word]);
        }
    }

    return Array.from(wordsMap.values());
}

module.exports = anagramGrouping;
