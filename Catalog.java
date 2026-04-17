import java.util.ArrayList;

public class Catalog {
    public static ArrayList<String> allCategories = new ArrayList<>();

    public static void add(String name) {
        if (!allCategories.contains(name)) {
            allCategories.add(name);
        }
    }

    public static void showAll() {
        System.out.println("Список всех категорий в каталоге:");
        for (String s : allCategories) {
            System.out.println("- " + s);
        }
    }
}