// My first approach:

function findMissingLetter(arrayOfLetters) {
    const firstLetterUnicodeValue = arrayOfLetters[0].charCodeAt(0);
    const lastLetterUnicodeValue = arrayOfLetters[arrayOfLetters.length -1].charCodeAt(0);
    const expectedSumOfUnicodeValues = (lastLetterUnicodeValue * (lastLetterUnicodeValue + 1) / 2);
    const sumOfUnicodeValuesUpToFirstLetterInArray = (firstLetterUnicodeValue * (firstLetterUnicodeValue + 1) / 2);
    const sumOfUnicodeValuesInArray = arrayOfLetters.reduce((total, char) => {
        return total + char.charCodeAt(0);
    }, 0);    
    const differenceInUnicodeValues = expectedSumOfUnicodeValues - (
                                            sumOfUnicodeValuesInArray + sumOfUnicodeValuesUpToFirstLetterInArray
                                        );
    const unicodeValueOfMissingLetter = firstLetterUnicodeValue + differenceInUnicodeValues;
    return String.fromCharCode(unicodeValueOfMissingLetter);
}




module.exports = findMissingLetter;
