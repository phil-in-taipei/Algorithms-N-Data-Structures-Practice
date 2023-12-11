import arrayIntersection.ArrayIntersection;
import fizzbuzz.FizzBuzz;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing the array intersection object");
        ArrayIntersection arrayIntersection = new ArrayIntersection(new int[]{1,2,3,4,5}, new int[] {3, 4, 5, 6, 7});
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The following items are in both arrays");
        System.out.println(arrayIntersection.getCommonItems());
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Initializing Fizzbuzz object to get items up to 15");
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Resulting array:");
        System.out.println("--------------------------------------------------------------------------------------------");
        ArrayList<String> fizzBuzzResult = fizzBuzz.getFizzbuzz();
        for (String item : fizzBuzzResult) {
            System.out.println(item);
        }
        System.out.println("--------------------------------------------------------------------------------------------");

    }
}