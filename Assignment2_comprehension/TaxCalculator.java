public class TaxCalculator {
    public static void main(String[] args) {
        TaxPayer tp1 = new TaxPayer("Kala", 1500000);
        TaxPayer tp2 = new TaxPayer("Sneha", 950000);

        System.out.println("Name: " + tp1.name);
        System.out.println("Income: " + tp1.income);
        System.out.println("");
        System.out.println("Name: " + tp2.name);
        System.out.println("Income: " + tp2.taxPayable());
    }
}

class TaxPayer{
    String name;
    double income;

    public TaxPayer(String name, double income){
        this.name = name;
        this.income = income;
    }

    public double taxPayable(){
        if(income < 250000){
            return 0;
        }
        else if(income > 250000 && income < 500000){
            return (income*10) / 100;
        }
        else if(income > 500000 && income < 1000000){
            return (income *20) / 100;
        }
        else{
            return (income * 30) / 100;
        }
    }

}