package calculations

import org.junit.jupiter.api.Assertions.*

class SumOfArrayOfIntegersTest {

    private val test1 = SumOfArrayOfIntegers(intArrayOf(1, 2, 3, 4, 5))

    private val test2 = SumOfArrayOfIntegers(intArrayOf(10, 20, 30, 40, 50))


    @org.junit.jupiter.api.Test
    fun getSum() {
        assertEquals(15, test1.getSum())
        assertEquals(150, test2.getSum())
    }
}