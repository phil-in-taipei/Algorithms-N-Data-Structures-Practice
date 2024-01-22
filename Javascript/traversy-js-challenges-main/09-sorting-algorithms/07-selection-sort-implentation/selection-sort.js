
// first approach: helper function to find lowest element in subarray
/*
function getIndexOfLowestElement(subarray) {
    let lowestValue = subarray[0];
    let indexOfLowestValue = 0;
    for (let i = 1; i < subarray.length; i++) {
        if(subarray[i] < lowestValue) {
            lowestValue = subarray[i];
            indexOfLowestValue = i;
        }
    }
    return indexOfLowestValue;
}

function selectionSort(array) {
    for (let i = 0; i < array.length; i++) {
        let swapIndex = getIndexOfLowestElement(array.slice(i, array.length)) + i;
        [array[i], array[swapIndex]] = [array[swapIndex], array[i]];
    }
    return array;
}
*/

function selectionSort(array) {
    // iterate through the entire array, and with each iteration, do a subiteration from the outer array index
    // to the end of the array -- find the index of the lowest value in each subiteration
    for (let outerArrayIndex = 0; outerArrayIndex < array.length; outerArrayIndex++) {
        // ititially set the minimum index to be the index of the current iteration
        let indexOfLowestValue = outerArrayIndex;

        // iterate through subarray (items from the current outterArrayIndex to the end of the array)
        //and set the minIndex to the index of the lowest value item in the subarray 
        for (let subarrayIndex = outerArrayIndex + 1; subarrayIndex < array.length; subarrayIndex++) {
            if (array[subarrayIndex] < array[indexOfLowestValue]) {
                indexOfLowestValue = subarrayIndex;
              }
        }

        // if the indexes are not the same (the lowest value is no longer the same as the outer array index), 
        //then swap the values at the two indexes
        if (indexOfLowestValue !== outerArrayIndex) {
            const temp = array[outerArrayIndex];
            array[outerArrayIndex] = array[indexOfLowestValue];
            array[indexOfLowestValue] = temp;
        }
    }
    return array;
}

module.exports = selectionSort;
