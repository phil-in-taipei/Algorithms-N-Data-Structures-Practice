import bst.BinarySearchTree
import traverse.Traverse
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
    println("Initializing binary search tree and inserting items")
    val binarySearchTree = BinarySearchTree(root=null)
    println("--------------------------------------------------------------------------------------")
    println("This is the root: ${binarySearchTree.getRoot()}")
    binarySearchTree.insert("F")
    binarySearchTree.insert("S")
    binarySearchTree.insert("C")
    binarySearchTree.insert("H")
    binarySearchTree.insert("V")
    binarySearchTree.insert("A")
    binarySearchTree.insert("M")

    println("--------------------------------------------------------------------------------------")
    binarySearchTree.printAll()
    println("--------------------------------------------------------------------------------------")
    println("This is the root: ${binarySearchTree.getRoot()}")
    println("--------------------------------------------------------------------------------------")
    val lookupC = binarySearchTree.lookup("C")
    println("It contains C: ${lookupC?.data}")
    println("--------------------------------------------------------------------------------------")
    val lookupX = binarySearchTree.lookup("X")
    println("It contains X: ${lookupX?.data}")
    println("--------------------------------------------------------------------------------------")
    println("Removing node C")
    binarySearchTree.remove("C")
    println("--------------------------------------------------------------------------------------")
    binarySearchTree.printAll()
    println("--------------------------------------------------------------------------------------")
    println("This is the root: ${binarySearchTree.getRoot()}")
    println("--------------------------------------------------------------------------------------")
    println("Removing node F")
    binarySearchTree.remove("F")
    println("--------------------------------------------------------------------------------------")
    binarySearchTree.printAll()
    println("--------------------------------------------------------------------------------------")
    println("This is the root: ${binarySearchTree.getRoot()}")
    println("--------------------------------------------------------------------------------------")
}