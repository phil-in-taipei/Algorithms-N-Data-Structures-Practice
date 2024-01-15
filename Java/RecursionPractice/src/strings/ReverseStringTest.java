package strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString test1;

    ReverseString test2;

    ReverseString test3;

    @BeforeEach
    void setUp() {
        this.test1 = new ReverseString("hello");
        this.test2 = new ReverseString("javascript");
        this.test3 = new ReverseString("python");
    }

    @Test
    void getOutput() {
        assertEquals(this.test1.getOutput(), "olleh");
        assertEquals(this.test2.getOutput(), "tpircsavaj");
        assertEquals(this.test3.getOutput(), "nohtyp");
    }
}