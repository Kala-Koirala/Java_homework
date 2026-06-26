public class KathmanduTrafficValidator implements RouteValidator{

    @Override
    public boolean isValidCommuteRoute(String origin, String destination, double distanceKm) throws InvalidRouteException, SameLocationException{
        if(origin.equalsIgnoreCase(destination)){
            throw new SameLocationException("Origin and destination cannot be the same! Are you just spinning in circles, Damodar?");
        }
        if(distanceKm < 0.1 || distanceKm > 30){
            throw new InvalidRouteException("Distance " + distanceKm + "km is unrealistic for Kathmandu commute!");
        }
        return true; 
    }
      
    public static void main(String[] args) {
        KathmanduTrafficValidator ktv = new KathmanduTrafficValidator();

        try{
           System.out.println("Commute Overview: " + ktv.isValidCommuteRoute("Basundhara", "Basundhara", 5.4)); 
        }
        catch(SameLocationException e){
            System.out.println(" ");
            System.out.println("Error: " + e.getMessage());
        }
        catch(InvalidRouteException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
           System.out.println("Commute Overview: " + ktv.isValidCommuteRoute("Swyambhu", "Koteshwor", 5.4)); 
        }
        catch(SameLocationException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(InvalidRouteException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            System.out.println("Commute Overview: " + ktv.isValidCommuteRoute("Basundahar", "Kalanki", 0.01));
        }catch(SameLocationException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(InvalidRouteException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
           System.out.println("Commute Overview: " + ktv.isValidCommuteRoute("Koteshwor", "Basundhara", 50)); 
        }catch(SameLocationException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(InvalidRouteException e){
            System.out.println("Error: " + e.getMessage());
            System.out.println(" ");
        }   
    }
}


class SameLocationException extends InvalidRouteException{
    public SameLocationException(String error_message){
        super(error_message);
    }
}