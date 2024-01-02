function longestConsecutiveSequence(arrayOfNumbers) {
    let longestConsecutive = 0;
    let countingConsecutive = 1;
    const setOfNumbers = Array.from(new Set(arrayOfNumbers.sort(function (a, b) {  return a - b;  })));
    for (let i =1; i < setOfNumbers.length; i++) {
        if (setOfNumbers[i] - setOfNumbers[i  -1] === 1) {
            countingConsecutive++;
            if (countingConsecutive > longestConsecutive) {
                longestConsecutive = countingConsecutive;
            } 
        } else {
            countingConsecutive = 1;
        }
    }
    return longestConsecutive;
}

module.exports = longestConsecutiveSequence;
