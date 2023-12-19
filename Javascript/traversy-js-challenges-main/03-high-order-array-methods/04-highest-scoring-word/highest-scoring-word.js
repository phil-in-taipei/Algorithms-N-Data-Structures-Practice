function getCharScore(char) {
    const alphabet = 'abcdefghijklmnopqrstuvwxyz';
    return alphabet.indexOf(char) + 1;
};

// typescript version of helper function
//function getMaxValueKey(obj: {[key: string]: number}): string {
//    return Object.keys(obj).reduce((a, b) => obj[a] > obj[b] ? a : b);
//  }
function getMaxValueKey(obj) {
    return Object.keys(obj).reduce((a, b) => obj[a] > obj[b] ? a : b);
  }

function getWordScore(word) {
    const stringAsArray = word.split("");
    return stringAsArray.reduce((total, char) => {
        return total + getCharScore(char);
    }, 0);
};

// approach 1
/*
function highestScoringWord(stringOfWords) {
    const arrayOfWords = stringOfWords.split(" ");
    let wordScores = {};
    arrayOfWords.forEach((word) => {
        wordScores[word] = getWordScore(word);
    });
    return getMaxValueKey(wordScores);
};
*/

// approach 2

function highestScoringWord(stringOfWords) {
    const arrayOfWords = stringOfWords.split(" ");
    let arrayOfWordScores = [];
    arrayOfWords.forEach((word) => {
        arrayOfWordScores.push(getWordScore(word));
    });
    const maxWordScoreValue = Math.max.apply(Math, arrayOfWordScores);
    const indexOfMaxValue = arrayOfWordScores.indexOf(maxWordScoreValue);
    return arrayOfWords[indexOfMaxValue];
};

module.exports = highestScoringWord;
