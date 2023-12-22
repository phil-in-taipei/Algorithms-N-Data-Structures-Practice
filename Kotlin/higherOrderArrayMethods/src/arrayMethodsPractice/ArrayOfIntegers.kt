package arrayMethodsPractice

class ArrayOfIntegers(
    private val arrayOfNumbers: IntArray
) {

    fun allItemsAreLessThanTen(): Boolean {
        return this.arrayOfNumbers.all { it < 10 }
    }
    fun squareEachItem(): List<Int> {
        return this.arrayOfNumbers.map { it * it }
    }
    fun getSumOfSquares(): Int {
        return this.squareEachItem().sum()
    }

    fun getSumOfSquaresAltApproach(): Int {
        return this.arrayOfNumbers.map { it * it }.reduce { acc, value -> acc + value }
    }

    fun getEvenIntegers(): List<Int> {
        return this.arrayOfNumbers.filter { it % 2 == 0 }
    }

    fun getFirstIntegerGreaterThanThreeOrNull(): Int? {
        return this.arrayOfNumbers.firstOrNull { it > 3 }
    }

    fun hasOneOrMoreItemsGreaterThanFive(): Boolean {
        return this.arrayOfNumbers.any { it > 5 }
    }
}