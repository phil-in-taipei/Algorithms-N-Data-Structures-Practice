package calculations;

public class CumulativeSumUpToNumber {

    int sumUpToNumber;

    public int getValue() {
        if (sumUpToNumber == 1) {
            return 1;
        }
        sumUpToNumber--;
        return this.sumUpToNumber + 1 + this.getValue();
    }

    public CumulativeSumUpToNumber(int sumUpToNumber) {
        this.sumUpToNumber = sumUpToNumber;
    }
}
