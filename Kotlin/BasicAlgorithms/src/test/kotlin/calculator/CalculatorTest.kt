package calculator

import org.junit.jupiter.api.Assertions.*

class CalculatorTest {

    private val calculator = Calculator(num1=10, num2=2)


    @org.junit.jupiter.api.Test
    fun add() {
        assertEquals(12, calculator.add())
    }

    @org.junit.jupiter.api.Test
    fun subtract() {
        assertEquals(8, calculator.subtract())

    }

    @org.junit.jupiter.api.Test
    fun divide() {
        assertEquals(5, calculator.divide())

    }

    @org.junit.jupiter.api.Test
    fun multiply() {
        assertEquals(20, calculator.multiply())
    }
}