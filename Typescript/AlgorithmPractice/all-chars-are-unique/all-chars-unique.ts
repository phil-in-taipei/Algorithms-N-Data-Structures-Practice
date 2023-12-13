interface StringBooleanMap {
    [key: string]: boolean;
}

function allCharactersUnique(inputString: string): boolean {
    let objectOfStringChars: StringBooleanMap = {};
    for (let i = 0; i < inputString.length; i++) {
        if (objectOfStringChars[inputString[i]]) {
            return false;
        }
        objectOfStringChars[inputString[i]] = true;
    }
    return true;
}

module.exports = allCharactersUnique;