package anagrams

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AnagramValidationTest {

    private var validation1 = AnagramValidation("app", "ppa")
    private var validation2 = AnagramValidation("astronomer", "moonstarer")
    private var validation3 = AnagramValidation("silent", "listen")
    private var validation4 = AnagramValidation("whohjos", "ljdljadsas")

    @Test
    fun validateByMeansOfMapComparison() {
        assertTrue(validation1.validateByMeansOfMapComparison())
        assertTrue(validation2.validateByMeansOfMapComparison())
        assertTrue(validation3.validateByMeansOfMapComparison())
        assertFalse(validation4.validateByMeansOfMapComparison())
    }

    @Test
    fun validateByMeansOfStringComparison() {
        assertTrue(validation1.validateByMeansOfStringComparison())
        assertTrue(validation2.validateByMeansOfStringComparison())
        assertTrue(validation3.validateByMeansOfStringComparison())
        assertFalse(validation4.validateByMeansOfStringComparison())
    }
}