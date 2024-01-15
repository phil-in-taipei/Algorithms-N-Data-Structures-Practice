package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsOfAStringTest {

    PermutationsOfAString test1;

    @BeforeEach
    void setUp() {
        this.test1 = new PermutationsOfAString("dog");
    }

    @Test
    void getListOfPermutations() {
        assertEquals(Arrays.toString(this.test1.getListOfPermutations().toArray()), "[dog, dgo, odg, ogd, gdo, god]");
    }
}