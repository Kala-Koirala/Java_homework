import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashainPlanner {
    public static void executeFestivalPlan(List<FestivalActivity> activities){
        for(FestivalActivity activity: activities){
            System.out.println(" ");
            System.out.println("Festival Overview!");
            activity.displayOverview();
            try{
                activity.planActivity();
            }
            catch(InvalidGuestException e){
                System.out.println("Planning Warning (Guests): " + e.getMessage());
            }
            catch(BudgetExceededException e){
                System.out.println("Planning Warning (Budget): " + e.getMessage());
            }
            catch(NoRouteException e){
                System.out.println("Planning Warning (Routes): " + e.getMessage());
            }
            catch(FestivalPlanningException e){
                System.out.println("General Planning Error: " + e.getMessage());
            }
            finally{
                System.out.println( "Activity planning attempt for " + activity.activityName + " completed.");
            }
        }    
    }

    public static void main(String[] args) {
        List<FestivalActivity> activities = new ArrayList<>();

        activities.add(new TikaCeremony("Tika", 45000, 20, "Grandfather"));

        activities.add(new DeusiBhailo(10000, Arrays.asList(), 10));

        activities.add(new DeusiBhailo(15000, Arrays.asList("Mananda Chowk", "Buspark Area", "Mukti Chowk", "Pathivara Tol"), 2));

        activities.add(new DeusiBhailo(10000, Arrays.asList(), 10));

        activities.add(new DeusiBhailo(2000, Arrays.asList("Mananda Chowk", "Buspark Area", "Mukti Chowk"), 10));

        activities.add(new DeusiBhailo(15000, Arrays.asList("Mananda Chowk", "Buspark Area", "Mukti Chowk", "Pathivara Tol"), 10));

        executeFestivalPlan(activities);
    }
}
