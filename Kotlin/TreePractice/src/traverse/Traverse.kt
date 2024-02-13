package traverse

import treeNode.TreeNode


class Traverse(
    val root: TreeNode
) {
    // breadth queued from left to right
    fun getBreadthFirst(): ArrayList<String> {
        val treeNodes = arrayListOf<String>()
        val queue = ArrayDeque<TreeNode>()
        queue.add(root) // adds to the end of the list
        while(!queue.isEmpty()) {
            val currentNode = queue.removeFirst() // remove first for queue
            treeNodes.add(currentNode.data)
            if (currentNode.left != null) {
                queue.add(currentNode.left!!);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right!!);
            }
        }
        return treeNodes
    }

    // depth stacked from right to left
    fun getDepthFirst(): ArrayList<String> {
        val treeNodes = arrayListOf<String>()
        val stack = ArrayDeque<TreeNode>()
        stack.add(root) // adds to the end
        while(!stack.isEmpty()) {
            val currentNode = stack.removeLast() // remove last for stack
            treeNodes.add(currentNode.data)
            if (currentNode.right != null) {
                stack.add(currentNode.right!!);
            }
            if (currentNode.left != null) {
                stack.add(currentNode.left!!);
            }
        }
        return treeNodes
    }
}