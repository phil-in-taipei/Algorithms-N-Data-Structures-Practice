package traversal;

import node.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class TreeTraversalTest {

    TreeNode root = new TreeNode("a");
    TreeNode nodeB = new TreeNode("b");
    TreeNode nodeC = new TreeNode("c");
    TreeNode nodeD = new TreeNode("d");
    TreeNode nodeE = new TreeNode("e");
    TreeNode nodeF = new TreeNode("f");

    TreeTraversal treeTraversal;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        root.setLeft(nodeB);
        root.setRight(nodeC);
        nodeB.setLeft(nodeD);
        nodeB.setRight(nodeE);
        nodeC.setLeft(nodeF);
        treeTraversal = new TreeTraversal(root);
    }

    @org.junit.jupiter.api.Test
    void getBreadthFirstTreeData() {
        assertEquals(
                this.treeTraversal.getBreadthFirstTreeData().toString(),
                "[a, b, c, d, e, f]"
        );
    }

    @org.junit.jupiter.api.Test
    void getDepthFirstTreeData() {
        assertEquals(
                this.treeTraversal.getDepthFirstTreeData().toString(),
                "[a, b, d, e, c, f]"
        );
    }
}