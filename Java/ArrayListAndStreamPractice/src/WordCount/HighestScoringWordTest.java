package WordCount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestScoringWordTest {

    HighestScoringWord testObj1;

    HighestScoringWord testObj2;

    HighestScoringWord testObj3;

    @BeforeEach
    void setUp() {
        this.testObj1 = new HighestScoringWord("hello xavier is my name");
        this.testObj2 = new HighestScoringWord("what time are we climbing up the volcano");
        this.testObj3 = new HighestScoringWord("take me to semynak");

    }

    @Test
    void getHighestScoringWord() {
        assertEquals("xavier", testObj1.getHighestScoringWord());
        assertEquals("volcano", testObj2.getHighestScoringWord());
        assertEquals("semynak", testObj3.getHighestScoringWord());

    }
}