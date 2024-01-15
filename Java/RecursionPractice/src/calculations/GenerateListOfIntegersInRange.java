package calculations;

import java.util.ArrayList;
import java.util.List;

public class GenerateListOfIntegersInRange {

    private final int startNumber;

    private final int finishNumber;

    private List<Integer> recursivelyGenerateArray(int startNumber, int descendingFinishNumber) {
        if (descendingFinishNumber == startNumber) {
            List<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(descendingFinishNumber);
            return singleElementList;
        }
        List<Integer> numberList = this.recursivelyGenerateArray(startNumber, descendingFinishNumber -1);
        numberList.add(descendingFinishNumber);
        return numberList;
    }

    public List<Integer> getListOfNumbers() {
        return this.recursivelyGenerateArray(this.startNumber, this.finishNumber);
    }


    public GenerateListOfIntegersInRange(int startNumber, int finishNumber) {
        this.startNumber = startNumber;
        this.finishNumber = finishNumber;
    }
}
