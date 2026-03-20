public class App {
    public static void main(String[] args) throws Exception {
        Product.Product1 = new Product(1 , "trt" , 299);
        Product.Product2 = new Product(2 , "trt" , 299);
        System.out.println(Product1.getid());
        System.out.println(Product2.getid());
        System.out.println(Product1.gettitle());
        System.out.println(Product2.gettitle());        
        System.out.println(Product1.getprice());
        System.out.println(Product2.getprice());        
    }
}
