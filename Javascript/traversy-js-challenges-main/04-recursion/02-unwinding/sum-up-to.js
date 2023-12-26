function sumUpTo(n) {
    if (n === 1) {
        return 1;
    }
    //console.log(number);
    return n + sumUpTo(n - 1);
}

module.exports = sumUpTo;
