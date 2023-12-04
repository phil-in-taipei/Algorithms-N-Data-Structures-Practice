function titleCase(str) {
    let arrOfWords = str.split(' ');
    console.log('this is the array of words: ' + arrOfWords);
    let newlyFormattedString = '';
    for (let i =0; i < arrOfWords.length; i++) {
        console.log('This is the word at index ' + i + ': ' + arrOfWords[i])
        arrOfWords[i] = arrOfWords[i].charAt(0).toUpperCase() + arrOfWords[i].substr(1).toLowerCase();
        console.log('This is the altered word at index ' + i + ': ' + arrOfWords[i])
        newlyFormattedString = newlyFormattedString + ' ' + arrOfWords[i];
    }
    return newlyFormattedString.substring(1);;
}

module.exports = titleCase;
