function reverseString(wordToBeReversed) {
    let reversedString = '';
    for (let i=wordToBeReversed.length; i > 0; i--) {
        reversedString = reversedString + wordToBeReversed.charAt(i - 1);
    }
    //let reversedString = wordToBeReversed.split('').reverse().join('');
    return reversedString;
}

module.exports = reverseString;
