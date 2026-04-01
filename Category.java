import java.util.HashMap;

public abstract class Category extends Product {

    
    private HashMap<Integer, String> category;

    private Category listCategory;

    Category (){}
    public void addcategory (String name, long idcat){
        category.putAll(name,idcat);
    }
}