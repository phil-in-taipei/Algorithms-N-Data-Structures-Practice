function maxSubarraySum(arrOfNumbers,subarrayLength) {
    maxValueOfSubarrayItems = 0;
    for (let i = 0; i < subarrayLength; i++) {
        maxValueOfSubarrayItems += arrOfNumbers[i]
    }
    console.log(`This is the value at the end of the 1st subarray: ${maxValueOfSubarrayItems}`)
    console.log('---------------------------------------------------------------------------------------------------')
    let subarrayTotal = maxValueOfSubarrayItems;
    for (let j = 0; j + subarrayLength < arrOfNumbers.length; j++) {
        console.log('---------------------------------------------------------------------------------------------------')
        console.log(`Beginning next iteration at index ${j+1}, which is ${arrOfNumbers[j+1]} with current subarray total of ${subarrayTotal}`)
        console.log('---------------------------------------------------------------------------------------------------')
        console.log(`Subtract index ${j} value of ${arrOfNumbers[j]}`)
        subarrayTotal -= arrOfNumbers[j]
        console.log(`Add on index of ${j + subarrayLength }, value of ${arrOfNumbers[j + subarrayLength]}`)
        subarrayTotal += arrOfNumbers[j + subarrayLength]
        console.log('---------------------------------------------------------------------------------------------------')
        console.log(`New subarray total is: ${subarrayTotal}`)
        console.log('---------------------------------------------------------------------------------------------------')
        maxValueOfSubarrayItems = Math.max(subarrayTotal, maxValueOfSubarrayItems);
        console.log(`This is the new max array: ${maxValueOfSubarrayItems}`)
        console.log('---------------------------------------------------------------------------------------------------')

    }
    return maxValueOfSubarrayItems;
}

module.exports = maxSubarraySum;
