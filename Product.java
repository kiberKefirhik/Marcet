import java.util.Objects;

public class Product {
    private static long counter = 1; 

    private long id;
    private String title;
    private double price;

    public Product(String title, double price) {
        this.id = counter++; 
        this.title = title;
        this.price = price;
    }

    public long getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }


    public void setTitle(String title) { this.title = title; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "[ID: " + id + "] " + title + " — " + price + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}