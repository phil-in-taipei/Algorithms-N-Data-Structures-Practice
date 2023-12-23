import java.math.BigDecimal
import calculateSalesAmount.SalesTransaction
import java.math.RoundingMode
import kotlin.collections.*  // Add this import for extension functions

class SalesCalculations(
    private val salesTransactions: ArrayList<SalesTransaction>,
    private val taxRate: BigDecimal
) {
    fun calculateTotalPrices(): BigDecimal {
        var totalSales = salesTransactions
                                .map { it.price * BigDecimal(it.quantity) }
                                .reduce { acc, value -> acc + value }

        totalSales = totalSales.setScale(2, RoundingMode.HALF_EVEN)
        return totalSales + (totalSales * taxRate) / BigDecimal(100);
    }
}
