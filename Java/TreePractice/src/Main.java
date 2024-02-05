import bst.BinarySearchTree;
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
        ArrayList<String> depthFirst = treeTraversal.getDepthFirstTreeData();
        System.out.println("Depth first: " + depthFirst.toString());
        System.out.println("-------------------------------------------------------------------------------------------");

        ArrayList<String> breadthFirst = treeTraversal.getBreadthFirstTreeData();
        System.out.println("Breadth first: " + breadthFirst.toString());
        System.out.println("-------------------------------------------------------------------------------------------");
        ArrayList<String> breadth1stAlt = treeTraversal.getBreadthRightToLeft();
        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.println("*****Experiment*******");
        System.out.println(breadth1stAlt.toString());
        System.out.println("*****Experiment*******");
        System.out.println("-------------------------------------------------------------------------------------------");
        ArrayList<String> depth1stAlt = treeTraversal.getDepthTreeDataRightToLeft();
        System.out.println("-------------------------------------------------------------------------------------------");

        //System.out.println("*****Experiment*******");
        //System.out.println(depth1stAlt.toString());
        //System.out.println("*****Experiment*******");
        System.out.println("*******************************************************************************************");
        System.out.println("Binary Search Tree implementation");
        TreeNode jessica = new TreeNode("jessica");
        BinarySearchTree binarySearchTree = new BinarySearchTree(jessica);
        binarySearchTree.insert("alice");
        binarySearchTree.insert("ramona");
        binarySearchTree.insert("laurie");
        binarySearchTree.insert("xiaohan");
        binarySearchTree.insert("bert");
        binarySearchTree.insert("joshua");
        System.out.println("-------------------------------------------------------------------------------------------");
        binarySearchTree.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        TreeNode lookup1 = (TreeNode) binarySearchTree.lookup("bert");
        if (lookup1 != null) {
            System.out.println(lookup1.getData());
        } else {
            System.out.println("Lookup failed");
        }
        System.out.println("-------------------------------------------------------------------------------------------");

        TreeNode lookup2 = (TreeNode) binarySearchTree.lookup("ding-dong");
        if (lookup2 != null) {
            System.out.println(lookup2.getData());
        } else {
            System.out.println("Lookup failed");
        }
        System.out.println("-------------------------------------------------------------------------------------------");

        TreeNode lookup3 = (TreeNode) binarySearchTree.lookup("xiaohan");
        if (lookup3 != null) {
            System.out.println(lookup3.getData());
        } else {
            System.out.println("Lookup failed");
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Removing jessica");
        binarySearchTree.remove("jessica");
        System.out.println("-------------------------------------------------------------------------------------------");
        binarySearchTree.printAll();
        System.out.println("-------------------------------------------------------------------------------------------");
        TreeNode currentRoot = (TreeNode) binarySearchTree.getRoot();
        if (currentRoot == null) {
            System.out.println("There is no root");
        } else {
            System.out.println("This is the root data: " + currentRoot.getData());
        }
    }
}