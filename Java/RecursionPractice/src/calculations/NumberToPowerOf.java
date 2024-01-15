package calculations;

public class NumberToPowerOf {

    private final int number;

    private final int powerOf;


    private int recursiveCalculationOfNumberToPower(int descendingPowerOf) {
        if (descendingPowerOf == 0) {
            return 1;
        }
        return this.recursiveCalculationOfNumberToPower(descendingPowerOf - 1) * this.number;
    }
    public NumberToPowerOf(int number, int powerOf) {
        this.number = number;
        this.powerOf = powerOf;
    }

    public int getResult() {
        return this.recursiveCalculationOfNumberToPower(this.powerOf);
    }

}
