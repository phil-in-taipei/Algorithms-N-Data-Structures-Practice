package highestScoringWord

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HighestScoringWordTest {

    private val highestScoringWordObj1 = HighestScoringWord(
        stringOfWords = "what time are we climbing up the volcano"
    )

    private val highestScoringWordObj2 = HighestScoringWord(
        stringOfWords = "take me to semynak"
    )

    @Test
    fun getHighestScoringWord() {
        assertEquals(highestScoringWordObj1.getHighestScoringWord(), "volcano")
        assertEquals(highestScoringWordObj2.getHighestScoringWord(), "semynak")
    }
}