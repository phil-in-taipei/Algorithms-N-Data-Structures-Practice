package bst;

import node.TreeNode;

public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree(TreeNode rootNode) {
        this.root = rootNode;
    }


    public void insert(String data) {
        System.out.println("``````Inserting``````````");
        TreeNode newNode = new TreeNode(data);
        //System.out.println("This is the new node data: " + newNode.getData());
        if (this.root == null) {
            this.root = newNode;
        } else {
            //System.out.println("-----The root is not null, so commence insertion process-------");
            boolean insertionInProcess = true;
            TreeNode currentNode = this.root;
            while(insertionInProcess) {
                //System.out.print("-----New iteration---");
                //System.out.println("Current node: " + currentNode.getData());
                int comparison = newNode.getData().compareTo(currentNode.getData());
                //System.out.println("This is the comparison value: " + comparison);
                if(comparison < 0) {
                    //System.out.println(newNode.getData() + " is less than " + currentNode.getData());
                    if (currentNode.getLeft() == null) {
                        //System.out.println("There is no left node, so setting data");
                        currentNode.setLeft(newNode);
                        insertionInProcess = false;
                    } else {
                        currentNode = currentNode.getLeft();
                    }
                } else {
                    //System.out.println(newNode.getData() + " is greater than or equal to " + currentNode.getRight());
                    if (currentNode.getRight() == null) {
                       // System.out.println("There is no right node, so setting data");
                        currentNode.setRight(newNode);
                        insertionInProcess = false;
                    } else {
                        currentNode = currentNode.getRight();
                    }
                }
            }
        }
    }

    public Object lookup(String data) {
        if (this.root != null) {
            TreeNode currentNode = this.root;
            while(currentNode != null) {
                //System.out.println("This is the current node value: " + currentNode.getData());
                int comparison = data.compareTo(currentNode.getData());
                //System.out.println("This is the comparison value: " + comparison);
                if(comparison < 0) {
                    currentNode = currentNode.getLeft();
                } else if (comparison > 0) {
                    currentNode = currentNode.getRight();
                } else {
                    return currentNode;
                }
            }
        }
        return null;
    }

    public void printAll() {
        if (this.root != null) {
            this.printNodeRecursive(this.root);
        } else {
            System.out.println("Tree is empty!");
        }
    }


    private void printNodeRecursive(TreeNode currentNode) {
        if (currentNode.getLeft() != null) {
            printNodeRecursive(currentNode.getLeft());
        }
        System.out.println(currentNode.getData());
        if (currentNode.getRight() != null) {
            printNodeRecursive(currentNode.getRight());
        }
    }
}
