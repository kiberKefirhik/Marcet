import java.util.HashMap;

public class Product {
    private long id = 1;
    private static long counter = 0;
    private String title;
    private double price;
    private HashMap<Integer, String> category;

    public Product(long id, String title, double price, HashMap<Integer, String> category) {
        this.id += this.counter;
        this.counter++;
        
        this.id = id;
        this.title = title;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public long getId() { return this.id; }

    public String getTitle() { return this.title; }

    public double getPrice() { return this.price; }

    public HashMap<Integer, String> getCategory() { return this.category; }

    public void setId(long id) { this.id = id; }

    public void setTitle(String title) { this.title = title; }

    public void setPrice(double price) { this.price = price; }
    
    public void setCategory(HashMap<Integer, String> category) { this.category = category; }
}





/*
добавить добавление категории в класс категории и шот категории показываюштй все категории 
создать новый класс каталог в котором мы будем хранить список оснавных категорий добовляем счетчик который показывает количество категорий и 2 главные категории 



*/