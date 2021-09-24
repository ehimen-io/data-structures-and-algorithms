package datastructures;

public class Node {
    public String data;
    private Node next;
    private Node prev;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    // Next node setter and getter
    public void setNextNode(Node nextNode) {
        this.next = nextNode;
    }

    public Node getNextNode() {
        return this.next;
    }

    public boolean hasNextNode() {
        return this.next != null;
    }

    // Previous node setter and getter
    public void setPreviousNode(Node previousNode) {
        this.prev = previousNode;
    }

    public Node getPreviousNode() {
        return this.prev;
    }

    public boolean hasPrevNode() {
        return this.prev != null;
    }

    public String printNode() {
        String stringRep = "(" + this.data + ")-->";
        if (this.next != null) {
            stringRep += this.next.printNode();
        } else {
            stringRep += "null";
        }
        return stringRep;
    }
}
