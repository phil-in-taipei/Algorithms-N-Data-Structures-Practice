function power(num, powOf) {
    if (powOf === 0) {
        return 1;
    }
    return num * power(num, powOf - 1);
}

module.exports = power;
