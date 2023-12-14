package findMissing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {
    FindMissingNumber testObj1;

    FindMissingNumber testObj2;


    @BeforeEach
    void setUp() {
        this.testObj1 = new FindMissingNumber(new int[] {10, 8, 7, 6, 5, 4, 3, 2, 1});
        this.testObj2 = new FindMissingNumber(new int[] {});
    }

    @Test
    void getResult() {
        assertEquals(this.testObj1.getResult(), 9);
        assertEquals(this.testObj2.getResult(), 1);
    }
}