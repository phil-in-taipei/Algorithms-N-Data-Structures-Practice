package bst;

import node.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    TreeNode jessica = new TreeNode("jessica");

    BinarySearchTree binarySearchTree;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        this.binarySearchTree = new BinarySearchTree(this.jessica);
        binarySearchTree.insert("alice");
        binarySearchTree.insert("ramona");
        binarySearchTree.insert("laurie");
        binarySearchTree.insert("xiaohan");
        binarySearchTree.insert("bert");
        binarySearchTree.insert("joshua");
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void getRoot() {
        assertEquals(this.binarySearchTree.getRoot(), this.jessica);
    }

    @Test
    void insert() {
        this.binarySearchTree.insert("donald");
        assertNotNull(this.binarySearchTree.lookup("donald"));
    }

    @Test
    void lookup() {
        TreeNode result = (TreeNode) this.binarySearchTree.lookup("jessica");
        assertEquals(result.getData(), "jessica");
        TreeNode result2 = (TreeNode) this.binarySearchTree.lookup("bert");
        assertEquals(result2.getData(), "bert");
    }

    @Test
    void printAll() {
        this.binarySearchTree.printAll();
        String output = outputStreamCaptor.toString().trim();
        assertTrue(output.contains("alice"));
        assertTrue(output.contains("ramona"));
        assertTrue(output.contains("laurie"));
        assertTrue(output.contains("xiaohan"));
        assertTrue(output.contains("bert"));
        assertTrue(output.contains("joshua"));
    }

    @Test
    void remove() {
        this.binarySearchTree.remove("bert");
        TreeNode result = (TreeNode) this.binarySearchTree.lookup("bert");
        assertNull(result);
    }
}