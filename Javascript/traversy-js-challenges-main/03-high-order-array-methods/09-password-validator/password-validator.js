const itHasAtLeastEightCharacters = (string) => string.length >= 8;

const itHasAtLeastOneUpperCaseLetter = (stringCharsArray) => stringCharsArray.some(
    (char) => char.charCodeAt(0) > 64 && char.charCodeAt(0) < 91);

const itHasAtLeastOneLowerCaseLetter = (stringCharsArray) => stringCharsArray.some(
        (char) => char.charCodeAt(0) > 96 && char.charCodeAt(0) < 123);

const itHasAtLeastOneNumericDigit = (stringCharsArray) => stringCharsArray.some(
        (char) => char.charCodeAt(0) > 47 && char.charCodeAt(0) < 58);
    

function validatePassword(string) {
    const stringCharsArray = string.split("");
    return  itHasAtLeastEightCharacters(string)
            && itHasAtLeastOneLowerCaseLetter(stringCharsArray) 
            && itHasAtLeastOneUpperCaseLetter(stringCharsArray) 
            && itHasAtLeastOneNumericDigit(stringCharsArray);
};

module.exports = validatePassword;
