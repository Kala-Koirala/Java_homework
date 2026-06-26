public class GPSNavigationModule implements NavigationService{
    public void navigate(String startPoint, String endPoint, RouteValidator validator) throws NavigationFailedException{
        System.out.println("Attempting to navigate from " + startPoint + " to " + endPoint + "...");

        try{
            validator.isValidCommuteRoute(startPoint, endPoint, simulatedDistance(startPoint, endPoint));
        }
        catch(InvalidRouteException e){
            throw new NavigationFailedException("Route validation failed!" + e);
        }

        if(startPoint.equalsIgnoreCase("Kalanki")){
            throw new NavigationFailedException("GPS signal lost near Kalanki! Welcome to Kathmandu traffic!");
        }

        System.out.println("Navigation successful! Estimated time: 20 minutes (or 2 hours depending on traffic).");
    }

    private double simulatedDistance(String startPoint, String endPoint){
        return 5.5;
    }

    public static void main(String[] args) {
        RouteValidator rv = new KathmanduTrafficValidator();
        NavigationService gps = new GPSNavigationModule();

        try{
            gps.navigate("Basundhara", "Koteshwor", rv);
        }
        catch(NavigationFailedException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            gps.navigate("Kalanki", "Banasthali", rv);
        }
        catch(NavigationFailedException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

}