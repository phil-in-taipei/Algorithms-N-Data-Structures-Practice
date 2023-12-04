package numbers

class ArrayOfNumbers(val numbers: IntArray) {

    fun getHighestNumber():Int {
        var highestNumber = 0;
        numbers.forEach { number ->
            if(number > highestNumber) {
                highestNumber = number;
            }
        }
        return highestNumber;
    }
}