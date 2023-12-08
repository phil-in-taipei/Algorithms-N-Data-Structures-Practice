function fizzBuzzArray(numberToCountUntil) {
    fizzBuzzArray = []
    let i = 0;
    while(i < numberToCountUntil) {
        i++;
        divisibleBy3Or5 = false;
        let returnString = "";
        if (i % 3 === 0) {
            returnString += "Fizz"
            divisibleBy3Or5 = true
        }
        if (i % 5 === 0) {
            returnString += "Buzz"
            divisibleBy3Or5 = true;
        }
        if (divisibleBy3Or5) {
            fizzBuzzArray.push(returnString);
        } else {
            fizzBuzzArray.push(i);
        }

    }
    return fizzBuzzArray;
}

module.exports = fizzBuzzArray;
