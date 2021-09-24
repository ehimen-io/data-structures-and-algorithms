package datastructures;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Adding a node to the head of the list
    public void addToHead(Node newHead) {
        Node currentHead = this.head;
        if (currentHead != null) {
            newHead.setNextNode(currentHead);
            currentHead.setPreviousNode(newHead);
        }
        this.head = newHead;
        if (this.tail == null) {
            this.tail = newHead;
        }
    }

    // Adding a node to the tail of the list
    public void addToTail(Node newTail) {
        Node currentTail = this.tail;
        if (currentTail != null) {
            newTail.setPreviousNode(currentTail);
            currentTail.setNextNode(newTail);
        }
        this.tail = newTail;
        if (this.head == null) {
            this.head = newTail;
        }
    }

    // Remove head of the list
    public String removeHead() {
        if (this.head == null) {
            return null;
        }
        Node currentHead = this.head;
        this.head = currentHead.getNextNode();
        if (this.head != null) {
            this.head.setPreviousNode(null);
        }
        if (this.tail == currentHead) {
            removeTail();
        }
        return currentHead.data;
    }

    // Remove the tail of the list
    public String removeTail() {
        if (this.tail == null) {
            return null;
        }
        Node currentTail = this.tail;
        this.tail = currentTail.getPreviousNode();
        if (this.tail != null) {
            this.tail.setNextNode(null);
        }

        if (this.head == currentTail) {
            removeHead();
        }
        return currentTail.data;
    }

    // Prints a string representation of the list
    public void printList() {
        Node current = this.head;
        String stringRep = current.data;

        while (current.hasNextNode()) {
            stringRep += "<-->";
            current = current.getNextNode();
            stringRep += current.data;
        }

        System.out.println(stringRep);
    }
}
