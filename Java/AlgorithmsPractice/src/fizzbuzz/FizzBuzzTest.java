package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = new FizzBuzz(15);
    }

    @Test
    void getFizzbuzz() {
    }

    @Test
    void getUpUntil() {
        assertEquals(15, this.fizzBuzz.getUpUntil());
    }
}