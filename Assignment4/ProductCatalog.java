public class ProductCatalog {
    public static void main(String[] args) {
        Electronics ec = new Electronics("Earpods", 2500, 1);
        Clothing cl = new Clothing("T-shirt", 2000, "Medium", "Cotton");
        Grocery gc = new Grocery("Tofu", 100, "June 14, 2026");

        ec.displayDetails();
        cl.displayDetails();
        gc.displayDetails();
    }
}

abstract class Product{
    public String name;
    public double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Product name: " + name);
        System.out.println("Price: " +  price);
    }
}

class Electronics extends Product{
    public int warrantyPeriod;

    public Electronics(String name, double price, int wp){
        super(name, price);
        this.warrantyPeriod = wp;
    }

    @Override
    public void displayDetails(){
        System.out.println("Electronic Product");
        System.out.println("Product name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty periods: " + warrantyPeriod + " years\n");
    }
}

class Clothing extends Product{
    public String size;
    public String material;

    public Clothing(String name, double price, String size, String material){
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails(){
        System.out.println("Clothing Product");
        System.out.println("Product name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material + "\n");
    }
}

class Grocery extends Product{
    public String expiryDate;

    public Grocery(String name, double price, String expiryDate){
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails(){
        System.out.println("Grocery Product");
        System.out.println("Product name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
