import arrayIntersection.ArrayIntersection;
import fizzbuzz.FizzBuzz;
import numberofLikes.NumberOfLikes;

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
        System.out.println("Now initializing a NumberOfLikes object");
        NumberOfLikes numberOfLikes1 = new NumberOfLikes(new String[]{"Ding-Dong", "Bling-Blong", "Schling-Schlong", "Garry"});
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("This is the output of likes: " + numberOfLikes1.getNumberOfLikes());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Now initializing a NumberOfLikes object");
        NumberOfLikes numberOfLikes2 = new NumberOfLikes(new String[]{"Schling-Schlong", "Garry"});
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("This is the output of likes: " + numberOfLikes2.getNumberOfLikes());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Now initializing a NumberOfLikes object");
        NumberOfLikes numberOfLikes3 = new NumberOfLikes(new String[]{"Bling-Blong", "Schling-Schlong", "Garry"});
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("This is the output of likes: " + numberOfLikes3.getNumberOfLikes());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Now initializing a NumberOfLikes object");
        NumberOfLikes numberOfLikes4 = new NumberOfLikes(new String[]{"Bling-Blong"});
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("This is the output of likes: " + numberOfLikes4.getNumberOfLikes());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Now initializing a NumberOfLikes object");
        NumberOfLikes numberOfLikes5 = new NumberOfLikes(new String[]{});
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("This is the output of likes: " + numberOfLikes5.getNumberOfLikes());
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}