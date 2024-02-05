import node.TreeNode;
import traversal.TreeTraversal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------------");
        TreeNode root = new TreeNode("a");
        TreeNode nodeB = new TreeNode("b");
        TreeNode nodeC = new TreeNode("c");
        TreeNode nodeD = new TreeNode("d");
        TreeNode nodeE = new TreeNode("e");
        TreeNode nodeF = new TreeNode("f");

        root.setLeft(nodeB);
        root.setRight(nodeC);
        nodeB.setLeft(nodeD);
        nodeB.setRight(nodeE);
        nodeC.setLeft(nodeF);
        System.out.println("-------------------------------------------------------------------------------------------");
        TreeTraversal treeTraversal = new TreeTraversal(root);
        ArrayList<String> breadthFirst = treeTraversal.getDepthFirstTreeData();
        System.out.println(breadthFirst.toString());
        System.out.println("-------------------------------------------------------------------------------------------");

        ArrayList<String> depthFirst = treeTraversal.getBreadthFirstTreeData();
        System.out.println(depthFirst.toString());
        System.out.println("-------------------------------------------------------------------------------------------");
        ArrayList<String> breadth1stAlt = treeTraversal.getBreadthRightToLeft();
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("*****Experiment*******");
        System.out.println(breadth1stAlt.toString());
        System.out.println("*****Experiment*******");
        System.out.println("-------------------------------------------------------------------------------------------");
        ArrayList<String> depth1stAlt = treeTraversal.getDepthTreeDataRightToLeft();
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("*****Experiment*******");
        System.out.println(depth1stAlt.toString());
        System.out.println("*****Experiment*******");
        System.out.println("-------------------------------------------------------------------------------------------");

    }
}