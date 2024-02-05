package bst;

import node.TreeNode;

public class BinarySearchTree {

    TreeNode root;

    public BinarySearchTree(TreeNode rootNode) {
        this.root = rootNode;
    }

    public Object getRoot() {
        return this.root;
    }


    public void insert(String data) {
        //System.out.println("``````Inserting``````````");
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

    public void remove(String data) {
        this.removeRecursive(this.root, data);
    }

    private TreeNode removeRecursive(TreeNode currentNode, String data) {
        System.out.println("-*--*--*--*--*--*--*--*Recursion--*--*--*--*--*--*--*--*--*-");
        if (currentNode == null) {
            System.out.println("Node is null -- unwind");
            return null;
        }
        System.out.println("Current node: " + currentNode.getData());
        int comparison = data.compareTo(currentNode.getData());
        System.out.println("Comparison value: " + comparison);
        if(comparison < 0) {
            // value is lower, so go to the left child
            System.out.println("Lower -- go left");
            currentNode.setLeft(removeRecursive(currentNode.getLeft(), data));
            return currentNode;
        } else if (comparison > 0) {
            // value is higher, so go to the right child
            System.out.println("Higher -- go right");
            currentNode.setRight(removeRecursive(currentNode.getRight(), data));
            return currentNode;
        } else {
            // the value is the same as the current node
            System.out.println("Equal value");
            if (currentNode.getLeft() == null) {
                // no left child, so return the right child
                System.out.println("No left -- go right");
                return currentNode.getRight();
            } else if (currentNode.getRight() == null) {
                // no right child, so return the left child
                System.out.println("No right -- go left");
                return currentNode.getLeft();
            } else {
                // It has both left and right child nodes, so find the lowest child node on the right side
                // It will be the next highest value node in the tree, so it will replace the removed node
                // iterate through until it no longer has any left (lower) children
                TreeNode successorNodeCandidate = currentNode.getRight();
                while (successorNodeCandidate.getLeft() != null) {
                    successorNodeCandidate = successorNodeCandidate.getLeft();
                }
                // replace node with value
                System.out.println("Replacement node: " + successorNodeCandidate.getData());
                currentNode.setData(successorNodeCandidate.getData());
                // remove successor node from right tree
                System.out.println("Now cleanup right side of tree...");
                currentNode.setRight(removeRecursive(currentNode.getRight(), successorNodeCandidate.getData()));
                return currentNode;
            }
        }
    }
}
