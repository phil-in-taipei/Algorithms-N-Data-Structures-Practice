import calculator.Calculator

fun main(args: Array<String>) {
    println("----------------------------------------------------")
    println("Initializing calculator class with values 10 and 2")
    val calculator = Calculator(num1=10, num2=2)
    println("----------------------------------------------------")
    println("The addition value is ${calculator.add()}")
    println("----------------------------------------------------")
    println("The subtraction value is ${calculator.subtract()}")
    println("----------------------------------------------------")
    println("The division value is ${calculator.divide()}")
    println("----------------------------------------------------" )
    println("The multiplication value is ${calculator.multiply()}")
    println("----------------------------------------------------" )
}