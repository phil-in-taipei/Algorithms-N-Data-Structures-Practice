package numbers

import calculator.Calculator
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ArrayOfNumbersTest {

    private val numbers = intArrayOf(2, 1, 9, 16, 10)

    private val arrayOfNumbers = ArrayOfNumbers(numbers)

    @Test
    fun getHighestNumber() {
    }

    @Test
    fun getNumbers() {
       assertEquals(numbers, arrayOfNumbers.numbers)
    }
}