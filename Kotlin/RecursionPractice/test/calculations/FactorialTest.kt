package calculations

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FactorialTest {

    private val test1 = Factorial(5)

    private val test2 = Factorial(10)

    private val test3 = Factorial(0)

    @Test
    fun getValue() {
        assertEquals(test1.getValue(), 120)
        assertEquals(test2.getValue(), 3628800)
        assertEquals(test3.getValue(), 1)
    }
}