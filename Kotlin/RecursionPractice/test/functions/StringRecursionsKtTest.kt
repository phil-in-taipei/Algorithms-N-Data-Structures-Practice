package functions

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StringRecursionsKtTest {

    @Test
    fun reverseString() {
        assertEquals(reverseString("hello"), "olleh")
        assertEquals(reverseString("taipei"), "iepiat")
    }

    @Test
    fun reverseStringAlt() {
        assertEquals(reverseString("hello"), "olleh")
        assertEquals(reverseString("taipei"), "iepiat")
    }

    @Test
    fun getListOfPermutations() {
        assertEquals(
            getListOfPermutations("god").toString(),
            "[dog, odg, dgo, gdo, ogd, god]"
        )
        assertEquals(
            getListOfPermutations("add").toString(),
            "[dda, dda, dad, add, dad, add]"
        )
    }
}