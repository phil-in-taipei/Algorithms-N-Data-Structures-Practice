function arraySum(arrayOfNumbers) {
    if (arrayOfNumbers.length === 0) {
        return 0;
    }
    return arrayOfNumbers[0] + arraySum(arrayOfNumbers.slice(1));
}

module.exports = arraySum;
