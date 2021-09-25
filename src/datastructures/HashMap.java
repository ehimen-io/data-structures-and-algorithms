package datastructures;

public class HashMap {
    LinkedList[] hashmap;

    public HashMap() {
        this(10);
    }

    public HashMap(int maxSize) {
        this.hashmap = new LinkedList[maxSize];
    }

    // Static hashing function to resolve the index of an item
    public static int hash(String key, int length) {
        if (key == "") {
            return -1;
        }
        int index = 0;
        char[] keyCharecters = key.toCharArray();

        for (char i : keyCharecters) {
            index += (int) i;
        }
        return index % length;
    }

    // Stores the key-value pair in the hashmap
    public void store(String key, String data) {
        int index = HashMap.hash(key, this.hashmap.length);
        if (index == -1) {
            System.out.println("Key invalid");
        } else {
            if (this.hashmap[index] == null) {
                this.hashmap[index] = new LinkedList();
            }
            Node target = this.hashmap[index].head;

            while (target != null && target.key != key) {
                target = target.getNextNode();
            }

            if (target == null) {
                this.hashmap[index].addToTail(new Node(key, data));
            } else {
                target.data = data;
            }
        }
    }

    // Retrieves the data associated with the given key
    public String retrieve(String key) {
        int index = HashMap.hash(key, this.hashmap.length);
        if (index == -1) {
            System.out.println("Key invalid");
        } else if (this.hashmap[index] != null) {
            Node target = this.hashmap[index].head;
            while (target.key != key && target.hasNextNode()) {
                target = target.getNextNode();
            }
            if (target.key == key) {
                return target.data;
            } else {
                return "No name found";
            }
        }
        return null;
    }

    // Prints a string representation of the list items in the hashmap
    public void printMap() {
        for (LinkedList list : this.hashmap) {
            if (list != null) {
                list.printList();
            }
        }
    }

}
