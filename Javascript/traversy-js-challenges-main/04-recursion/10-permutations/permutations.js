function permutations(string) {
    let arrayOfPermutations = [];
    if (string === '') {
        arrayOfPermutations.push(string);
        return arrayOfPermutations;
    }
    for (let i =0; i < string.length; i++) {
        const currentChar = string[i];
        const restOfString = string.slice(0, i) + string.slice(i + 1);
        const subPermutations = permutations(restOfString);
        for (let j = 0; j < subPermutations.length; j++) {
            arrayOfPermutations.push(currentChar + subPermutations[j]);
        }
    }
    return arrayOfPermutations;
}

module.exports = permutations;
