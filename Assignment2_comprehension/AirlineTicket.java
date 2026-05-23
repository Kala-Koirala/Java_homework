import java.util.Scanner;

public class AirlineTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Passenger name: ");
        String name = scanner.nextLine();

        System.out.print("Ticket Class: ");
        String tclass = scanner.next();
        tclass = tclass.toLowerCase();

        System.out.print("Base Price: ");
        int price = scanner.nextInt();

        Ticket t1 = new Ticket(name, tclass, price);
        t1.finalPrice();
    }
}

class Ticket{
    String passengerName;
    String travelClass;
    int basePrice;

    public Ticket(String name, String tclass, int price){
        this.passengerName = name;
        this.travelClass = tclass;
        this.basePrice = price;
    }

    public void finalPrice(){
        if(travelClass.equals("economy")){
            System.out.println("Ticket Price: " + basePrice);
        }
        else if(travelClass.equals("business")){
            System.out.println("Ticket Price: " + (basePrice + (basePrice * 30) / 100));
        }
        else if (travelClass.equals("first")) {
            System.out.println("Ticket Price: " + (basePrice + (basePrice * 50) / 100));
        }
        else{
            System.out.println("Invalid ticket class!");
        }
    }

}