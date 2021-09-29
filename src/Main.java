import java.util.Random;

import datastructures.*;

public class Main {
    public static void main(String[] args) {
        Graph cities = new Graph(true);
        Vertex newYork = cities.addVertex(new Vertex("New York"));
        Vertex losAngeles = cities.addVertex(new Vertex("Los Angeles"));
        Vertex toronto = cities.addVertex(new Vertex("Toronto"));
        Vertex vancouver = cities.addVertex(new Vertex("Vancouver"));
        Vertex tokyo = cities.addVertex(new Vertex("Tokyo"));
        Vertex sanFran = cities.addVertex(new Vertex("San Francisco"));
        Vertex miami = cities.addVertex(new Vertex("Miami"));

        cities.addEdgeBetween(newYork, toronto, 700);
        cities.addEdgeBetween(losAngeles, tokyo, 2343);
        cities.addEdgeBetween(sanFran, miami, 1384);
        cities.addEdgeBetween(tokyo, toronto, 2243);
        cities.addEdgeBetween(toronto, miami, 700);
        cities.addEdgeBetween(newYork, vancouver, 684);
        cities.print();

        System.out.println("-------");
        cities.removeEdgeBetween(losAngeles, tokyo);
        cities.removeEdgeBetween(miami, toronto);
        cities.print();
    }
}
