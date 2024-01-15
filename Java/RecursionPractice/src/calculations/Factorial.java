package calculations;

public class Factorial {

    int upToNumber;

    public int getValue() {
        return this.recursivelyCalculateValue(this.upToNumber);
    }

    private int recursivelyCalculateValue(int descendingNumber) {
        if (descendingNumber == 0 || descendingNumber == 1) {
            return 1;
        }
        return this.recursivelyCalculateValue(descendingNumber -1) * descendingNumber;
    }

    public Factorial(int upToNumber){
        this.upToNumber = upToNumber;
    }
}
