package strings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PermutationsTest {

    private val test1 = Permutations("dog")

    private val test2 = Permutations("add")

    @Test
    fun getArray() {
        assertEquals(test1.getArray().toString(),"[dog, dgo, odg, ogd, gdo, god]")
        assertEquals(test2.getArray().toString(),"[add, add, dad, dda, dad, dda]")
    }
}