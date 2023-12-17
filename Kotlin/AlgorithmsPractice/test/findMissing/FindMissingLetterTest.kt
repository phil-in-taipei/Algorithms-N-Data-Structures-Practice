package findMissing

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FindMissingLetterTest {

    val findMissingLetter1 = FindMissingLetter(charArrayOf('C', 'D', 'E', 'F', 'H', 'I'))

    val findMissingLetter2 = FindMissingLetter(charArrayOf('l', 'm', 'n', 'p', 'q', 'r'))

    @Test
    fun getResult() {
        assertEquals('G', findMissingLetter1.getResult())
        assertEquals('o', findMissingLetter2.getResult())
    }
}