import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfNumbersTest {

    ArrayOfNumbers arrayOfNumbers;

    @BeforeEach
    void setUp() throws Exception {
        this.arrayOfNumbers = new ArrayOfNumbers(new int[]{2, 1, 9, 16, 10});
    }

    @Test
    void getHighestNumber() {
        assertEquals(16, this.arrayOfNumbers.getHighestNumber());
    }

    @Test
    void getNumbers() {
        int[] testNumbers = new int[]{2, 1, 9, 16, 10};
        int[] numbers = this.arrayOfNumbers.getNumbers();
        for (int i = 0; i < numbers.length; i++) {
            assertEquals(testNumbers[i], numbers[i]);
        }
    }
}