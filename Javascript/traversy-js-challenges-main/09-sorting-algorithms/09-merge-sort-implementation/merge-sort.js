function merge(left, right) {
    console.log('************************************************************************')
    console.log('------------------Merge----------------------')
    console.log(`Now merging left (${left}) with right ${right}`)
    const merged = [];
    let leftIndex = 0;
    let rightIndex = 0;
  
    while (leftIndex < left.length && rightIndex < right.length) {
      if (left[leftIndex] < right[rightIndex]) {
        merged.push(left[leftIndex]);
        leftIndex++;
      } else {
        merged.push(right[rightIndex]);
        rightIndex++;
      }
    }

    console.log(`After sorting: ${merged}`)

    const remainingLeft = left.slice(leftIndex);

    console.log(`Remaining left: ${remainingLeft}`)
;
    const remainingRight = right.slice(rightIndex);
  
    console.log(`Remaining right: ${remainingRight}`)

    const mergeOutput =  merged.concat(remainingLeft).concat(remainingRight);

    console.log(`Merged output: ${mergeOutput}`)
    console.log('************************************************************************')

    return mergeOutput;
  }

  function mergeSort(arr) {
    console.log('<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>');
    console.log(`Recursively calling mergeSort: ${arr}`);
    if (arr.length <= 1) {
        console.log(`@@@@@@@Only one item in array -- return (unwind)@@@@@@@@@@`)
      return arr;
    }
  
    const mid = Math.floor(arr.length / 2);
    console.log('++++++++++++++++++++++++Dividing the array into two+++++++++++++++++')
    const left = mergeSort(arr.slice(0, mid));
    const right = mergeSort(arr.slice(mid));
    console.log('+++++++++++++++++++Now merging two halves+++++++++++++++++++++++')
    return merge(left, right);
  }

module.exports = mergeSort;
