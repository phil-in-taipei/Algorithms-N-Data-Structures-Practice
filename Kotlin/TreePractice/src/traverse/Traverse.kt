package traverse

import treeNode.TreeNode


class Traverse(
    val root: TreeNode
) {
    // breadth queued from left to right
    fun getBreadthFirst(): ArrayList<String> {
        val treeNodes = arrayListOf<String>()
        val stack = ArrayDeque<TreeNode>()
        stack.add(root);
        while(!stack.isEmpty()) {
            val currentNode = stack.removeFirst() // remove first for stack
            treeNodes.add(currentNode.data)
            if (currentNode.left != null) {
                stack.add(currentNode.left!!);
            }
            if (currentNode.right != null) {
                stack.add(currentNode.right!!);
            }
        }
        return treeNodes
    }

    // depth stacked from right to left
    fun getDepthFirst(): ArrayList<String> {
        val treeNodes = arrayListOf<String>()
        val queue = ArrayDeque<TreeNode>()
        queue.add(root) // adds to the end
        while(!queue.isEmpty()) {
            val currentNode = queue.removeLast() // remove last for queue
            treeNodes.add(currentNode.data)
            if (currentNode.right != null) {
                queue.add(currentNode.right!!);
            }
            if (currentNode.left != null) {
                queue.add(currentNode.left!!);
            }
        }
        return treeNodes
    }
}