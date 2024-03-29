import AnalyzeCarMileages.AnalyzeCarMileages
import AnalyzeCarMileages.CarData
import arrayMethodsPractice.ArrayOfIntegers
import utilities.Print
import calculateSalesAmount.*
import java.math.BigDecimal
import kotlin.collections.ArrayList
import highestScoringWord.HighestScoringWord
import anagrams.AnagramValidation
import Validators.PasswordValidator
import Validators.IPv4Validator
import FindMissing.FindMissingConsecutiveLetter

fun main() {
    val print = Print();
    print.printDividerLine()
    print.printInitializationAnnouncement("ArrayOfIntegers")
    println("With the numbers 1, 2, 3, 4, 5")
    val arrayOfIntegers = ArrayOfIntegers(intArrayOf(1, 2, 3, 4, 5))
    print.printDividerLine()
    println("This is all of the items squared: " + arrayOfIntegers.squareEachItem().toString())
    print.printDividerLine()
    println("This is the sum of squares using approach 1: " +
            "${arrayOfIntegers.getSumOfSquares()} and approach 2: " +
            "${arrayOfIntegers.getSumOfSquaresAltApproach()}")
    print.printDividerLine()
    println("This is only the even items: ${arrayOfIntegers.getEvenIntegers()}")
    print.printDividerLine()
    println("This is the first item which is greater than three: " +
            "${arrayOfIntegers.getFirstIntegerGreaterThanThreeOrNull()}")
    print.printDividerLine()
    print.printInitializationAnnouncement("SalesCalculations")
    val arraylist = ArrayList<SalesTransaction>()
    arraylist.add(SalesTransaction(name="Apple", price= BigDecimal(0.5), quantity = 10))
    arraylist.add(SalesTransaction(name="Banana", price= BigDecimal(0.3), quantity = 20))
    arraylist.add(SalesTransaction(name="Orange", price= BigDecimal(0.6), quantity = 15))
    val calculations = SalesCalculations(arraylist, BigDecimal(8))
    println(calculations.calculateTotalSalesWithTax())
    print.printDividerLine()
    print.printDividerLine()
    print.printInitializationAnnouncement("HighestScoringWord")
    print.printDividerLine()

    val highestScoringWord = HighestScoringWord("Hello my name is xavier")
    println("The highest scoring word in the string, " +
            "'Hello my name is xavier' is " +
            "${highestScoringWord.getHighestScoringWord()}"
    )
    print.printDividerLine()
    print.printDividerLine()
    print.printInitializationAnnouncement("AnagramValidation")
    val anagramValidation = AnagramValidation("app", "ppa")
    print.printDividerLine()
    println("The strings, 'app' and 'ppa' are anagrams: ${anagramValidation.validateByMeansOfStringComparison()}")
    print.printDividerLine()
    println("The strings 'app' and 'ppa' are anagrams: ${anagramValidation.validateByMeansOfMapComparison()}")
    print.printDividerLine()
    print.printDividerLine()
    print.printInitializationAnnouncement("AnalyzeCarMileages")
    val carsData = ArrayList<CarData>()
    carsData.add(CarData(make="Toyota", model="Carola", mileage = 25000, year=2020))
    carsData.add(CarData(make="Honda", model="Civic", mileage = 30000, year=2019))
    carsData.add(CarData(make="Ford", model="Mustang", mileage = 15000, year=2021))
    val analysisObject = AnalyzeCarMileages(carsData);
    print.printDividerLine()
    println("This is the result of the analysis: ${analysisObject.getCarAnalysisData().toString()}")
    print.printDividerLine()
    print.printDividerLine()
    print.printInitializationAnnouncement("PasswordValidator")
    println("Now checking that 'Abc12345' is a valid password")
    val passwordValidator = PasswordValidator("Abc12345")
    println("It is valid ${passwordValidator.stringIsAValidPassword()}")
    print.printDividerLine()
    print.printDividerLine()
    print.printInitializationAnnouncement("IPv4Validator")
    println("Now checking that '123.45.67.89' is a valid IPv4 address")
    val iPv4Validator = IPv4Validator("123.45.67.89")
    println("It is valid: ${iPv4Validator.isValidIPv4()}")
    print.printDividerLine()
    print.printDividerLine()
    print.printInitializationAnnouncement("FindMissingConsecutiveLetter")
    val findMissingConsecutiveLetter = FindMissingConsecutiveLetter(listOf('a', 'b', 'd', 'e', 'f'))
    println("In the sequence a, b, d, e, f, the missing letter is ${findMissingConsecutiveLetter.findMissingLetter()}")
    print.printDividerLine()
}