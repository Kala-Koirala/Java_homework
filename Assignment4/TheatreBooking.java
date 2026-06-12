public class TheatreBooking {
    public static void main(String[] args) {
        RegularSeat rs = new RegularSeat("F4");
        PremiumSeat ps = new PremiumSeat("P1");

        rs.bookSeat();
        ps.bookSeat();
    }
}

abstract class Seat{
    public String seatNumber;

    public Seat(String sn){
        this.seatNumber = sn;
    }

    public abstract void bookSeat();
}

class RegularSeat extends Seat{
    public RegularSeat(String seatNumber){
        super(seatNumber);
    }

    @Override
    public void bookSeat(){
        System.out.println("Booking Regular Seat...");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Booking Allowed Anytime!");
        System.out.println(" ");
    }
}

class PremiumSeat extends Seat{
    public PremiumSeat(String seatNumber){
        super(seatNumber);
    }

    @Override
    public void bookSeat(){
        System.out.println("Booking Premium Seat...");
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Snack and luxury fee included!");
        System.out.println(" ");
    }
}
