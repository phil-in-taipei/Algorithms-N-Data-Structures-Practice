package findMissing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FindMissingNumberTest {

    val findMissingNumber1 = FindMissingNumber(intArrayOf(1, 2, 4, 5, 6))

    val findMissingNumber2 = FindMissingNumber(intArrayOf())

    val findMissingNumber3 = FindMissingNumber(intArrayOf(5, 2, 4, 1, 6))


    @Test
    fun getResult() {
        assertEquals(3, findMissingNumber1.getResult())
        assertEquals(1, findMissingNumber2.getResult())
        assertEquals(3, findMissingNumber1.getResult())
    }
}