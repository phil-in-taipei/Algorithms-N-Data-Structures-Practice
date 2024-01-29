package linkedList

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class LinkedListTest {

    private val linkedList = LinkedList(head = null, tail = null)

    @BeforeEach
    fun setUp() {
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
    fun insertAt() {
        linkedList.insertAt(1, 3)
        assertTrue(linkedList.contains(3))
        linkedList.get(3)?.let { assertEquals(it.data, 3) }
    }

    @org.junit.jupiter.api.Test
    fun length() {
        assertEquals(linkedList.length(), 2)
    }

    @org.junit.jupiter.api.Test
    fun printAll() {
    }

    @org.junit.jupiter.api.Test
    fun remove() {
        linkedList.remove(0)
        assertFalse(linkedList.contains(1))
    }
}