package strings

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class StringRelatedExercisesTest {

    private val testStringEx1 = StringRelatedExercises(
        stringVar="hellLo World", charVar='l'
    )

    private val testStringEx2 = StringRelatedExercises(
        stringVar="A man, a plan, a canal, Panama"
    )

    @Test
    fun capitalizeAllWordsInString() {
        assertEquals(
            "A Man, A Plan, A Canal, Panama",
            testStringEx2.capitalizeAllWordsInString()
        )
    }

    @Test
    fun getCharVar() {
        assertEquals('l', testStringEx1.getCharVar())
        assertEquals(null, testStringEx2.getCharVar())
    }

    @Test
    fun getNumberOfOccurrences() {
        assertEquals(3,
            testStringEx1.getNumberOfOccurrences()
        )
    }

    @Test
    fun getStringVar() {
        assertEquals(
            "hellLo World",
            testStringEx1.getStringVar()
        )
        assertEquals(
            "A man, a plan, a canal, Panama",
            testStringEx2.getStringVar()
        )
    }

    @Test
    fun isAPalindrome() {
        assertFalse(testStringEx1.isAPalindrome())
        assertTrue(testStringEx2.isAPalindrome())
    }

    @Test
    fun reverseString() {
        assertEquals(
            "dlroW oLlleh",
            testStringEx1.reverseString()
        )
        assertEquals(
            "amanaP ,lanac a ,nalp a ,nam A",
            testStringEx2.reverseString()
        )
    }
}