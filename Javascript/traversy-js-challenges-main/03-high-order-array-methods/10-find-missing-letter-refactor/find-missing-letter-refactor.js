// My first approach:

/*
function findMissingLetter(arrayOfLetters) {
    const firstLetterUnicodeValue = arrayOfLetters[0].charCodeAt(0);
    const lastLetterUnicodeValue = arrayOfLetters[arrayOfLetters.length -1].charCodeAt(0);
    const expectedSumOfUnicodeValues = (lastLetterUnicodeValue * (lastLetterUnicodeValue + 1) / 2);
    const sumOfUnicodeValuesUpToFirstLetterInArray = (firstLetterUnicodeValue * (firstLetterUnicodeValue + 1) / 2);
    const sumOfUnicodeValuesInArray = arrayOfLetters.reduce((total, char) => {
        return total + char.charCodeAt(0);
    }, 0);   
    const sumOfUnicodeValuesInArrayAndUpToFirstLetterInArray = sumOfUnicodeValuesInArray + sumOfUnicodeValuesUpToFirstLetterInArray
    const differenceInUnicodeValues = expectedSumOfUnicodeValues - sumOfUnicodeValuesInArrayAndUpToFirstLetterInArray
    const unicodeValueOfMissingLetter = firstLetterUnicodeValue + differenceInUnicodeValues;
  return unicodeValueOfMissingLetter ? String.fromCharCode(unicodeValueOfMissingLetter) : '';
}
*/

function findMissingLetter(arr) {
    let previousCode = arr[0].charCodeAt(0); // starts with the code of the first array
    const missingCharCode = arr.slice(1) // start from 2nd item in array
      .map((char) => { return char.charCodeAt(0)})
      .find((current) => {
        console.log(`This is the difference: ${current - previousCode}`)
        if (current - previousCode > 1) {
          return true;
        }
        previousCode = current; // next iteration will check whether it is one more than the item at this index
        return false;
      });
    // if `missingCharCode` is truthy then return the character that is one less than the character code
    return missingCharCode ? String.fromCharCode(missingCharCode - 1) : '';
  }



module.exports = findMissingLetter;
