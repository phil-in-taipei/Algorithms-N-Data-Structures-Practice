package calculations

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FibonacciTest {

    private val test1 = Fibonacci(3)

    private val test2 = Fibonacci(8)

    private val test3 = Fibonacci(0)

    @Test
    fun getValue() {
        assertEquals(test1.getValue(), 2)
        assertEquals(test2.getValue(), 21)
        assertEquals(test3.getValue(), 0)
    }
}