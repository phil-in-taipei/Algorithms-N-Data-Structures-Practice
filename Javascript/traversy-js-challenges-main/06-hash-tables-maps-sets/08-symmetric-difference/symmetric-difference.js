function symmetricDifference(array1, array2) {
    const set1 = new Set(array1);
    const set2 = new Set(array2);
    let uniqueValuesSet = new Set();
    for (const item of set1) {
        if (!set2.has(item)) {
            uniqueValuesSet.add(item);
        }
    }
    for (const item of set2) {
        if (!set1.has(item)) {
            uniqueValuesSet.add(item);
        }
    }
    return [...uniqueValuesSet];
};

module.exports = symmetricDifference;
