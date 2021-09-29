import java.util.Random;

import datastructures.*;

public class Main {
    public static void main(String[] args) {
        MinHeap testHeap = new MinHeap();
        Random rand = new Random();
        int count = 1;
        while (count <= 15) {
            testHeap.add(rand.nextInt(30));
            count++;
        }
        testHeap.print();
        System.out.println("Removing smallest: " + testHeap.remove());
        testHeap.print();

    }
}
