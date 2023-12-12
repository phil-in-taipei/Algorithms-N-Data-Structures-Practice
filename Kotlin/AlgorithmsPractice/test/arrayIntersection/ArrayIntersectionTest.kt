package arrayIntersection

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ArrayIntersectionTest {
    val arrayIntersection1 = ArrayIntersection(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 6, 7))

    val arrayIntersection2 = ArrayIntersection(intArrayOf(10, 20, 30), intArrayOf(30, 40, 50))

    val arrayIntersection3 = ArrayIntersection(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))


    @Test
    fun getIntersectingValues() {
        val testExpected1: IntArray = intArrayOf(3, 4, 5)
        val testResult1 = arrayIntersection1.getIntersectingValues()
        for (i in testResult1.indices) {
            assertEquals(testResult1[i], testExpected1[i])
        }
        val testExpected2: IntArray = intArrayOf(30)
        val testResult2 = arrayIntersection2.getIntersectingValues()
        for (i in testResult2.indices) {
            assertEquals(testResult2[i], testExpected2[i])
        }
        val testExpected3: IntArray = intArrayOf()
        val testResult3 = arrayIntersection3.getIntersectingValues()
        for (i in testResult3.indices) {
            assertEquals(testResult3[i], testExpected3[i])
        }
    }
}