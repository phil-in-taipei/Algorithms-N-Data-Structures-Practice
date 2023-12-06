function removeDuplicates(arr) {
    let nonDuplicates = [];
    for (let i = 0; i < arr.length; i++) {
        if (!nonDuplicates.includes(arr[i])) {
            nonDuplicates.push(arr[i]);
        }
    }
    return nonDuplicates;
}

module.exports = removeDuplicates;
