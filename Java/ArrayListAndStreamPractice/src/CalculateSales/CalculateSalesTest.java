package CalculateSales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculateSalesTest {
    ArrayList<SalesTransaction> salesTransactions1 = new ArrayList<SalesTransaction>();

    CalculateSales test1;

    ArrayList<SalesTransaction> salesTransactions2 = new ArrayList<SalesTransaction>();


    CalculateSales test2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.salesTransactions1.add(new SalesTransaction("Apple",BigDecimal.valueOf(0.5), 10));
        this.salesTransactions1.add(new SalesTransaction("Banana", BigDecimal.valueOf(0.3), 20));
        this.salesTransactions1.add(new SalesTransaction("Orange", BigDecimal.valueOf(0.6), 15));
        this.test1 = new CalculateSales(this.salesTransactions1, BigDecimal.valueOf(8));

        this.salesTransactions2.add(new SalesTransaction("Chocolate",BigDecimal.valueOf(2.5), 5));
        this.salesTransactions2.add(new SalesTransaction("Chips", BigDecimal.valueOf(1.2), 10));
        this.salesTransactions2.add(new SalesTransaction("Soda", BigDecimal.valueOf(1.0), 8));
        this.salesTransactions2.add(new SalesTransaction("Candy", BigDecimal.valueOf(0.5), 15));
        this.test2 = new CalculateSales(this.salesTransactions2, BigDecimal.valueOf(5));
    }

    @org.junit.jupiter.api.Test
    void calculateTotalSalesWithTax() {
        assertEquals(
                BigDecimal.valueOf(21.60).setScale(2, RoundingMode.HALF_EVEN),
                this.test1.calculateTotalSalesWithTax()
        );
        assertEquals(
                BigDecimal.valueOf(42).setScale(2, RoundingMode.HALF_EVEN),
                this.test2.calculateTotalSalesWithTax()
        );
    }
}