public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();

        System.out.println(product1.getTitle());

        System.out.println(product1.getPrice());
        
        System.out.println(product1.getId());

        product1.setTitle("dsf");
        product1.setPrice(8814);
        product1.setId(1);

        System.out.println(product1.getTitle());
       
        System.out.println(product1.getPrice());
       
        System.out.println(product1.getId());
    }
}