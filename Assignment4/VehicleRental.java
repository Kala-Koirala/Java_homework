public class VehicleRental {
    public static void main(String[] args) {
        Car car = new Car("A123", 5000, 2);
        Truck truck = new Truck("B123", 7000, 4, 5000);
        Bike bike = new Bike("C123", 3000, 1);

        System.out.println("Car plate number: " + car.getPlateNumber());
        System.out.println("No. of days: " + car.getDays());
        System.out.println("Total rate: " + car.calculateRental());
        System.out.println(" ");

        System.out.println("Truck plate number: " + truck.getPlateNumber());
        System.out.println("No. of days: " + truck.getDays());
        System.out.println("Total rate: " + truck.calculateRental());
        System.out.println(" ");

        System.out.println("Bike plate number: " + bike.getPlateNumber());
        System.out.println("No. of days: " + bike.getDays());
        System.out.println("Total rate: " + bike.calculateRental());
    }
}

abstract class Vehicle{
    private String plateNumber;
    private double baseRate;
    private int days;

    public Vehicle(String pn, double br, int days){
        this.plateNumber = pn;
        this.baseRate = br;
        this.days = days;
    }

    public String getPlateNumber(){
        return plateNumber;
    }
    public void setPlateNumber(String pn){
        this.plateNumber = pn;
    }

    public double getBaseRate(){
        return baseRate;
    }
    public void setBaseRate(double br){
        this.baseRate = br;
    }

    public int getDays(){
        return days;
    }
    public void setDays(int days){
        this.days = days;
    }

    public double calculateRental(){
        return baseRate;
    }
}

class Car extends Vehicle{
    public Car(String pn, double br, int days){
        super(pn, br, days);
    }

    @Override
    public double calculateRental(){
        return getBaseRate() * getDays();
    }
}

class Truck extends Vehicle{
    private double loadFee;

    public Truck(String pn, double br, int days, double lf){
        super(pn, br, days);
        this.loadFee = lf;
    }

    public double getLoadFee(){
        return loadFee;
    }
    public void setLoadFee(double lf){
        this.loadFee = lf;
    }

    @Override
    public double calculateRental(){
        return getBaseRate() * getDays() + getLoadFee();
    }
}

class Bike extends Vehicle{
    public Bike(String pn, double br, int days){
        super(pn, br, days);
    }

    @Override
    public double calculateRental(){
        return getBaseRate();
    }
}
