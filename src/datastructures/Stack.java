package datastructures;

public class Stack {
    LinkedList stack;
    int size;
    int maxSize;

    public Stack() {
        this(10);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return this.size >= this.maxSize;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    // Add an Item on top of the stack
    public void push(String data) {
        Node newItem = new Node(data);
        if (this.isFull()) {
            System.out.println(data + ": Stack is full");
        } else {
            this.stack.addToHead(newItem);
            this.size++;
        }
    }

    // Remove an item from the top of the stack
    public String pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return this.stack.removeHead();
    }

    // Return the head of the stack
    public String peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return this.stack.head.data;
    }

}
