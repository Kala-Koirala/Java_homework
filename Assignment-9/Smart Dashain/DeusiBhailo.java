import java.util.Arrays;
import java.util.List;

public class DeusiBhailo extends FestivalActivity{
    List<String> plannedRoutes;
    int NumberOfPerformers;

    public DeusiBhailo(double estimatedCost, List<String> plannedRoutes, int NumberOfPerformers){
        super("Deusi Bhailo Program", estimatedCost);
        this.plannedRoutes = plannedRoutes;
        this.NumberOfPerformers = NumberOfPerformers;
    }

    @Override
    public void planActivity() throws FestivalPlanningException, NoRouteException{
        if(plannedRoutes.isEmpty()){
            throw new NoRouteException("No routes planned for Deusi Bhailo! Are we just singing in the living room?");
        }
        if(NumberOfPerformers < 3){
            throw new FestivalPlanningException("Need atleast 3 performers for a proper Deusi Bhailo!");
        } 
        System.out.println(" "); 
        System.out.println("Deusi Bhailo program with " + NumberOfPerformers + " performers planned for " + plannedRoutes.size() + " routes!");
    }

    public static void main(String[] args) {
        DeusiBhailo db1 = new DeusiBhailo(15000, Arrays.asList("Mananda Chowk", "Buspark Area", "Mukti Chowk", "Pathivara Tol"), 10);
        DeusiBhailo db2 = new DeusiBhailo(10000, Arrays.asList(), 10);
        DeusiBhailo db3 = new DeusiBhailo(15000, Arrays.asList("Mananda Chowk", "Buspark Area", "Mukti Chowk", "Pathivara Tol"), 2);

        DeusiBhailo[] dbs = {db1, db2, db3};

        for(DeusiBhailo db: dbs){
            try{
                db.planActivity();
            }
            catch (NoRouteException e){
                System.out.println("Route Error: " + e.getMessage());
            }
            catch (FestivalPlanningException e){
                System.out.println("Numbers Error: " + e.getMessage());
                System.out.println(" ");
            }
        }
    }
}

class NoRouteException extends FestivalPlanningException{
    public NoRouteException(String error){
        super(error);
    }
}



