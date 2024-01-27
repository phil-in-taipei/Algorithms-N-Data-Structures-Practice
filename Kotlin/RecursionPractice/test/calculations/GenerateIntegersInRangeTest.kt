package calculations

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GenerateIntegersInRangeTest {

    private val test1 = GenerateIntegersInRange(1, 5)

    private val test2 = GenerateIntegersInRange(30, 35)


    private val test3 = GenerateIntegersInRange(-20, -10)


    @Test
    fun getOutput() {
        assertEquals(test1.getOutput().contentToString(), "[1, 2, 3, 4, 5]")
        assertEquals(test2.getOutput().contentToString(), "[30, 31, 32, 33, 34, 35]")
        assertEquals(
            test3.getOutput().contentToString(),
            "[-20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10]"
        )
    }
}