import sorting.ArrayListSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("*******************************************************************************************");
        System.out.println("Initializing array list sorting");
        ArrayListSorting arrayListSorting = new ArrayListSorting(
                new ArrayList<Integer>(Arrays.asList(3, 9, 1, 8, 2, 7, 5, 4, 6))
        );
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Sorted using bubble sort: " + arrayListSorting.bubbleSort1().toString());
        //System.out.println("Sorted using bubble sort: " + arrayListSorting.bubbleSort2().toString());

        System.out.println("*******************************************************************************************");

    }
}