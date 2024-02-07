package functions

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.junit.jupiter.api.Assertions.*

class IntegerRecursionsKtTest {

    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor));
    }

    @Test
    fun countdownFrom() {
        countdownFrom(10)
        val output = outputStreamCaptor.toString().trim { it <= ' ' }
        assertTrue(output.contains("10"))
        assertTrue(output.contains("9"))
        assertTrue(output.contains("8"))
        assertTrue(output.contains("7"))
        assertTrue(output.contains("6"))
        assertTrue(output.contains("5"))
        assertTrue(output.contains("4"))
        assertTrue(output.contains("3"))
        assertTrue(output.contains("2"))
        assertTrue(output.contains("1"))
        assertTrue(output.contains("Blast Off"))
    }

    @Test
    fun getIntegersInRange() {
        assertEquals(
            getIntegersInRange(1, 5).joinToString(),
            "1, 2, 3, 4, 5"
        )
    }

    @Test
    fun getFactorial() {
        assertEquals(getFactorial(12), 479001600)
    }

    @Test
    fun getFibonacci() {
        assertEquals(getFibonacci(12), 144)
    }

    @Test
    fun getReverseDigits() {
        assertEquals(getReverseDigits(865498), 894568)
    }

    @Test
    fun getSumOfIntegers() {
        assertEquals(
            getSumOfIntegers(intArrayOf(20, 42, 534, 97, 8, 12)),
            713
        )
    }
}