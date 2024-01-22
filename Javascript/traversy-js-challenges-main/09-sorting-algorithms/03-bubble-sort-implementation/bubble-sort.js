function bubbleSort(array) {
    let swappingInProcess = true;
    while(swappingInProcess) {
        swappingInProcess = false; 
        for (let i = 1; i < array.length + 1; i++){
            if (array[i] < array[i - 1]) {
                let temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                swappingInProcess = true;
            }
        }
    }
    return array;

}

module.exports = bubbleSort;
