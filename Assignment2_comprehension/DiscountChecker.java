public class DiscountChecker {
    public static void main(String[] args) {
        Customer c = new Customer("Kala", true, 1500.99);
        Customer c2 = new Customer("Ritika", false, 2000);

        System.out.printf("Final Amount: %.2f", c.customerDiscount());
    }
}

class Customer{
    String name;
    boolean isMember;
    double purchaseAmount;

    public Customer(String name, boolean isMember, double amount){
        this.name = name;
        this.isMember = isMember;
        this.purchaseAmount = amount;
    }

    public double customerDiscount(){
        if(purchaseAmount > 1000 && isMember){
            purchaseAmount -= (purchaseAmount * 15) / 100;
            return purchaseAmount;
        }
        else{
            return purchaseAmount;
        }
    }
}

