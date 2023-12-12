package fizzbuzz

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz(upUntil = 15);
    var fizzBuzzList: MutableList<Any> = mutableListOf(
        1, 2, "fizz", 4, "buzz", "fizz", 7, 8,
        "fizz", "buzz", 11, "fizz", 13, 14, "fizzbuzz"
    );

    @Test
    fun getFizzBuzz() {
        val results = this.fizzBuzz.getFizzBuzz()
        for (i in results.indices) {
            assertEquals(results[i], fizzBuzzList[i])
        }
    }
}