package datastructures;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Adding a node to a binary tree
    public void addNode(TreeNode newNode) {
        if (this.root == null) {
            this.root = newNode;
            return;
        }
        TreeNode pointer = this.root;
        while (pointer != null) {
            if (newNode.data < pointer.data) {
                if (pointer.hasLeft()) {
                    pointer = pointer.getLeftNode();
                } else {
                    pointer.addToLeft(newNode);
                    break;
                }
            } else {
                if (pointer.hasRight()) {
                    pointer = pointer.getRightNode();
                } else {
                    pointer.addToRight(newNode);
                    break;
                }
            }
        }
    }

    // Print the current state of the tree
    public void print() {
        System.out.println(this.root.depthFirstSearch(0));
    }
}
