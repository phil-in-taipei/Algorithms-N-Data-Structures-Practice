package calculations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CumulativeSumUpToNumberTest {

    CumulativeSumUpToNumber test1;

    CumulativeSumUpToNumber test2;

    CumulativeSumUpToNumber test3;

    @BeforeEach
    void setUp() {
        this.test1 = new CumulativeSumUpToNumber(3);
        this.test2 = new CumulativeSumUpToNumber(6);
        this.test3 = new CumulativeSumUpToNumber(10);
    }

    @Test
    void getValue() {
        assertEquals(this.test1.getValue(), 6);
        assertEquals(this.test2.getValue(), 21);
        assertEquals(this.test3.getValue(), 55);
    }
}