package calculations;

import java.util.Arrays;
import java.util.List;

public class SumOfArrayOfIntegers {

    private final List<Integer> listOfIntegers;


    private int recursivelyCalculateSum(List<Integer> diminishingListOfIntegers) {
        if (diminishingListOfIntegers.isEmpty()) {
            return 0;
        }
        return diminishingListOfIntegers.get(0)
                + this.recursivelyCalculateSum(
                        diminishingListOfIntegers.subList(1, diminishingListOfIntegers.size())
        );
    }

    public int getSum() {
        return this.recursivelyCalculateSum(this.listOfIntegers);
    }

    public SumOfArrayOfIntegers(List<Integer> listOfIntegers) {
        this.listOfIntegers = listOfIntegers;
    }
}
