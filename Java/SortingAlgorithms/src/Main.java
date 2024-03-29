import sorting.ArrayListSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("*******************************************************************************************");
        System.out.println("Initializing array list sorting");
        ArrayListSorting arrayListSorting = new ArrayListSorting(
                new ArrayList<Integer>(Arrays.asList(9, 3, 1, 8, 2, 7, 5, 4, 6))
        );
        System.out.println("-------------------------------------------------------------------------------------------");
        //System.out.println("Sorted using bubble sort: " + arrayListSorting.bubbleSort1().toString());
        //System.out.println("Sorted using bubble sort: " + arrayListSorting.bubbleSort2().toString());
        //System.out.println("Sorted using quick sort: " + arrayListSorting.quickSort().toString());
        //System.out.println("Sorted using insertion sort: " + arrayListSorting.insertionSort().toString());
        //System.out.println("Sorted using selection sort: " + arrayListSorting.selectionSort().toString());
        System.out.println("Sorted using merge sort: " + arrayListSorting.mergeSortResult().toString());
        System.out.println("*******************************************************************************************");

    }
}