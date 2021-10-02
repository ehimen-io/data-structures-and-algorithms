
import datastructures.*;

import java.util.Arrays;

import java.util.Random;

import algorithms.*;

public class Main {
    public static void main(String[] args) {
        // LinkedList cities = new LinkedList();
        // cities.addToHead(new Node("1"));
        // cities.addToHead(new Node("2"));

        // cities.printList();

        // BubbleSort.bubbleSortList(cities);

        // cities.printList();

        int[] numbers = new int[15];
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            numbers[i] = rand.nextInt(40);
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(QuickSort.sort(numbers)));
    }
}
