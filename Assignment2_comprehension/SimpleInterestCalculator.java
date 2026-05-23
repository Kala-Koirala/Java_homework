public class SimpleInterestCalculator {
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(15000.999, 15, 4);
        System.out.println("Simple Interest: " + si.calculateInterest());
    }
}

class SimpleInterest{
    private double principal;
    private double rate;
    private int time;

    public SimpleInterest(double principal, double rate, int time){
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateInterest(){
        return (principal * rate * time)/100;
    }
}
