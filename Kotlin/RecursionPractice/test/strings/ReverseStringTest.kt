package strings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReverseStringTest {

    private val test1 = ReverseString("silent")

    private val test2 = ReverseString("tpircSavaJ")

    private val test3 = ReverseString("54321")

    @Test
    fun getResult() {
        assertEquals(test1.getResult(),"tnelis")
        assertEquals(test2.getResult(), "JavaScript")
        assertEquals(test3.getResult(), "12345")
    }
}