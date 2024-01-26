import calculations.Countdown
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

}