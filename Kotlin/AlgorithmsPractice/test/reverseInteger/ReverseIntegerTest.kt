package reverseInteger

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ReverseIntegerTest {

    private val test1 = ReverseInteger(29821)
    private val test2 = ReverseInteger(298204)

    @Test
    fun reverseIteratively() {
        assertEquals(test1.reverseIteratively(), 12892)
        assertEquals(test2.reverseIteratively(), 402892)
    }

    @Test
    fun reverseRecursively() {
        assertEquals(test1.reverseRecursively(), 12892)
        assertEquals(test2.reverseRecursively(), 402892)
    }
}