package calculations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci test1;

    Fibonacci test2;

    Fibonacci test3;

    @BeforeEach
    void setUp() {
        this.test1 = new Fibonacci(3);
        this.test2 = new Fibonacci(8);
        this.test3 = new Fibonacci(0);
    }

    @Test
    void getValue() {
        assertEquals(this.test1.getValue(), 2);
        assertEquals(this.test2.getValue(), 21);
        assertEquals(this.test3.getValue(), 0);
    }
}