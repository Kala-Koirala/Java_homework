public class LaptopSpecification {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("ASUS", 8, 256);
        Laptop l2 = new Laptop("Dell", 4, 256);
        Laptop l3 = new Laptop("Acer", 16, 512);

        l1.displaySpecs();
        l2.displaySpecs();
        l3.displaySpecs();
    }
}

class Laptop{
    String brand;
    int ramSize;
    int storage;

    public Laptop(String brand, int ramSize, int storage){
        this.brand = brand;
        this.ramSize = ramSize;
        this.storage = storage;
    }

    public void displaySpecs(){
        if(ramSize >= 8){
            System.out.println("Brand: " + this.brand);
            System.out.println("Ram Size: " + this.ramSize + "GB");
            System.out.println("Storage: " + this.storage + "GB");
            System.out.println("");
        }
    }
}
