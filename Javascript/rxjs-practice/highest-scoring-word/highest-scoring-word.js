import { from } from 'rxjs';
import { reduce } from 'rxjs/operators';

function getCharScore(char) {
    const alphabet = 'abcdefghijklmnopqrstuvwxyz';
    return alphabet.indexOf(char) + 1;
};

function getMaxValueKey(obj) {
    return Object.keys(obj).reduce((a, b) => obj[a] > obj[b] ? a : b);
  }


function getWordScore(word) {
    let wordScore;
    const wordScore$ = from(word.split(""))
        .pipe(
            reduce((total, char) => total + getCharScore(char), 0)  
        )
    wordScore$.subscribe((total) => {
        wordScore = total;
    }).unsubscribe()
    return wordScore;
};

function highestScoringWord(stringOfWords) {
    const arrayOfWords = stringOfWords.split(" ");
    let wordScores = {};
    arrayOfWords.forEach((word) => {
        wordScores[word] = getWordScore(word);
    });
    return getMaxValueKey(wordScores);
};

export default highestScoringWord;


