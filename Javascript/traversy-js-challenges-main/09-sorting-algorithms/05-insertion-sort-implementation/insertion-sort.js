function insertionSort(array) {
    // start from the 2nd item in the array, so that the first
    // item is the initial item in the sorted (left) portion of the array
    for (let i = 1; i < array.length; i++) {
        // i is the index in the unsorted (right) portion of the array
        let currentItem = array[i];

        // this begins at the last index of the sorted (left) portion of the array
        let sortedInsertionIndex = i - 1;
        
        // uncomment below to see each iteration for debugging
        //console.log('*******************************************************************************************')
        //console.log(`Currently sorted: [${array.slice(0, i)}] -- inserting ${currentItem}`)

        // iterate downwards from the final index in the sorted portion of the array
        // for as long as the item at that index
        // is greater than the currentItem in the array, 
        // shifting each item to the right (to find the index for the current item to be inserted)
        while (sortedInsertionIndex >= 0 && array[sortedInsertionIndex] > currentItem) {
            array[sortedInsertionIndex + 1] = array[sortedInsertionIndex];
            sortedInsertionIndex--;
        }

        // insert the currentItem at one more than the sortedInsertionIndex
        array[sortedInsertionIndex + 1] = currentItem;
    }
    return array;
}

module.exports = insertionSort;
