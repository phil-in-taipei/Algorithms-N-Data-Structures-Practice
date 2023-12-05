function titleCase(str) {
    let arrOfWords = str.split(' ');
    let newlyFormattedString = '';
    for (let i =0; i < arrOfWords.length; i++) {
        arrOfWords[i] = arrOfWords[i].charAt(0).toUpperCase() + arrOfWords[i].substr(1).toLowerCase();
        newlyFormattedString = newlyFormattedString + ' ' + arrOfWords[i];
    }
    return newlyFormattedString.substring(1);
}

module.exports = titleCase;
