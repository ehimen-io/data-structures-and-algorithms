import datastructures.*;

public class Main {
    public static void main(String[] args) {
        Node newYork = new Node("New York");
        Node toronto = new Node("Toronto");
        Node vancouver = new Node("Vancouver");

        newYork.setNextNode(toronto);
        toronto.setNextNode(vancouver);

        System.out.println(newYork.printNode());
    }
}
