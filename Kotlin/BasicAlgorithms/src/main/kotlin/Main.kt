import calculator.Calculator
import numbers.ArrayOfNumbers

fun main(args: Array<String>) {
    println("----------------------------------------------------------------------------------------------")
    println("Initializing calculator class with values 10 and 2")
    val calculator = Calculator(num1=10, num2=2)
    println("----------------------------------------------------------------------------------------------")
    println("The addition value is ${calculator.add()}")
    println("----------------------------------------------------------------------------------------------")
    println("The subtraction value is ${calculator.subtract()}")
    println("----------------------------------------------------------------------------------------------")
    println("The division value is ${calculator.divide()}")
    println("----------------------------------------------------------------------------------------------" )
    println("The multiplication value is ${calculator.multiply()}")
    println("----------------------------------------------------------------------------------------------" )
    println("----------------------------------------------------------------------------------------------")
    println("Initializing ArrayOfNumbers class with values 2, 1, 9, 16, and 10")
    val arrayOfNumbers = ArrayOfNumbers(numbers = intArrayOf(2, 1, 9, 16, 10))
    println("----------------------------------------------------------------------------------------------")
    println("The highest value is ${arrayOfNumbers.getHighestNumber()}")
    println("----------------------------------------------------------------------------------------------")
}