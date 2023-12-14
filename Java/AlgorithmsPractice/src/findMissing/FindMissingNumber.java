package findMissing;

public class FindMissingNumber {

    private int[] arrayOfNumbers;

    public int getResult() {
        if (this.arrayOfNumbers.length < 1) {
            return 1;
        }
        int n = arrayOfNumbers.length + 1;
        int expectedSumOfNumbers = (n * (n + 1) / 2);
        int actualSum = 0;
        for (int arrayOfNumber : arrayOfNumbers) {
            actualSum += arrayOfNumber;
        }
        return expectedSumOfNumbers - actualSum;
    }

    public FindMissingNumber(int[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }
}
