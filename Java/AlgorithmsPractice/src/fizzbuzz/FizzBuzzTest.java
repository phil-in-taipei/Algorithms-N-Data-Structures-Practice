package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        this.fizzBuzz = new FizzBuzz(15);
    }

    @Test
    void getFizzbuzz() {
        String[] expectedArray = {
                "1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz",
                "buzz", "11", "fizz", "13", "14", "fizzbuzz"
        };
        ArrayList<String> testResultArray = this.fizzBuzz.getFizzbuzz();
        for (int i = 0; i < expectedArray.length; i++) {
            assertEquals(expectedArray[i], testResultArray.get(i));
        }
    }

    @Test
    void getUpUntil() {
        assertEquals(15, this.fizzBuzz.getUpUntil());
    }

    @Test
    void testGetFizzbuzz() {
    }
}