package calculations;

public class Fibonacci {

    int index;

    public int getValue() {
        return this.recursivelyGetValue(this.index);
    }

    private int recursivelyGetValue(int mutableIndex) {
        if (mutableIndex < 2) {
            return mutableIndex;
        }
        return this.recursivelyGetValue(mutableIndex - 1)
                + this.recursivelyGetValue(mutableIndex - 2);
    }

    public Fibonacci(int index) {
        this.index = index;
    }
}
