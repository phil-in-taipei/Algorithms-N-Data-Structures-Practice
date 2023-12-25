package Anagrams;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramValidationTest {

    AnagramValidation test1;

    AnagramValidation test2;

    AnagramValidation test3;

    @BeforeEach
    void setUp() {
        this.test1 = new AnagramValidation("listen", "silent");
        this.test2 = new AnagramValidation("astronomer", "moonstarer");
        this.test3 = new AnagramValidation("hahaha", "blahblahschmah");
    }

    @Test
    void validateByMeansOfStringComparison() {
        assertTrue(this.test1.validateByMeansOfStringComparison());
        assertTrue(this.test2.validateByMeansOfStringComparison());
        assertFalse(this.test3.validateByMeansOfStringComparison());
    }

    @Test
    void validateByMeansOfMapComparison() {
        assertTrue(this.test1.validateByMeansOfMapComparison());
        assertTrue(this.test2.validateByMeansOfMapComparison());
        assertFalse(this.test3.validateByMeansOfMapComparison());
    }
}