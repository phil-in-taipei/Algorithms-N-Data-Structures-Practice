package sorting;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListSortingTest {

    ArrayListSorting test1;

    ArrayListSorting test2;

    ArrayListSorting test3;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.test1 = new ArrayListSorting(
                new ArrayList<Integer>(Arrays.asList(89899, 931, 1222, 19, 398391, 8998, 230, 0, 40))
        );
        this.test2 = new ArrayListSorting(
                new ArrayList<Integer>(Arrays.asList(5, 2, 8, 1, 3))
        );
        this.test3 = new ArrayListSorting(
                new ArrayList<Integer>(Arrays.asList(4, 1, 3, 4, 2, 2))
        );
    }

    @org.junit.jupiter.api.Test
    void bubbleSort1() {
        assertEquals(
                this.test1.bubbleSort1().toString(),
                "[0, 19, 40, 230, 931, 1222, 8998, 89899, 398391]"
        );
        assertEquals(this.test2.bubbleSort1().toString(), "[1, 2, 3, 5, 8]");
        assertEquals(this.test3.bubbleSort1().toString(), "[1, 2, 2, 3, 4, 4]");
    }

    @org.junit.jupiter.api.Test
    void bubbleSort2() {
        assertEquals(
                this.test1.bubbleSort2().toString(),
                "[0, 19, 40, 230, 931, 1222, 8998, 89899, 398391]"
        );
        assertEquals(this.test2.bubbleSort1().toString(), "[1, 2, 3, 5, 8]");
        assertEquals(this.test3.bubbleSort1().toString(), "[1, 2, 2, 3, 4, 4]");
    }

    @org.junit.jupiter.api.Test
    void insertionSort() {
        assertEquals(
                this.test1.insertionSort().toString(),
                "[0, 19, 40, 230, 931, 1222, 8998, 89899, 398391]"
        );
        assertEquals(this.test2.insertionSort().toString(), "[1, 2, 3, 5, 8]");
        assertEquals(this.test3.insertionSort().toString(), "[1, 2, 2, 3, 4, 4]");
    }

    @org.junit.jupiter.api.Test
    void quickSort() {
        assertEquals(
                this.test1.quickSort().toString(),
                "[0, 19, 40, 230, 931, 1222, 8998, 89899, 398391]"
        );
        assertEquals(this.test2.quickSort().toString(), "[1, 2, 3, 5, 8]");
        assertEquals(this.test3.quickSort().toString(), "[1, 2, 2, 3, 4, 4]");
    }
}