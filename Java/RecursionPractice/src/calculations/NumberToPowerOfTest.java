package calculations;

import static org.junit.jupiter.api.Assertions.*;

class NumberToPowerOfTest {

    NumberToPowerOf test1;

    NumberToPowerOf test2;

    NumberToPowerOf test3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        test1 = new NumberToPowerOf(2, 3);
        test2 = new NumberToPowerOf(5, 2);
        test3 = new NumberToPowerOf(3, 4);

    }

    @org.junit.jupiter.api.Test
    void getResult() {
        assertEquals(test1.getResult(), 8);
        assertEquals(test2.getResult(), 25);
        assertEquals(test3.getResult(), 81);

    }
}