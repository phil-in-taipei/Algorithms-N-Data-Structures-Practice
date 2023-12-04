import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OccurrencesTest {
    Occurrences occurrences;

    @BeforeEach
    void setUp() throws Exception {
        this.occurrences = new Occurrences("hellLo World", 'l');
    }

    @Test
    void getStringVar() {
        assertEquals("hellLo World", this.occurrences.getStringVar());
    }

    @Test
    void getCharVar() {
        assertEquals('l', this.occurrences.getCharVar());
    }

    @Test
    void getNumberOfOccurrences() {
        assertEquals(3, this.occurrences.getNumberOfOccurrences());

    }
}