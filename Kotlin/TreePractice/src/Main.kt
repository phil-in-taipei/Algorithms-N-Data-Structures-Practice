import treeNode.TreeNode

fun main() {
    println("--------------------------------------------------------------------------------------")
    println("Creating tree nodes")
    val root = TreeNode(left=null, right=null, data="a")
    val nodeB = TreeNode(left=null, right=null,data="b")
    val nodeC  = TreeNode(left=null, right=null,data="c")
    val nodeD  = TreeNode(left=null, right=null,data="d")
    val nodeE = TreeNode(left=null, right=null,data="e")
    val nodeF = TreeNode(left=null, right=null,data="f")

    root.left = nodeB
    root.right = nodeC
    nodeB.left = nodeD
    nodeB.right =nodeE
    nodeC.left = nodeF
    println("--------------------------------------------------------------------------------------")
    val traversal = Traverse(root=root)
    println("Depth first: " + traversal.getDepthFirst().toString())
    println("--------------------------------------------------------------------------------------")


    println("Breadth first: " + traversal.getBreadthFirst().toString())

    println("--------------------------------------------------------------------------------------")

}