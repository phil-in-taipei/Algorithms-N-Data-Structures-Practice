package CalculateSales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateSales {

    ArrayList<SalesTransaction> salesTransactions;

    BigDecimal taxRate;

    public CalculateSales(ArrayList<SalesTransaction> salesTransactions, BigDecimal taxRate) {
        this.salesTransactions = salesTransactions;
        this.taxRate = taxRate;
    }

    public BigDecimal calculateTotalSalesWithTax() {
        BigDecimal salesTotal =  this.salesTransactions.stream()
                .map(x -> BigDecimal.valueOf(x.getQuantity()).multiply(x.getPrice()))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return salesTotal.add(salesTotal.multiply(taxRate.multiply(BigDecimal.valueOf(0.01))))
                .setScale(2, RoundingMode.HALF_EVEN);
    }
}
