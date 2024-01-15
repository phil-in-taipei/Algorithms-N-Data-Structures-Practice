import Anagrams.AnagramValidation;
import ArrayListPractice.ArrayListOfIntegers;
import CalculateSales.CalculateSales;
import CalculateSales.SalesTransaction;
import FindMissingConsecutiveLetter.FindMissingConsecutiveLetter;
import WordCount.HighestScoringWord;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing a anagram validation object with the words: 'app' and 'ppa'");
        System.out.println("--------------------------------------------------------------------------------------------");
        AnagramValidation anagramValidation = new AnagramValidation("app", "ppa");
        System.out.println("String comparison shows are anagrams: "
                + anagramValidation.validateByMeansOfStringComparison());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Word count map comparison shows are anagrams: "
                + anagramValidation.validateByMeansOfMapComparison());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing a anagram validation object with the words: 'app' and 'ppa'");
        System.out.println("--------------------------------------------------------------------------------------------");
        HighestScoringWord highestScoringWord = new HighestScoringWord("Hello my name is xavier");
        System.out.println("The highest scoring word in the string, 'Hello my name is xavier' is: " +
                    highestScoringWord.getHighestScoringWord());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing a find the missing consecutive letter class with sequence 'a', b', 'd', 'e'");
        System.out.println("--------------------------------------------------------------------------------------------");
        FindMissingConsecutiveLetter findMissingConsecutiveLetter = new FindMissingConsecutiveLetter(List.of('a', 'b', 'd', 'e'));

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The missing Char is: " + findMissingConsecutiveLetter.findMissingLetter());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing a find the missing consecutive letter class with sequence 'a', 'b', 'c', 'e'");
        System.out.println("--------------------------------------------------------------------------------------------");
        FindMissingConsecutiveLetter findMissingConsecutiveLetter2 = new FindMissingConsecutiveLetter(List.of('a', 'b', 'c', 'e'));

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The missing Char is: " + findMissingConsecutiveLetter2.findMissingLetter());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing a find the missing consecutive letter class with sequence 'q', 'r', 's', 't', 'v'");
        System.out.println("--------------------------------------------------------------------------------------------");
        FindMissingConsecutiveLetter findMissingConsecutiveLetter3 = new FindMissingConsecutiveLetter(List.of('q', 'r', 's', 't', 'v'));

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The missing Char is: " + findMissingConsecutiveLetter3.findMissingLetter());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Initializing a find the missing consecutive letter class with sequence 'l', 'm', 'n', 'o'");
        System.out.println("--------------------------------------------------------------------------------------------");
        FindMissingConsecutiveLetter findMissingConsecutiveLetter4 = new FindMissingConsecutiveLetter(List.of('l', 'm', 'n', 'o'));

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("The missing Char is: " + findMissingConsecutiveLetter4.findMissingLetter());
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}