function isPalindrome(stringToCheck) {
    // note: the regex can't be passed as a string
    const cleanedString = stringToCheck.toLowerCase().replace(/[^a-z0-9]/g, '');
    const reversedCleanedString = cleanedString.split('').reverse().join('');
    return cleanedString === reversedCleanedString;
}

module.exports = isPalindrome;
