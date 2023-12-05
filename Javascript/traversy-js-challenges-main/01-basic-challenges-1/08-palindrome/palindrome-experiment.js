function stringIsAPalindrome(stringToCheck) {
    // first format the string to get rid of alphanumeric chars with a regex
    const cleanedString = stringToCheck.toLowerCase().replace(/[^a-z0-9]/g, '');

    // iterate through half of the string 
    // checking if each char on the left and right side
    // moving inward to the center are different
    // If they are, return false and stop iterating
    for (let i=1; i < cleanedString.length / 2; i++) {
        let leftChar = cleanedString[i-1];
        let rightChar = cleanedString[cleanedString.length - i];
        if(leftChar !== rightChar) {
            return false;
        }
    }
    // having gone through the entire loop, each char on the left and right side
    // were the same moving inward, so it's a palindrome
    return true;
}

module.exports = stringIsAPalindrome;
