import calculations.NumberToPowerOf;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Implementing to power of calculation using recursion (3 to the power of 4)");
        System.out.println("--------------------------------------------------------------------------------------------");
        NumberToPowerOf numberToPowerOf = new NumberToPowerOf(3, 4);
        System.out.println("Result: " + numberToPowerOf.getResult());
        System.out.println("--------------------------------------------------------------------------------------------");


        System.out.println("--------------------------------------------------------------------------------------------");

    }
}