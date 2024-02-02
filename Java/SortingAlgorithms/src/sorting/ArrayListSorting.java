package sorting;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListSorting {

    ArrayList<Integer> arrayToSort;

    public ArrayListSorting(ArrayList<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    // note this is from memory and not as well optimized:
    public ArrayList<Integer> bubbleSort1() {
        for (int i = 1; i < this.arrayToSort.size(); i++) {
            //System.out.println("This is the current array list: " + this.arrayToSort.toString());
           // System.out.println("Outer loop index(" + i + "); element(" + this.arrayToSort.get(i) + ")");
            for (int j = 1; j < this.arrayToSort.size(); j++) {
                //System.out.println("Inner loop index(" + j + "); element(" + this.arrayToSort.get(j) + ")");
                while (this.arrayToSort.get(i) < this.arrayToSort.get(j -1)) {
                    //System.out.println("Outer: " + this.arrayToSort.get(i) + " is less than Inner: " + this.arrayToSort.get(j -1));
                    Integer temporarySwap = this.arrayToSort.get(j - 1);
                    this.arrayToSort.set(j - 1, this.arrayToSort.get(i));
                    this.arrayToSort.set(i, temporarySwap);
                    //System.out.println("Swapped them");
                }
            }

        }
        return arrayToSort;
    }

    public ArrayList<Integer> bubbleSort2() {
        boolean sortingInProcess = true;
        while(sortingInProcess) {
            //System.out.println("--------------------------------------------------------------------------------------");
            //System.out.println("This is the current array list: " + this.arrayToSort.toString());
            sortingInProcess = false;
            for (int i = 1; i < this.arrayToSort.size(); i++) {
                //System.out.println("--------------------------------------------------------------------------------------");
                //System.out.println("This is the current array list: " + this.arrayToSort.toString());
                //System.out.println("This is the element (" + this.arrayToSort.get(i) + ") at index (" + i + ")");
                //System.out.println("--------------------------------------------------------------------------------------");
                if (this.arrayToSort.get(i) < this.arrayToSort.get(i -1)) {
                    //System.out.println("It is less than the previous element ("+ this.arrayToSort.get(i -1)+ ") at index (" + String.valueOf(i - 1) + ")");
                    Integer temporarySwap = this.arrayToSort.get(i - 1);
                    this.arrayToSort.set(i - 1, this.arrayToSort.get(i));
                    this.arrayToSort.set(i, temporarySwap);
                    //System.out.println("**************Swapping and sorting is in process*******");
                    sortingInProcess = true;
                }
            }
        }
        return this.arrayToSort;
    }

    public ArrayList<Integer> insertionSort() {
        //int forLoopNumber = 0;
        for (int i = 1; i < this.arrayToSort.size(); i++) {
            //forLoopNumber++;
            //System.out.println("`````````````````````````````````````````````````````````````````````````````````````");
            //System.out.println("For loop (" + forLoopNumber + "): " + this.arrayToSort.toString());
            int currentItem = this.arrayToSort.get(i);
            //System.out.println("This is the element: " + currentItem);
            int sortedInsertionIndex = i - 1;
            //System.out.println("This is the sorted insertion index: " + sortedInsertionIndex);
            //int whileLoopNumber = 0;
            while(sortedInsertionIndex >= 0 && currentItem < this.arrayToSort.get(sortedInsertionIndex)) {
                //System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                //whileLoopNumber++;
                //System.out.println("While loop (" + whileLoopNumber + "): " + this.arrayToSort.toString());
                //System.out.println("This is the element: " + currentItem +", and it is lower than " + this.arrayToSort.get(sortedInsertionIndex));
                this.arrayToSort.set(sortedInsertionIndex + 1, this.arrayToSort.get(sortedInsertionIndex));
                //System.out.println("Setting item after index: " + sortedInsertionIndex + " item: " + this.arrayToSort.get(sortedInsertionIndex) + " to the same");
                //System.out.println("Altered array: " +  this.arrayToSort.toString());
                sortedInsertionIndex--;
                //System.out.println("Reset sorted insertion index: " + sortedInsertionIndex);
            }
            //System.out.println("While loop ended: setting index above sorted insertion index (" + sortedInsertionIndex + ") to " + currentItem);
            this.arrayToSort.set(sortedInsertionIndex + 1, currentItem);
        }
        return this.arrayToSort;
    }

    public ArrayList<Integer> quickSort() {
        return this.quickSortRecursions(this.arrayToSort);
    }

    private ArrayList<Integer> quickSortRecursions(ArrayList<Integer> currentlySortingList) {
        if (currentlySortingList.size() <= 1) {
            return currentlySortingList;
        }
        Integer pivot = currentlySortingList.get(currentlySortingList.size() - 1);
        ArrayList<Integer> leftArrayList = new ArrayList<Integer>();
        ArrayList<Integer> rightArrayList = new ArrayList<Integer>();
        for (int i = 0; i < currentlySortingList.size() - 1; i++) {
            if (currentlySortingList.get(i) < pivot) {
                leftArrayList.add(currentlySortingList.get(i));
            } else {
                rightArrayList.add(currentlySortingList.get(i));
            }
        }
        ArrayList<Integer> leftSortResult = this.quickSortRecursions(leftArrayList);
        // add pivot to the end of the left sort result (so it is between it and the right)
        leftSortResult.add(pivot);
        ArrayList<Integer> rightSortResult = this.quickSortRecursions(rightArrayList);
        return (ArrayList<Integer>) Stream.concat(
                leftSortResult.stream(), rightSortResult.stream()
        ).collect(Collectors.toList());
    }

    public ArrayList<Integer> selectionSort() {
        //int outerIteration = 0;
        for (int outerIndex = 0; outerIndex < this.arrayToSort.size(); outerIndex++) {
            //System.out.println("`````````````````````````````````````````````````````````````````````````````````````````");
            //outerIteration++;
            //System.out.println("Iteration number: " + outerIteration + "; values: " + this.arrayToSort);
            int lowestValueIndex = outerIndex;
            //System.out.println("Lowest value index: " + lowestValueIndex + "; element: " + this.arrayToSort.get(lowestValueIndex));
            //int innerIteration = 0;
            for (int innerIndex = outerIndex + 1; innerIndex < this.arrayToSort.size(); innerIndex++) {
                //innerIteration++;
                //System.out.println("**** Inner iteration number: " + innerIteration + "; with lowest value index: " + lowestValueIndex);
                //System.out.println("and inner index: " + innerIndex + " *******");
                if (this.arrayToSort.get(lowestValueIndex) > this.arrayToSort.get(innerIndex)) {
                    //System.out.println("Value (" + this.arrayToSort.get(lowestValueIndex) + ") is higher than (" + this.arrayToSort.get(innerIndex) + ")");
                    //System.out.println("Change lowestValueIndex (" + lowestValueIndex + ") to inner index (" + innerIndex + ")");
                    lowestValueIndex = innerIndex;
                }
            }
            //System.out.println("++++++++++++++++++++++++Inner Loop Finished++++++++++++++++++++++++++++++++++++++++");
            if (lowestValueIndex != outerIndex) {
                //System.out.println("Lowest value index: " + lowestValueIndex + " is not same as outer index: " + outerIndex);
                int temporarySwap = this.arrayToSort.get(outerIndex);
                //System.out.println("Swap " + this.arrayToSort.get(lowestValueIndex) + " with " + this.arrayToSort.get(outerIndex));
                this.arrayToSort.set(outerIndex, this.arrayToSort.get(lowestValueIndex));
                this.arrayToSort.set(lowestValueIndex, temporarySwap);
            }
        }
        return this.arrayToSort;
    }


}
