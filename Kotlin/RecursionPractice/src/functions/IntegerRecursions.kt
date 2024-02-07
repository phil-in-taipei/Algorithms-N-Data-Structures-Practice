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

fun sumOfIntegers(intArray: IntArray): Int {
    if (intArray.isEmpty()) {
        return 0;
    }
    val firstItem = intArray[0]
    val restOfArray = intArray.drop(1)
    return sumOfIntegers(restOfArray.toIntArray()) + firstItem
}
