import calculations.*
import functions.*
import strings.Permutations
import strings.ReverseString


fun main() {
    println("-----------------------------------------------------------------------------------------------------------")
    //println("Implementing a countdown object for very basic recursion example:")
    println("Implementing a countdown function for a very basic recursion example:")
    println("-----------------------------------------------------------------------------------------------------------")

    //val countdown = Countdown(10)
    countdownFrom(10);
    //println("-----------------------------------------------------------------------------------------------------------")
    //countdown.printCountdown()
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to calculate sum of an array of integers")
    //val sumOfArrayOfIntegers = SumOfArrayOfIntegers(intArrayOf(1, 2, 3, 4, 5))
    val sumOfArrayOfIntegers = getSumOfIntegers(intArrayOf(1, 2, 3, 4, 5))

    println("-----------------------------------------------------------------------------------------------------------")
    //println("The result is: ${sumOfArrayOfIntegers.getSum()}")
    println("The result is: $sumOfArrayOfIntegers")

    println("-----------------------------------------------------------------------------------------------------------")
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to reverse a string")
    //val reverseString = ReverseString("mellow")
    val reverseString = reverseString("mellow");
    val doubleReverseString = reverseStringAlt(reverseString);
    println("-----------------------------------------------------------------------------------------------------------")
    //println("The reverse of 'mellow' is '${reverseString.getResult()}'")
    println("The reverse of 'mellow' is $reverseString")
    println("And reversed back via another function: $doubleReverseString")
    println("-----------------------------------------------------------------------------------------------------------")
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to get a list of integers in a range (1-5)")
    //val generateIntegersInRange = GenerateIntegersInRange(1, 5)
    val generateIntegersInRange = getIntegersInRange(1, 5)

    println("-----------------------------------------------------------------------------------------------------------")
    //val integersInRangeOutput = generateIntegersInRange.getOutput()
    //println("This is the output: ${integersInRangeOutput.contentToString()}")
    println("This is the output: ${generateIntegersInRange.joinToString()}")
    //generateIntegersInRange.forEach { number ->
    //    println(number)
    //}

    println("-----------------------------------------------------------------------------------------------------------")
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to generate Fibonacci value at index 6")
    //val fibonacci = Fibonacci(6)
    val fibonacci = getFibonacci(6)

    println("-----------------------------------------------------------------------------------------------------------")
    //println("This is the output: ${fibonacci.getValue()}")
    println("This is the output: $fibonacci")

    println("-----------------------------------------------------------------------------------------------------------")
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to generate Factorial of 5")
    //val factorial = Factorial(5)
    val factorial = getFactorial(5)

    println("-----------------------------------------------------------------------------------------------------------")
    //println("This is the output: ${factorial.getValue()}")
    println("This is the output: $factorial")

    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to generate all permutations of the string abc'")
    //val permutations = Permutations("abc")
    val permutations = getListOfPermutations("abc")

    println("-----------------------------------------------------------------------------------------------------------")
    //val permutationsOutput = permutations.getArray()
    //println("This is the output: $permutationsOutput")
    println("This is the output: $permutations")

    println("-----------------------------------------------------------------------------------------------------------")
    println(reverseDigits(54321))
    val recursivelyReverse = getReverseDigits(54321)
    println(recursivelyReverse)
}