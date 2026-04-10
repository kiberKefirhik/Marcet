import java.util.ArrayList;

public class Catalog {
    // Статический список — один на всю программу
    public static ArrayList<String> allCategories = new ArrayList<>();

    // Статический метод для добавления названия в список
    public static void add(String name) {
        if (!allCategories.contains(name)) {
            allCategories.add(name);
        }
    }

    // Метод для вывода всех категорий
    public static void showAll() {
        System.out.println("Список всех категорий в каталоге:");
        for (String s : allCategories) {
            System.out.println("- " + s);
        }
    }
}