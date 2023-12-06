function countVowels(stringToCheck) {
    const listOfVowels = ['a', 'e', 'i', 'o', 'u'];
    let numberOfVowelsInString = 0;
    for (let i = 0; i < stringToCheck.length; i++) {
        if (listOfVowels.includes(stringToCheck.charAt(i).toLowerCase())) {
            numberOfVowelsInString++;
        }
    }
    return numberOfVowelsInString;
}

module.exports = countVowels;
