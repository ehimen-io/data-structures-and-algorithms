package datastructures;

public class Queue {
    LinkedList queue;
    private int size;
    private int maxSize;
    private Node latest;

    public Queue() {
        this(10);
    }

    public Queue(int maxSize) {
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public void enqueue(String data) {
        if (this.isFull()) {
            System.out.println("Queue is full");
        } else {
            Node newItem = new Node(data);
            this.queue.addToTail(newItem);
            this.latest = newItem;
            this.size++;
        }

    }

    public String dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            this.size--;
            return this.queue.removeHead();
        }

    }

    public String peek() {
        return this.queue.head.data;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size >= this.maxSize;
    }

    public String getLatest() {
        return this.latest.data;
    }

    public void printQueue() {
        this.queue.printList();
    }
}
