function maxSubarraySum(arrOfNumbers,subarrayLength) {
    maxValueOfSubarrayItems = 0;
    for (let i = 0; i < subarrayLength; i++) {
        maxValueOfSubarrayItems += arrOfNumbers[i]
    }
    let subarrayTotal = maxValueOfSubarrayItems;
    for (let j = 0; j + subarrayLength < arrOfNumbers.length; j++) {
        subarrayTotal -= arrOfNumbers[j]
        subarrayTotal += arrOfNumbers[j + subarrayLength]
        maxValueOfSubarrayItems = Math.max(subarrayTotal, maxValueOfSubarrayItems);

    }
    return maxValueOfSubarrayItems;
}

module.exports = maxSubarraySum;
