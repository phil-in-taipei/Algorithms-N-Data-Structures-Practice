function findMissingLetter(inputArr) {
    let realAlphabet ="abcdefghijklmnopqrstuvwxyz";
    let startingChar = inputArr[0];
    if (startingChar === startingChar.toUpperCase()) {
        realAlphabet = realAlphabet.toUpperCase();
    }
    let startIndex = realAlphabet.indexOf(startingChar);
    for (let i = startIndex; i < startIndex + inputArr.length; i++) {
        if (inputArr.indexOf(realAlphabet[i]) === -1) {
            return realAlphabet[i]
        }
    }
    return '';
}

module.exports = findMissingLetter;
