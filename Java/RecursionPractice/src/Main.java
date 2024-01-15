import calculations.CountDown;
import calculations.GenerateListOfIntegersInRange;
import calculations.NumberToPowerOf;
import calculations.SumOfArrayOfIntegers;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Practicing basic recursion with a countdown from 10");
        System.out.println("--------------------------------------------------------------------------------------------");
        CountDown countDown = new CountDown(10);
        countDown.output();
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Implementing to power of calculation using recursion (3 to the power of 4)");
        System.out.println("--------------------------------------------------------------------------------------------");
        NumberToPowerOf numberToPowerOf = new NumberToPowerOf(3, 4);
        System.out.println("Result: " + numberToPowerOf.getResult());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Implementing recursive calculation of array of integers from 1 to 5");

        System.out.println("--------------------------------------------------------------------------------------------");
        SumOfArrayOfIntegers sumOfArrayOfIntegers = new SumOfArrayOfIntegers(List.of(1, 2, 3, 4, 5));
        System.out.println("The result is: "+ sumOfArrayOfIntegers.getSum());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Implementing recursive generation of list of integers from 15 to 20");
        GenerateListOfIntegersInRange generateListOfIntegersInRange = new GenerateListOfIntegersInRange(15, 20);
        System.out.println("The result is: "+ generateListOfIntegersInRange.getListOfNumbers().toString());
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}