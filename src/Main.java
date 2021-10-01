
import datastructures.*;

import java.util.Random;

import algorithms.*;

public class Main {
    public static void main(String[] args) {
        LinkedList cities = new LinkedList();
        cities.addToHead(new Node("1"));
        cities.addToHead(new Node("2"));

        cities.addToHead(new Node("4"));
        cities.addToHead(new Node("3"));

        cities.addToTail(new Node("7"));
        cities.addToTail(new Node("6"));
        cities.addToTail(new Node("5"));

        cities.addToHead(new Node("10"));
        cities.addToHead(new Node("15"));
        cities.addToHead(new Node("23"));
        cities.addToHead(new Node("0"));
        cities.addToHead(new Node("68"));

        cities.printList();

        BubbleSort.bubbleSortList(cities);

        cities.printList();

        // int[] numbers = new int[15];
        // Random rand = new Random();

        // for (int i = 0; i < 15; i++) {
        // numbers[i] = rand.nextInt(30);
        // }

        // BubbleSort.bubbleSortArray(numbers);
        // for (int num : numbers) {
        // System.out.print(num + ",");
        // }
        // System.out.print("\n");

    }
}
