package DoublyLinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private DoublyLinkedList testDLL;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        this.testDLL = new DoublyLinkedList();
        this.testDLL.append(100);
        this.testDLL.append(200);
        this.testDLL.append(300);
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void append() {
        this.testDLL.append(400);
        assertEquals(this.testDLL.getLength(), 4);
        assertTrue(this.testDLL.getTail().contains("400"));
        assertTrue(this.testDLL.contains(400));
    }

    @Test
    void contains() {
        assertTrue(this.testDLL.contains(100));
        assertTrue(this.testDLL.contains(200));
        assertTrue(this.testDLL.contains(300));
        assertFalse(this.testDLL.contains(50));
    }

    @Test
    void get() {
        assertEquals(this.testDLL.get(1), 200);
        assertNull(this.testDLL.get(500));
    }

    @Test
    void getDebugInfo() {
        assertEquals(
                this.testDLL.getDebugInfo(5),
                "NODE AT INDEX 5: [ERROR: NO NODE FOUND]"
        );
        assertTrue(
                this.testDLL.getDebugInfo(1).contains("NODE AT INDEX 1")
        );
        assertTrue(
                this.testDLL.getDebugInfo(1).contains("Current Node: {Data: 200}")
        );
    }

    @Test
    void getHead() {
        assertEquals(
                this.testDLL.getHead(),
                "HEAD: [Current Node: {Data: 100}, {Next Data: 200}]"
        );
    }

    @Test
    void getLength() {
        assertEquals(this.testDLL.getLength(), 3);
    }

    @Test
    void getTail() {
        assertEquals(
                this.testDLL.getTail(),
                "TAIL: [{Previous Data: 200}, Current Node: {Data: 300}]"
        );
    }

    @Test
    void insertAt() {
        this.testDLL.insertAt(1, 150);
        assertEquals(this.testDLL.get(1), 150);
    }

    @Test
    void prepend() {
        this.testDLL.prepend(50);
        assertEquals(this.testDLL.get(0), 50);
        assertEquals(
                this.testDLL.getHead(),
                "HEAD: [Current Node: {Data: 50}, {Next Data: 100}]"
        );
    }

    @Test
    void printAll() {
        this.testDLL.printAll();
        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("100"));
        assertTrue(output.contains("200"));
    }

    @Test
    void printAllReverse() {
        this.testDLL.printAll();
        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("200"));
        assertTrue(output.contains("100"));
    }

    @Test
    void removeFrom() {
        this.testDLL.removeFrom(1);
        assertFalse(this.testDLL.contains(200));
    }
}