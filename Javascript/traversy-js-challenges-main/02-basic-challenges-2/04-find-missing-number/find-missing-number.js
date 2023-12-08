function findMissingNumber(arrayOfNumbers) {
    if (arrayOfNumbers.length === 0) {
        return 1;
    }
    const n = arrayOfNumbers.length + 1;
    const expectedSumOfNumbers = (n * (n + 1) / 2);
    let actualSum = 0;
    for (let i=0; i < arrayOfNumbers.length; i++) {
        actualSum += arrayOfNumbers[i]
    }
    return expectedSumOfNumbers - actualSum;

}

module.exports = findMissingNumber;
