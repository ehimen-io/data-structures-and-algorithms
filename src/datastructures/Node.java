package datastructures;

public class Node {
    public String data;
    public Node next;
    public Node prev;
    public String key;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    // Constructor Overrider for use in Hash Maps
    public Node(String key, String data) {
        this(data);
        this.key = key;
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
}
