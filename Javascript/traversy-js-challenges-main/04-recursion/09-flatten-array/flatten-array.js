function flattenArray(nestedArray) {
    let flattenedArray = [];
    for (item of nestedArray) {
        if (typeof item === 'number') {
            flattenedArray.push(item);
        } else {
            flattenedArray = flattenedArray.concat(flattenArray(item));
        }
    }
    return flattenedArray;
    
}

module.exports = flattenArray;
