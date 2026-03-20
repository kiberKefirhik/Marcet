public class Product {
    private long id;
    private String title;
    private double price;

    Product1(long i,String t,double p){
        this.id = i;
        this.title = t;
        this.price = p; 
    }

    public long getid(){
        return this.id;
    }
    public String gettitle(){
        return this.title;
    }
    public double getprice(){
        return this.price;
    }
    

}
/*  инкапсуляция два обекта в меин 2 добавить обстракт продукт добавить поле категория 
хещ меп ключ значением будет являться навание категории
 создеть новый обычный класс он будет иметь название электро он должен наследоваться от класса продукт 
дальше обрашаем внивмание мы айди должен быть автомотическим создать новый метод не обстрактный для авто выдачи айди (по порядку +1 от пред)
абстракт метод на будуйшее для калькуляции цен 
