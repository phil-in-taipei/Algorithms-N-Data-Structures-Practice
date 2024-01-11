package calculateSalesAmount
import java.math.BigDecimal

data class SalesTransaction(
    var name: String,
    var price: BigDecimal,
    var quantity: Int
)
