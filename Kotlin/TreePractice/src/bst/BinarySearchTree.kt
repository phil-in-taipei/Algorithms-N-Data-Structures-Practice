package bst
import treeNode.TreeNode


class BinarySearchTree(
    private var root: TreeNode? = null,
) {

    fun insert(data: String) {
        val newNode = TreeNode(left=null, right=null, data=data)
        if (root == null) {
            root = newNode
        } else {
            var insertionInProgress = true
            var currentNode = root
            while(insertionInProgress) {
                val comparison = currentNode?.data?.let { newNode.data.compareTo(it) }
                //println("Iteration; comparison value: $comparison")
                if (comparison != null) {
                    if (comparison < 0) {
                        if (currentNode?.left == null) {
                            currentNode?.left = newNode
                            insertionInProgress = false
                        } else {
                            currentNode = currentNode.left
                        }
                    } else {
                        if (currentNode?.right == null) {
                            currentNode?.right = newNode
                            insertionInProgress = false
                        } else {
                            currentNode = currentNode.right
                        }
                    }
                }
            }
        }
    }

    fun lookup(data: String): TreeNode? {
        if (root != null) {
            var currentNode = root
            while(currentNode != null) {
                val comparison = data.compareTo(currentNode.data)
                if (comparison < 0) {
                    currentNode = currentNode.left
                } else if (comparison > 0) {
                    currentNode = currentNode.right
                } else {
                    return currentNode
                }
            }
        }
        return null
    }

    fun getRoot(): String? {
        return if (root == null) {
            null
        } else {
            root!!.data
        }
    }

    fun printAll() {
        if (root != null) {
            printRecursively(root!!)
        } else {
            println("The tree is empty!")
        }
    }

    private fun printRecursively(treeNode: TreeNode) {
        if (treeNode.left != null) {
            printRecursively(treeNode.left!!)
        }
        println(treeNode.data)
        if (treeNode.right != null) {
            printRecursively(treeNode.right!!)
        }
    }

    fun remove(data: String) {
        removeRecursive(data, root)
    }

    private fun removeRecursive(data: String, currentNode: TreeNode?): TreeNode? {
        if (currentNode == null) {
            return null
        }
        val comparison = data.compareTo(currentNode.data)
        if (comparison < 0) {
           currentNode.left = currentNode.left?.let { removeRecursive(data, it) }
            return currentNode
        } else if (comparison > 0) {
            currentNode.right = currentNode.right?.let { removeRecursive(data, it) }
            return currentNode
        } else {
            if (currentNode.left == null) {
                return currentNode.right
            } else if (currentNode.right == null) {
                return currentNode.left
            } else {
                var successorNodeCandidate = currentNode.right
                while (successorNodeCandidate?.left != null) {
                    successorNodeCandidate = successorNodeCandidate.left
                }
                if (successorNodeCandidate != null) {
                    currentNode.data = successorNodeCandidate.data
                    currentNode.right = removeRecursive(successorNodeCandidate.data, currentNode.right!!)
                }
                return currentNode
            }
        }
    }
}