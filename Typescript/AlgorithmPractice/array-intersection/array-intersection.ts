function arrayIntersection(arr1: any[], arr2: any[]): any[] {
    let inBothArrays: any[] = [];
    for (let i = 0; i < arr1.length; i++) {
        if (arr2.includes(arr1[i])) {
            inBothArrays.push(arr1[i]);
        }
    }
    return inBothArrays;
}

module.exports = arrayIntersection;