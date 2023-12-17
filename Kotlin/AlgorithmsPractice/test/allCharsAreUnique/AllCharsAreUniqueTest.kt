package allCharsAreUnique

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AllCharsAreUniqueTest {

    val allCharsAreUnique1: AllCharsAreUnique = AllCharsAreUnique("bigbang")

    val allCharsAreUnique2: AllCharsAreUnique = AllCharsAreUnique("sunray")

    val allCharsAreUnique3: AllCharsAreUnique = AllCharsAreUnique("")


    @Test
    fun getVerdict() {
        assertFalse(allCharsAreUnique1.getVerdict())
        assertTrue(allCharsAreUnique2.getVerdict())
        assertTrue(allCharsAreUnique3.getVerdict())
    }
}