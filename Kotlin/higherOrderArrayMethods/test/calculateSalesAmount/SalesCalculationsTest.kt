package calculateSalesAmount
import SalesCalculations
import java.math.BigDecimal
import calculateSalesAmount.*
import java.math.RoundingMode
import kotlin.collections.*  // Add this import for extension functions
import org.junit.jupiter.api.Assertions.*

class SalesCalculationsTest {
    
    var calculations1 = SalesCalculations(
        arrayListOf(
            SalesTransaction(name="Apple", price= BigDecimal(0.5), quantity = 10),
            SalesTransaction(name="Banana", price= BigDecimal(0.3), quantity = 20),
            SalesTransaction(name="Orange", price= BigDecimal(0.6), quantity = 15)),
        BigDecimal(8)
    )

    var calculations2 = SalesCalculations(
        arrayListOf(
            SalesTransaction(name="Chocolate", price= BigDecimal(2.5), quantity = 5),
            SalesTransaction(name="Chips", price= BigDecimal(1.2), quantity = 10),
            SalesTransaction(name="Soda", price= BigDecimal(1.0), quantity = 8),
            SalesTransaction(name="Candy", price= BigDecimal(0.5), quantity = 15)),
        BigDecimal(5)
    )




    @org.junit.jupiter.api.Test
    fun calculateTotalPrices() {
        assertEquals(
            BigDecimal(21.60).setScale(2, RoundingMode.HALF_EVEN),
            calculations1.calculateTotalPrices()
        )
        assertEquals(
            BigDecimal(42).setScale(2, RoundingMode.HALF_EVEN),
            calculations2.calculateTotalPrices()
        )

    }
}