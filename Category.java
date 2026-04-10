import java.util.ArrayList;

public class Category {
    private String title;
    private ArrayList<Product> products = new ArrayList<>();

    public Category(String title) {
        this.title = title;
        Catalog.add(title);
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {
        System.out.println("\nТовары в категории [" + title + "]:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public String getTitle() { return title; }
    public Product geProduct(int i){return products.get(i);}
}