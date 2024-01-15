package LinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList testLinkedList;

    @BeforeEach
    void setUp() {
        this.testLinkedList = new LinkedList(10);
        this.testLinkedList.add(100);
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
    void removeFrom() {
        this.testLinkedList.removeFrom(0);
        assertFalse(this.testLinkedList.contains(100));
    }
}