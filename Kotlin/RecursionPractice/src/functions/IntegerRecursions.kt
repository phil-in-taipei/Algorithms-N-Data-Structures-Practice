package functions

fun countdownFrom(countdownInt: Int) {
    if (countdownInt == 0) {
        println("Blast Off")
        return
    }
    println("The number is: $countdownInt")
    countdownFrom(countdownInt - 1)
}

fun getIntegersInRange(starting : Int, finishing : Int): IntArray {
    if (starting == finishing) {
        return intArrayOf(starting)
    }
    return getIntegersInRange(starting, finishing - 1) + finishing
}

fun getFactorial(int: Int): Int {
    if (int == 1) {
        return int
    }
    return getFactorial(int - 1) * int
}

fun getFibonacci(index : Int): Int {
    if (index == 1 || index == 2) {
        return 1
    }
    return getFibonacci(index - 1) + getFibonacci(index - 2)
}

fun getSumOfIntegers(intArray: IntArray): Int {
    if (intArray.isEmpty()) {
        return 0;
    }
    val firstItem = intArray[0]
    val restOfArray = intArray.drop(1)
    return getSumOfIntegers(restOfArray.toIntArray()) + firstItem
}

// note: the function below is iterative and just for reference
fun reverseDigits(int: Int): Int {
    var reversedInt = 0
    var diminishingInt = int
    while (diminishingInt != 0) {
        reversedInt = (reversedInt * 10) + diminishingInt % 10
        diminishingInt /= 10
    }
    return reversedInt
}

fun recursivelyReverseDigits(reversedInt: Int, diminishingInt: Int): Int {
    if (diminishingInt == 0) {
        return reversedInt
    }
    return recursivelyReverseDigits(
        reversedInt = (reversedInt * 10) + diminishingInt % 10,
        diminishingInt= diminishingInt/ 10
    )
}

fun getReverseDigits(int: Int): Int {
    return recursivelyReverseDigits(reversedInt=0, diminishingInt=int)
}
