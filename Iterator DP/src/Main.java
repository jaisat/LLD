import java.util.ArrayList;
import java.util.List;

class Product{
    private String name;
    private String price;

    public Product(String name, String price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPrice(){
        return this.price;
    }

    public void setPrice(){
        this.price = price;
    }
}

interface Iterator{
    public Product first();
    public Product next();
    public boolean hasNext();
}

class ProductIterator implements Iterator{
    private  List<Product> products = new ArrayList<>();
    private  Integer currentSize;


    @Override
    public Product first() {
        return null;
    }

    @Override
    public Product next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}


public class Main {
    public static void main(String[] args) {
    }
}