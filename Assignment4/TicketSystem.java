public class TicketSystem {
    public static void main(String[] args) {
        BusTicket bt = new BusTicket(1001, 2500, "A2");
        TrainTicket tt = new TrainTicket(2002, 1500, "3B");
        FlightTicket ft = new FlightTicket(3003, 5500, "10A");

        bt.generateTicket();
        tt.generateTicket();
        ft.generateTicket();
    }
}

abstract class Ticket{
    private int ticketNumber;
    private double price;

    public Ticket(int tn, double price){
        this.ticketNumber = tn;
        this.price = price;
    }

    public abstract void generateTicket();

    public int getTicketNumber(){
        return ticketNumber;
    }
    public void setTicketNumber(int tn){
        this.ticketNumber = tn;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class BusTicket extends Ticket{
    private String seatNumber;

    public BusTicket(int ticketNumber, double price, String seatNumber){
        super(ticketNumber, price);
        this.seatNumber = seatNumber;
    }

    @Override
    public void generateTicket(){
        System.out.println("Bus Ticket");
        System.out.println("Ticket Number: " + getTicketNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Seat Number: " + seatNumber);
        System.out.println(" ");
    }
}

class TrainTicket extends Ticket{
    private String coachType;

    public TrainTicket(int ticketNumber, double price, String coachType){
        super(ticketNumber, price);
        this.coachType = coachType;
    }

    @Override
    public void generateTicket(){
        System.out.println("Train Ticket");
        System.out.println("Ticket Number: " + getTicketNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Coach Type: " + coachType);
        System.out.println(" ");
    }
}

class FlightTicket extends Ticket{
    private String boardingGate;

    public FlightTicket(int ticketNumber, double price, String boardingGate){
        super(ticketNumber, price);
        this.boardingGate = boardingGate;
    }

    @Override
    public void generateTicket(){
        System.out.println("Flight Ticket");
        System.out.println("Ticket Number: " + getTicketNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Boarding Gate: " + boardingGate);
        System.out.println(" ");
    }
}

