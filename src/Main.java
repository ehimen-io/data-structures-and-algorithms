
import datastructures.*;

import java.util.Random;

import algorithms.*;

public class Main {
    public static void main(String[] args) {
        // LinkedList cities = new LinkedList();
        // cities.addToHead(new Node("New York"));
        // cities.addToHead(new Node("Shanghai"));

        // cities.addToHead(new Node("Toronto"));
        // cities.addToHead(new Node("Vancouver"));

        // cities.addToTail(new Node("Mississauga"));
        // cities.addToTail(new Node("Oakville"));
        // cities.addToTail(new Node("Ottawa"));

        // cities.printList();

        // System.out.println(Recursion.searchList(cities, "Mississauga"));

        int[] numbers = new int[15];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            numbers[i] = rand.nextInt(30);
        }

        BubbleSort.bubbleSortArray(numbers);
        for (int num : numbers) {
            System.out.print(num + ",");
        }
        System.out.print("\n");

    }
}
