import org.junit.jupiter.api.Assertions.*
import treeNode.TreeNode

class TraverseTest {

    val root = TreeNode(left=null, right=null, data="a")
    val nodeB = TreeNode(left=null, right=null,data="b")
    val nodeC  = TreeNode(left=null, right=null,data="c")
    val nodeD  = TreeNode(left=null, right=null,data="d")
    val nodeE = TreeNode(left=null, right=null,data="e")
    val nodeF = TreeNode(left=null, right=null,data="f")
    val traverseTest = Traverse(root)


    @org.junit.jupiter.api.BeforeEach
    fun setUp() {
        root.left = nodeB
        root.right = nodeC
        nodeB.left = nodeD
        nodeB.right =nodeE
        nodeC.left = nodeF
    }

    @org.junit.jupiter.api.Test
    fun getBreadthFirst() {
        assertEquals(
            traverseTest.getBreadthFirst().toString(),
            "[a, b, c, d, e, f]"
        )

    }

    @org.junit.jupiter.api.Test
    fun getDepthFirst() {
        assertEquals(
            traverseTest.getDepthFirst().toString(),
            "[a, b, d, e, c, f]"
        )
    }
}