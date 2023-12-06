import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRelatedExercisesTest {
    StringRelatedExercises testStringRelatedExercises1;

    StringRelatedExercises testStringRelatedExercises2;


    @BeforeEach
    void setUp() throws Exception {
        this.testStringRelatedExercises1 = new StringRelatedExercises("hellLo World", 'l');
        this.testStringRelatedExercises2 = new StringRelatedExercises("A man, a plan, a canal, Panama");
    }

    @Test
    void isAPalindrome() {
        assertFalse(this.testStringRelatedExercises1.isAPalindrome());
        assertTrue(this.testStringRelatedExercises2.isAPalindrome());
    }

    @Test
    void getStringVar() {
        assertEquals("hellLo World", this.testStringRelatedExercises1.getStringVar());
    }

    @Test
    void getCharVar() {
        assertEquals('l', this.testStringRelatedExercises1.getCharVar());
    }

    @Test
    void getNumberOfOccurrences() {
        assertEquals(3, this.testStringRelatedExercises1.getNumberOfOccurrences());
    }

    @Test
    void removeAllSpaces() {
        assertEquals("hellLoWorld", this.testStringRelatedExercises1
                .removeAllSpaces(this.testStringRelatedExercises1.getStringVar()));
    }

    @Test
    void removeAllAlphanumericCharacters() {
        assertEquals("AmanaplanacanalPanama",
                this.testStringRelatedExercises2
                        .removeAllAlphanumericCharacters(
                                this.testStringRelatedExercises2.getStringVar())
        );
    }

    @Test
    void reverseString() {
        assertEquals("amanaP ,lanac a ,nalp a ,nam", this.testStringRelatedExercises2.reverseString());
    }

    @Test
    void titleCase() {
        assertEquals("A Man, A Plan, A Canal, Panama", this.testStringRelatedExercises2.titleCase());
    }
}