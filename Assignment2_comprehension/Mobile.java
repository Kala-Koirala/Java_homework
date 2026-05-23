public class Mobile {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Apple", "iphone 17", 850.99);
        m.displayDetails();

        m.setPrice(820.00);
        System.out.println("Updated price: $" + m.getPrice());
    }
}

class MobilePhone{
    public String brand;
    public String model;
    private double price;

    public MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        setPrice(price);
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price can't be negative!");
        }
    }

        public void displayDetails(){
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: $" + price);
        }
    }


