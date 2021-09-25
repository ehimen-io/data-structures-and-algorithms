import datastructures.*;

public class Main {
    public static void main(String[] args) {
        Stack cities = new Stack(4);
        cities.push("New York");
        cities.push("Los Angeles");
        cities.push("Vancouver");
        cities.push("Ottawa");
        cities.push("Montreal");

        System.out.println(cities.peek());
        System.out.println(cities.pop());
        System.out.println(cities.pop());
        System.out.println(cities.pop());
        System.out.println(cities.pop());
    }
}
