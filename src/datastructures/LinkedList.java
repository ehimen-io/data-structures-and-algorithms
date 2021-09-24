package datastructures;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(Node newHead) {
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(Node newTail) {
        Node current = this.head;
        while (current.hasNextNode()) {
            current = current.getNextNode();
        }
        current.setNextNode(newTail);
    }

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
