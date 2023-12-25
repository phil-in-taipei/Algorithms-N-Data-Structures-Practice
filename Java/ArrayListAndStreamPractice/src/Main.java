import ArrayListPractice.ArrayListOfIntegers;
import CalculateSales.CalculateSales;
import CalculateSales.SalesTransaction;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing an array list with the integers: 1, 2, 3, 4, 5, 6");
        ArrayListOfIntegers arrayListOfIntegers = new ArrayListOfIntegers(
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6))
        );
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("These are the list values squared: " + arrayListOfIntegers.squareListArrayValues().toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("This is the sum of the values squared: " + arrayListOfIntegers.getSumOfSquares());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("These are the items which are greater than three: "
                + arrayListOfIntegers.getItemsGreaterThanThree().toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("These are the even items: " + arrayListOfIntegers.getEvenItems().toString());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing a new object with sales transactions: ");
        ArrayList<SalesTransaction> salesTransactions = new ArrayList<SalesTransaction>();
        salesTransactions.add(new SalesTransaction("Apple", BigDecimal.valueOf(0.5), 10));
        salesTransactions.add(new SalesTransaction("Banana", BigDecimal.valueOf(0.3), 20));
        salesTransactions.add(new SalesTransaction("Orange", BigDecimal.valueOf(0.6), 15));
        CalculateSales calculateSales = new CalculateSales(salesTransactions, BigDecimal.valueOf(8));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The sales total is: " + calculateSales.calculateTotalSalesWithTax());
        System.out.println("--------------------------------------------------------------------------------------------");

    }
}