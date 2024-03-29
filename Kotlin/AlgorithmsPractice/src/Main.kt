import arrayIntersection.ArrayIntersection
import displayLikes.DisplayLikes
import fizzbuzz.FizzBuzz
import allCharsAreUnique.AllCharsAreUnique
import findMissing.FindMissingNumber
import findMissing.FindMissingLetter
import reverseInteger.ReverseInteger


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
    val arrayIntersection = ArrayIntersection(
                                intArrayOf(1, 2, 3, 4, 5),
                                intArrayOf(3, 4, 5, 6, 7))
                                    .getIntersectingValues()
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
    println("----------------------------------------------------------------------------------------------")
    println("Initializing all chars are unique class to test string: 'bigbang'")
    val allCharsAreUnique1: AllCharsAreUnique = AllCharsAreUnique("bigbang")
    println("Result: " + allCharsAreUnique1.getVerdict())
    println("----------------------------------------------------------------------------------------------")
    println("----------------------------------------------------------------------------------------------")
    println("Initializing all chars are unique class to test string: 'sunray'")
    val allCharsAreUnique2: AllCharsAreUnique = AllCharsAreUnique("sunray")
    println("Result: " + allCharsAreUnique2.getVerdict())
    println("----------------------------------------------------------------------------------------------")
    println("----------------------------------------------------------------------------------------------")
    println("Initializing all chars are unique class to test empty string")
    val allCharsAreUnique3: AllCharsAreUnique = AllCharsAreUnique("")
    println("Result: " + allCharsAreUnique3.getVerdict())
    println("----------------------------------------------------------------------------------------------")
    println("----------------------------------------------------------------------------------------------")
    println("Initializing find missing number class with '1, 2, 4, 5, 6'")
    val findMissingNumber1 = FindMissingNumber(intArrayOf(1, 2, 4, 5, 6))
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + findMissingNumber1.getResult())
    println("----------------------------------------------------------------------------------------------")
    println("Initializing find missing number class with no values input")
    val findMissingNumber2 = FindMissingNumber(intArrayOf())
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + findMissingNumber2.getResult())
    println("----------------------------------------------------------------------------------------------")
    println("Initializing find missing number class with '5, 2, 4, 1, 6'")
    val findMissingNumber3 = FindMissingNumber(intArrayOf(5, 2, 4, 1, 6))
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + findMissingNumber3.getResult())
    println("----------------------------------------------------------------------------------------------")
    println("----------------------------------------------------------------------------------------------")
    println("Initializing find missing letter class with 'C', 'D', 'E', 'F', 'H', 'I'")
    val findMissingLetter1 = FindMissingLetter(charArrayOf('C', 'D', 'E', 'F', 'H', 'I'))
    println("----------------------------------------------------------------------------------------------")
    println("Result: " + findMissingLetter1.getResult())
    println("----------------------------------------------------------------------------------------------")
    val reverseInt = ReverseInteger(123456)
    println("Initializing reverse integer class with the following integer: ${reverseInt.getInt()}")
    println("----------------------------------------------------------------------------------------------")
    println("Iterative Result: " + reverseInt.reverseIteratively())
    println("----------------------------------------------------------------------------------------------")
    println("Recursive Result: " + reverseInt.reverseRecursively())
    println("----------------------------------------------------------------------------------------------")
}