public class Question10 {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 2008);
        Car car2 = new Car("Ford", 1903);

        car1.displayDetails();
        car2.displayDetails();
    }
}

class Car{
    String brand;
    int year;

    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void displayDetails(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: " + this.year);
    }
}
