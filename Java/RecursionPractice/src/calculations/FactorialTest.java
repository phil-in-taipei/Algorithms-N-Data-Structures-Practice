package calculations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    Factorial test1;

    Factorial test2;

    Factorial test3;

    @BeforeEach
    void setUp() {
        this.test1 = new Factorial(5);
        this.test2 = new Factorial(10);
        this.test3 = new Factorial(0);
    }

    @Test
    void getValue() {
        assertEquals(this.test1.getValue(), 120);
        assertEquals(this.test2.getValue(), 3628800);
        assertEquals(this.test3.getValue(), 1);
    }
}