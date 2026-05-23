public class Question7 {
    public static void main(String[] args) {
        Product p1 = new Product("Moisturizer", 1500.99, 10);
        Product p2 = new Product("Claw Clips", 300.00, 5);
        Product p3 = new Product("Curl cream", 750, 4);

        System.out.println("Final Price of " + p1.productName + " = " + p1.calculateFinalPrice());
        System.out.println("Final Price of " + p2.productName + " = " + p2.calculateFinalPrice());
        System.out.println("Final Price of " + p3.productName + " = " + p3.calculateFinalPrice());
    }
}

class Product{
    String productName;
    double price;
    int discountPercentage;

    public Product(String name, double price, int percent){
        this.productName = name;
        this.price = price;
        this.discountPercentage = percent;
    }

    public double calculateFinalPrice(){
        return price - ((price * discountPercentage)/100);

    }
}
