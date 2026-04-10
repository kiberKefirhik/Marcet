public class Main {
    public static void main(String[] args) {

        Category cars = new Category("Автомобили");
        Category phones = new Category("Смартфоны");


        cars.addProduct(new Product("M", 250));
        cars.addProduct(new Product("Audi", 290));

        phones.addProduct(new Product("Google Pixel 8", 70000));

        cars.showProducts();
        phones.showProducts();

        System.out.println();
        Catalog.showAll();

        System.out.println(cars.geProduct(0).equals(cars.geProduct(1)));
    }
}