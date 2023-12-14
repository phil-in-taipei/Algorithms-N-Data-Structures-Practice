function areAllCharactersUnique(inputString) {
    
    let charCount = {};
    
    for (let i = 0; i < inputString.length; i++) {
        const char = inputString[i];
        if (charCount[char]) {
            return false;
        }
        charCount[char] = true;
    }

    return true;
}


module.exports = areAllCharactersUnique;
