package datastructures;

public class TreeNode {
    int data;
    private TreeNode right;
    private TreeNode left;

    public TreeNode(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public void addToRight(TreeNode newRight) {
        this.right = newRight;
    }

    public void addToLeft(TreeNode newLeft) {
        this.left = newLeft;
    }

    public TreeNode getRightNode() {
        return this.right;
    }

    public TreeNode getLeftNode() {
        return this.left;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public String depthFirstSearch(int level) {
        String output = "";
        int count = level;
        while (count > 0) {
            output += "--";
            count--;
        }
        output += this.data + "\n";
        if (this.left != null) {
            output += this.left.depthFirstSearch(level + 1);
        }
        if (this.right != null) {
            output += this.right.depthFirstSearch(level + 1);
        }
        return output;
    }
}
