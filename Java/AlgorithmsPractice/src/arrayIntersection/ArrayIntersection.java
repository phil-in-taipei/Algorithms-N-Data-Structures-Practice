package arrayIntersection;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayIntersection {
    int[] firstInputArray = new int[5];
    int[] secondInputArray = new int[5];

    public ArrayIntersection(int[] firstInputArray, int[] secondInputArray) {
        this.firstInputArray = firstInputArray;
        this.secondInputArray = secondInputArray;
    }
    public ArrayList<Integer> getCommonItems() {
        ArrayList<Integer> listOfCommonItems = new ArrayList<Integer>();
        ArrayList<Integer> secondInputAsArrayList = IntStream.of(this.secondInputArray).boxed()
                                                        .collect(
                                                                Collectors.toCollection(ArrayList::new)
                                                        );
        for (int i : firstInputArray) {
            if (secondInputAsArrayList.contains(i)) {
                listOfCommonItems.add(i);
            }
        }

        return listOfCommonItems;
    }
}
