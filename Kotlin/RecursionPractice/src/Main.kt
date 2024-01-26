import calculations.Countdown
import calculations.GenerateIntegersInRange
import calculations.SumOfArrayOfIntegers
import strings.ReverseString


fun main() {
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing a countdown object for very basic recursion example:")
    val countdown = Countdown(10)
    println("-----------------------------------------------------------------------------------------------------------")
    countdown.printCountdown()
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to calculate sum of an array of integers")
    val sumOfArrayOfIntegers = SumOfArrayOfIntegers(intArrayOf(1, 2, 3, 4, 5))
    println("-----------------------------------------------------------------------------------------------------------")
    println("The result is: ${sumOfArrayOfIntegers.getSum()}")
    println("-----------------------------------------------------------------------------------------------------------")
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to reverse a string")
    val reverseString = ReverseString("mellow")
    println("-----------------------------------------------------------------------------------------------------------")
    println("The reverse of 'mellow' is '${reverseString.getResult()}'")
    println("-----------------------------------------------------------------------------------------------------------")
    println("-----------------------------------------------------------------------------------------------------------")
    println("Implementing recursion to get a list of integers in a range (1-5")
    val generateIntegersInRange = GenerateIntegersInRange(1, 5)
    println("-----------------------------------------------------------------------------------------------------------")
    val output = generateIntegersInRange.getOutput()
    println("This is the output: ${output.contentToString()}")
    println("-----------------------------------------------------------------------------------------------------------")

}