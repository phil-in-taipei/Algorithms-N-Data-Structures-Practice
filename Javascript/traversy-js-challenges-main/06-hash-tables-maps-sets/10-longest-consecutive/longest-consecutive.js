/*
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
*/
function longestConsecutiveSequence(arrayOfNumbers) {
    const setOfNumbers = new Set(arrayOfNumbers);
    //console.log(`This is the set of numbers: ${Array.of(setOfNumbers)}`);
    let longestConsecutive = 0;
    for (let num of setOfNumbers) {
        //console.log(`This is the number: ${num}`)
        if (setOfNumbers.has(num - 1)) { // it is the 2nd number, so continue to count
            let countingConsecutive = 2;
            while (setOfNumbers.has(num + 1)) {
                countingConsecutive++;
                num++;
            }
            longestConsecutive = Math.max(countingConsecutive, longestConsecutive);
        }
    }
    return longestConsecutive;
}

module.exports = longestConsecutiveSequence;
