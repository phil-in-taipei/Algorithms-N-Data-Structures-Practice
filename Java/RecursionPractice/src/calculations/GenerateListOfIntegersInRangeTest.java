package calculations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateListOfIntegersInRangeTest {

    GenerateListOfIntegersInRange test1;

    GenerateListOfIntegersInRange test2;

    GenerateListOfIntegersInRange test3;

    @BeforeEach
    void setUp() {
        test1 = new GenerateListOfIntegersInRange(15, 20);

        test2 = new GenerateListOfIntegersInRange(100, 105);

        test3 = new GenerateListOfIntegersInRange(7, 14);
    }

    @Test
    void getListOfNumbers() {
        assertArrayEquals(new Integer[] {15, 16, 17, 18, 19, 20}, test1.getListOfNumbers().toArray());
        assertArrayEquals(new Integer[] {100, 101, 102, 103, 104, 105}, test2.getListOfNumbers().toArray());
        assertArrayEquals(new Integer[] {7, 8, 9, 10, 11, 12, 13, 14}, test3.getListOfNumbers().toArray());
    }
}