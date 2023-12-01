import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator add;
    Calculator sub;
    Calculator div;
    Calculator mult;

    @BeforeEach
    void setUp() throws Exception {
        this.add = new Calculator(10, 2, "+");
        this.sub = new Calculator(10, 2, "-");
        this.div = new Calculator(10, 2, "/");
        this.mult = new Calculator(10, 2, "*");
    }

    @org.junit.jupiter.api.Test
    void getVal1() {
        assertEquals(10, this.add.getVal1());
        assertEquals(10, this.sub.getVal1());
        assertEquals(10, this.div.getVal1());
        assertEquals(10, this.mult.getVal1());

    }

    @org.junit.jupiter.api.Test
    void getVal2() {
        assertEquals(2, this.add.getVal2());
        assertEquals(2, this.sub.getVal2());
        assertEquals(2, this.div.getVal2());
        assertEquals(2, this.mult.getVal2());
    }

    @org.junit.jupiter.api.Test
    void getOperator() {
        assertEquals("+", this.add.getOperator());
        assertEquals("-", this.sub.getOperator());
        assertEquals("/", this.div.getOperator());
        assertEquals("*", this.mult.getOperator());
    }

    @org.junit.jupiter.api.Test
    void getOutput() {
        assertEquals(12, this.add.getOutput());
        assertEquals(8, this.sub.getOutput());
        assertEquals(5, this.div.getOutput());
        assertEquals(20, this.mult.getOutput());

    }
}