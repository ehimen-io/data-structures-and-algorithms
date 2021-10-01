
import datastructures.*;
import algorithms.*;

public class Main {
    public static void main(String[] args) {
        LinkedList cities = new LinkedList();
        cities.addToHead(new Node("New York"));
        cities.addToHead(new Node("Shanghai"));

        cities.addToHead(new Node("Toronto"));
        cities.addToHead(new Node("Vancouver"));

        cities.addToTail(new Node("Mississauga"));
        cities.addToTail(new Node("Oakville"));
        cities.addToTail(new Node("Ottawa"));

        cities.printList();

        Recursion.reverseList(cities);
        cities.printList();

    }
}
