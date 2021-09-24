import datastructures.*;

public class Main {
    public static void main(String[] args) {
        Queue cities = new Queue(4);
        cities.enqueue("New York");
        cities.enqueue("Boston");
        cities.enqueue("Toronto");
        cities.enqueue("Vancouver");
        cities.enqueue("Ottawa");

        System.out.println(cities.dequeue());
        System.out.println(cities.dequeue());
        System.out.println(cities.dequeue());
        System.out.println(cities.dequeue());
        System.out.println(cities.dequeue());
    }
}
