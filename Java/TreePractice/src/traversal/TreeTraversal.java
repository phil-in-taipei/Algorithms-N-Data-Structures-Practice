package traversal;

import node.TreeNode;

import java.util.*;

public class TreeTraversal {

    TreeNode rootNode;

    ArrayList<String> nodesInTreeData;

    public TreeTraversal(TreeNode rootNode) {
        this.rootNode = rootNode;
        this.nodesInTreeData = new ArrayList<>();
    }

    private void clearNodesInTreeData() {
        this.nodesInTreeData.clear();
    }

    private void addNodeData(TreeNode treeNode){
        this.nodesInTreeData.add(treeNode.getData());
    }

    public ArrayList<String> getBreadthFirstTreeData() {
        this.clearNodesInTreeData();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.rootNode);
        while(!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();
            this.addNodeData(currentNode);
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
        return this.nodesInTreeData;
    }

    public ArrayList<String> getDepthFirstTreeData() {
        this.clearNodesInTreeData();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.add(this.rootNode);
        while(!stack.empty()) {
            TreeNode currentNode = stack.pop();
            this.addNodeData(currentNode);
            if(currentNode.getRight() != null) {
                stack.add(currentNode.getRight());
            }
            if(currentNode.getLeft() != null) {
                stack.add(currentNode.getLeft());
            }
        }
        return this.nodesInTreeData;
    }

}
