import java.util.Random;

import datastructures.*;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree numbers = new BinarySearchTree();
        Random rand = new Random();
        numbers.addNode(new TreeNode(25));

        for (int i = 0; i < 13; i++) {
            numbers.addNode(new TreeNode(rand.nextInt(50)));
        }

        numbers.print();
    }
}
