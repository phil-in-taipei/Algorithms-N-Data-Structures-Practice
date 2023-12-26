function countDown(number) {
    if (number <= 0) {
        console.log("Finished!");
        return;
    }
    console.log(`The number is: ${number}`);
    number--;
    countDown(number);
}

module.exports = countDown;
