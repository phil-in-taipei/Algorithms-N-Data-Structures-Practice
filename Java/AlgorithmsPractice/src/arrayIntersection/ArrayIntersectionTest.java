package arrayIntersection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class ArrayIntersectionTest {

    ArrayIntersection arrayIntersection;

    @BeforeEach
    void setUp() throws Exception {
        this.arrayIntersection = new ArrayIntersection(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 6, 7});
    }

    @Test
    void getCommonItems() {
        int[] numbers = { 3, 4, 5 };
        ArrayList<Integer> listOfCommonItems  = this.arrayIntersection.getCommonItems();
        for (int number : numbers) {
            assertTrue(listOfCommonItems.contains(number));
        }
    }

}