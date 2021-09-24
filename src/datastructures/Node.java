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

    public void printNode() {
        System.out.println("Node " + this.data + " created!");
    }
}
