import arrayIntersection.ArrayIntersection
import displayLikes.DisplayLikes
import fizzbuzz.FizzBuzz


fun main() {
    println("----------------------------------------------------------------------------------------------")
    println("Initializing fizzbuzz class with value of 15")
    val fizzbuzz = FizzBuzz(upUntil = 15).getFizzBuzz()
    println("----------------------------------------------------------------------------------------------")
    println("The fizzbuzz values are: ")
    for (item in fizzbuzz) {
        println(item)
    }
    println("---------------------------------------------------------------------------------------------")
    println("----------------------------------------------------------------------------------------------")
    println("Initializing array intersection class")
    val arrayIntersection = ArrayIntersection(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 6, 7)).getIntersectingValues()
    for (i in arrayIntersection) {
        println(i)
    }
    println("----------------------------------------------------------------------------------------------")
    println("----------------------------------------------------------------------------------------------")
    println("Initializing display likes class")
    val displayLikes1: DisplayLikes = DisplayLikes(arrayOf("Jack"))
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + displayLikes1.getLikesMessage())
    println("----------------------------------------------------------------------------------------------")
    println("Initializing display likes class")
    val displayLikes2: DisplayLikes = DisplayLikes(arrayOf("Jack", "Alice"))
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + displayLikes2.getLikesMessage())
    println("----------------------------------------------------------------------------------------------")
    println("Initializing display likes class")
    val displayLikes3: DisplayLikes = DisplayLikes(arrayOf("Jack", "Alice", "Laura"))
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + displayLikes3.getLikesMessage())
    println("----------------------------------------------------------------------------------------------")
    println("Initializing display likes class")
    val displayLikes4: DisplayLikes = DisplayLikes(arrayOf("Jack", "Alice", "Laura", "Wanda"))
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + displayLikes4.getLikesMessage())
    println("----------------------------------------------------------------------------------------------")
    println("Initializing display likes class")
    val displayLikes5: DisplayLikes = DisplayLikes(arrayOf())
    println("Result: " + displayLikes5.getLikesMessage())
    println("----------------------------------------------------------------------------------------------")
}