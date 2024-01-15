package calculations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CountDownTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private CountDown testCountDown;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        this.testCountDown = new CountDown(1);
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void output() {
        this.testCountDown.output();
        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("1"));
        assertTrue(output.contains("Blast Off!"));
    }
}