package sorting;

import java.util.ArrayList;

public class ArrayListSorting {

    ArrayList<Integer> arrayToSort;

    public ArrayListSorting(ArrayList<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    // note this is from memory and not as well optimized:
    public ArrayList<Integer> bubbleSort1() {
        for (int i = 1; i < this.arrayToSort.size(); i++) {
            for (int j = 1; j < this.arrayToSort.size(); j++) {
                while (this.arrayToSort.get(i) < this.arrayToSort.get(j -1)) {
                    Integer temporarySwap = this.arrayToSort.get(j - 1);
                    this.arrayToSort.set(j - 1, this.arrayToSort.get(i));
                    this.arrayToSort.set(i, temporarySwap);
                }
            }

        }
        return arrayToSort;
    }
}
