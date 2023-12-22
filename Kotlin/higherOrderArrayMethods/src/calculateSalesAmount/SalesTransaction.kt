package calculateSalesAmount

import java.math.BigDecimal
import kotlin.collections.*

data class SalesTransaction(
    var name: String,
    var price: BigDecimal,
    var quantity: Int
)
