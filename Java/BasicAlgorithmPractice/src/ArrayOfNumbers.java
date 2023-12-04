public class ArrayOfNumbers {
    private int[] numbers;

    public ArrayOfNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getHighestNumber() {
        int highestNumber = 0;
        for (int number : this.numbers) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        return highestNumber;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
