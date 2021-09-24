package datastructures;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Adding a node to the head of the list
    public void addToHead(Node newHead) {
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    // Adding a node to the tail of the list
    public void addToTail(Node newTail) {
        Node current = this.head;
        while (current.hasNextNode()) {
            current = current.getNextNode();
        }
        current.setNextNode(newTail);
    }

    // Remove head of the list
    public String removeHead() {
        if (this.head == null) {
            return null;
        }
        Node currentHead = this.head;
        this.head = currentHead.getNextNode();
        return currentHead.data;
    }

    // Remove the tail of the list
    public String removeTail() {
        if (this.head == null) {
            return null;
        }
        if (!this.head.hasNextNode()) {
            return this.removeHead();
        }

        Node current = this.head;
        Node previous = null;
        while (current.hasNextNode()) {
            previous = current;
            current = current.getNextNode();
        }
        previous.setNextNode(null);

        return current.data;
    }

    // Prints a string representation of the list
    public void printList() {
        Node current = this.head;
        String stringRep = current.data + "-->";

        while (current.hasNextNode()) {
            current = current.getNextNode();
            stringRep += current.data + "-->";
        }

        System.out.println(stringRep);
    }
}
