// with this helper function -- it doesn't work
// come back to this later!

function choosePivot(arrayLength) {
    // median of 3 random indexes
    const firstRandom = Math.floor(Math.random() * arrayLength);
    const secondRandom = Math.floor(Math.random() * arrayLength);
    const thirdRandom = Math.floor(Math.random() * arrayLength);
    if (firstRandom > secondRandom) {
        if (secondRandom > thirdRandom) return secondRandom;
        else if (firstRandom > thirdRandom) return thirdRandom; 
        else return firstRandom;
      } else {  
        if (firstRandom > thirdRandom) return firstRandom;
        else if (secondRandom > thirdRandom) return thirdRandom;
        else return secondRandom;  
    }
}

// this approach only works when the last element is the pivot.
function quickSort(array) {
    console.log(`'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''`)
    console.log(`-----------Recursive teration with array: ${array}-------------------`)
    console.log(`'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''`)

    if (array.length <= 1) {
        console.log(`This is an array with one or zero elements (unwind): ${array}`)
        return array;
    }
    
    const pivot = array[array.length - 1];
    //const pivot = array[choosePivot(array.length -1)];
    //const pivot = Math.floor((array.length) / 2);
    console.log(`This is the pivot ${pivot}`);

    const left = [];
    const right = [];

    for (let i = 0; i < array.length - 1; i++) {
        // Compare each element with the pivot
        if (array[i] < pivot) {
          // If it's less than the pivot, push it to the left array
          left.push(array[i]);
        } else {
          // Otherwise, push it to the right array
          right.push(array[i]);
        }
    }

    return [...quickSort(left), pivot, ...quickSort(right)];


}

module.exports = quickSort;
