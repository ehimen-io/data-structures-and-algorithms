import datastructures.*;

public class Main {
    public static void main(String[] args) {
        HashMap surnames = new HashMap();
        surnames.store("Owens", "Ehimen");
        surnames.store("Annette", "Ehimen");
        surnames.store("Comfort", "Survival");
        surnames.store("John", "Lennon");
        surnames.store("Owens", "Oseghale");

        surnames.printMap();

    }
}
