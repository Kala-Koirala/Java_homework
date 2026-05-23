public class Question10 {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Mustang", 3200000);
        Car c2 = new Car("BMW", "X5", 4500000);
        Car c3 = new Car("Honda", "Civic", 4400000);
        Car c4 = new Car("Tata", "Tiago", 4200000);
        Car c5 = new Car("Seres", "Mini EV", 1200000);

        c1.displayCar();
        c2.displayCar();
        c3.displayCar();
        c4.displayCar();
        c5.displayCar();
    }
}

class Car{
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCar(){
        if(price > 2000000){
            System.out.println("Brand: " + this.brand);
            System.out.println("Model: " + this.model);
            System.out.println("Price: " + this.price);
            System.out.println("");
        }
    }
}