package bst

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

import org.junit.jupiter.api.Assertions.*

class BinarySearchTreeTest {

    private val outputStreamCaptor = ByteArrayOutputStream()

    private val binarySearchTree = BinarySearchTree()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
        binarySearchTree.insert("F")
        binarySearchTree.insert("S")
        binarySearchTree.insert("C")
        binarySearchTree.insert("H")
        binarySearchTree.insert("V")
        binarySearchTree.insert("A")
        binarySearchTree.insert("M")
    }

    @Test
    fun insert() {
        binarySearchTree.insert("M")
        binarySearchTree.lookup("M")?.let { assertEquals(it.data, "M") }
    }

    @Test
    fun lookup() {
        binarySearchTree.lookup("C")?.let { assertEquals(it.data, "C") }
        binarySearchTree.lookup("X")?.let { assertEquals(it.data, null) }
    }

    @Test
    fun getRoot() {
        binarySearchTree.getRoot()?.let { assertEquals(it, "F")}
    }

    @Test
    fun printAll() {
        this.binarySearchTree.printAll()
        val output = outputStreamCaptor.toString().trim { it <= ' ' }
        assertTrue(output.contains("F"))
        assertTrue(output.contains("S"))
        assertTrue(output.contains("C"))
        assertTrue(output.contains("H"))
        assertTrue(output.contains("V"))
        assertTrue(output.contains("A"))
        assertTrue(output.contains("M"))
    }

    @Test
    fun remove() {
        binarySearchTree.remove("F")
        binarySearchTree.lookup("F")?.let { assertEquals(it.data, null) }
        binarySearchTree.getRoot()?.let { assertEquals(it, "H")}
        binarySearchTree.getRoot()?.let { assertNotEquals(it, "F")}
        binarySearchTree.remove("S")
        binarySearchTree.lookup("S")?.let { assertEquals(it.data, null) }
    }
}