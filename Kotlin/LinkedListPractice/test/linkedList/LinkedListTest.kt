package linkedList

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class LinkedListTest {

    private val linkedList = LinkedList(head = null, tail = null)
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor));
        linkedList.add(1)
        linkedList.add(2)
    }

    @org.junit.jupiter.api.Test
    fun add() {
        linkedList.head?.let { assertEquals(it.data, 1) }
        linkedList.tail?.let { assertEquals(it.data, 2) }
    }

    @org.junit.jupiter.api.Test
    fun contains() {
        assertTrue(linkedList.contains(1))
    }

    @org.junit.jupiter.api.Test
    fun get() {
        linkedList.get(1)?.let { assertEquals(it.data, 1) }
    }

    @org.junit.jupiter.api.Test
    fun getAtIndex() {
        linkedList.getAtIndex(1)?.let { assertEquals(it.data, 2) }
        linkedList.getAtIndex(0)?.let { assertEquals(it.data, 1) }
    }

    @org.junit.jupiter.api.Test
    fun insertAt() {
        linkedList.insertAt(1, 3)
        assertTrue(linkedList.contains(3))
        linkedList.get(3)?.let { assertEquals(it.data, 3) }
        linkedList.tail?.let { assertEquals(it.data, 2) }
    }

    @org.junit.jupiter.api.Test
    fun length() {
        assertEquals(linkedList.length(), 2)
    }

    @org.junit.jupiter.api.Test
    fun printAll() {
        this.linkedList.printAll()
        val output = outputStreamCaptor.toString().trim { it <= ' ' }
        assertTrue(output.contains("1"))
        assertTrue(output.contains("2"))
    }

    @org.junit.jupiter.api.Test
    fun remove() {
        linkedList.remove(1)
        assertFalse(linkedList.contains(2))
        linkedList.tail?.let { assertEquals(it.data, 1) }
    }
}