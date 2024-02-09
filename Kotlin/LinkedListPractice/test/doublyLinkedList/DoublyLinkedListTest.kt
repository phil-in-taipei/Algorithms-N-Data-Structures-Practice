package doublyLinkedList

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.junit.jupiter.api.Assertions.*

class DoublyLinkedListTest {

    private val dll = DoublyLinkedList(head=null, tail=null)
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor));
        dll.prepend(100)
        dll.append(200)
        dll.insertAt(1, 150)
    }

    @Test
    fun append() {
        dll.append(300)
        dll.tail?.let { assertEquals(it.data, 300) }
    }

    @Test
    fun contains() {
        assertTrue(dll.contains(100))
        assertFalse(dll.contains(400))
    }

    @Test
    fun get() {
        assertEquals(dll.get(0), 100)
        assertEquals(dll.get(1), 150)
        assertEquals(dll.get(2), 200)
        assertEquals(dll.get(3), null)
        assertEquals(dll.get(-1), null)
    }

    @Test
    fun insertAt() {
        dll.head?.next?.let { assertEquals(it.data, 150) }
    }

    @Test
    fun prepend() {
        dll.prepend(50)
        dll.head?.let { assertEquals(it.data, 50) }
    }

    @Test
    fun printAll() {
        this.dll.printAll()
        val output = outputStreamCaptor.toString().trim { it <= ' ' }
        assertTrue(output.contains("100"))
        assertTrue(output.contains("150"))
        assertTrue(output.contains("200"))
    }

    @Test
    fun removeFrom() {
        dll.removeFrom(1)
        dll.head?.next?.let { assertEquals(it.data, 200) }
    }

    @Test
    fun getHead() {
        dll.head?.let { assertEquals(it.data, 100) }
    }

    @Test
    fun getTail() {
        dll.tail?.let { assertEquals(it.data, 200) }
    }

    @Test
    fun getSize() {
        assertEquals(dll.size, 3)
    }
}