package calculations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumOfArrayOfIntegersTest {

    SumOfArrayOfIntegers test1;

    SumOfArrayOfIntegers test2;

    SumOfArrayOfIntegers test3;

    @BeforeEach
    void setUp() {
        this.test1 = new SumOfArrayOfIntegers(List.of(1, 2, 3, 4, 5));
        this.test2 = new SumOfArrayOfIntegers(List.of(-1, -2, -3, -4, -5));
        this.test3 = new SumOfArrayOfIntegers(List.of());
    }

    @Test
    void getSum() {
        assertEquals(this.test1.getSum(), 15);
        assertEquals(this.test2.getSum(), -15);
        assertEquals(this.test3.getSum(), 0);
    }
}