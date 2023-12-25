package CalculateSales;

import java.math.BigDecimal;

public class SalesTransaction {

    private String name;

    private BigDecimal price;

    private int quantity;

    public SalesTransaction(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
