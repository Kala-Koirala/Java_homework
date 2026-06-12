import java.util.Arrays;

public class FoodOrderApp {
    public static void main(String[] args) {
        String[] toppings = {"chicken", "onion", "olives"};
        String[] ingredients = {"Banana", "Apple", "Orange"};

        Pizza pz = new Pizza("Chicken Pizza", 650, "medium", toppings);
        Burger bg = new Burger("Chicken burger", 350, true, "chicken");
        Salad sl = new Salad("Fruit Salad", 450, ingredients);

        pz.displayMenuItem();
        bg.displayMenuItem();
        sl.displayMenuItem();
    }
}

abstract class FoodItem{
    private String name;
    private double price;

    public FoodItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract void displayMenuItem();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}

class Pizza extends FoodItem{
    private String size;
    private String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings){
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    public String[] getToppings(){
        return this.toppings;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Item: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + Arrays.toString(getToppings()));
        System.out.println(" ");
    }
}

class Burger extends FoodItem{
    private boolean cheese;
    private String pattyType;

    public Burger(String name, double price, boolean cheese, String pattyType){
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Item: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Cheese: " + cheese);
        System.out.println("Patty Type: " + pattyType);
        System.out.println(" ");
    }
}

class Salad extends FoodItem{
    private String[] ingredients;

    public Salad(String name, double price, String[] ingredients){
        super(name, price);
        this.ingredients = ingredients;
    }

    public String[] getIngredients(){
        return this.ingredients;
    }

    @Override
    public void displayMenuItem() {
        System.out.println("Item: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Ingredients: " + Arrays.toString(getIngredients()));
        System.out.println(" ");
    }
}