function twoSum(arrayOfNumbers, sum) {
    let alreadyTried = new Set();
    for (let i = 0; i < arrayOfNumbers.length; i++) {
        const complement = sum - arrayOfNumbers[i];
        if (alreadyTried.has(complement)) {
            return [arrayOfNumbers.indexOf(complement), i]
        }
        alreadyTried.add(arrayOfNumbers[i]);
    }
    return [];
}

module.exports = twoSum;
