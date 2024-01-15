package LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Optional;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    LinkedList testLinkedList;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        this.testLinkedList = new LinkedList(10);
        this.testLinkedList.add(100);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void add() {
        this.testLinkedList.add(200);
        assertEquals(this.testLinkedList.tail.getData(), 200);
    }

    @Test
    void contains() {
        assertTrue(this.testLinkedList.contains(100));
    }

    @Test
    void get() {
        Optional<Integer> optional = this.testLinkedList.get(0);
        assertTrue(optional.isPresent());
        assertEquals(100, optional.get());
    }

    @Test
    void insertAt() {
        this.testLinkedList.insertAt(0, 50);
        assertEquals(50, this.testLinkedList.head.getData());
    }

    @Test
    void printAll() {
        this.testLinkedList.add(400);
        this.testLinkedList.printAll();
        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("100"));
        assertTrue(output.contains("400"));
    }

    @Test
    void removeFrom() {
        this.testLinkedList.removeFrom(0);
        assertFalse(this.testLinkedList.contains(100));
    }
}