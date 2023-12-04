import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("------------------------------------------------------------------------------------------");

        Calculator add = new Calculator(10, 2, "+");
        System.out.println("10 plus 2 equals: " + add.getOutput());

        System.out.println("------------------------------------------------------------------------------------------");

        Calculator sub = new Calculator(10, 2, "-");
        System.out.println("10 minus 2 equals: " + sub.getOutput());

        System.out.println("------------------------------------------------------------------------------------------");

        Calculator div = new Calculator(10, 2, "/");
        System.out.println("10 divided by 2 equals: " + div.getOutput());

        System.out.println("------------------------------------------------------------------------------------------");

        Calculator mult = new Calculator(10, 2, "*");
        System.out.println("10 times 2 equals: " + mult.getOutput());

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        Occurrences occurrences = new Occurrences("hellLo World", 'l');
        char charVar = occurrences.getCharVar();
        System.out.println("Initializing new occurrences class with string: "
                + occurrences.getStringVar() + " and char: " + charVar);
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println(charVar + " occurs " + occurrences.getNumberOfOccurrences() + " times");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------------------");
        int[] numbers = {2, 1, 9, 16, 10 };
        ArrayOfNumbers arrayOfNumbers = new ArrayOfNumbers(numbers);
        System.out.println("Initializing new ArrayOfNumbers object with the numbers: " + Arrays.toString(numbers));
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("The highest number is: " + arrayOfNumbers.getHighestNumber());
        System.out.println("------------------------------------------------------------------------------------------");
    }
}