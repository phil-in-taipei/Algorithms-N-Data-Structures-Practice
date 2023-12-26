function numberRange(startNum, finishNum) {
    if (startNum === finishNum) {
        return [finishNum];
    }

    const numberArray = numberRange(startNum, finishNum -1);
    numberArray.push(finishNum);
    return numberArray;
}

module.exports = numberRange;
