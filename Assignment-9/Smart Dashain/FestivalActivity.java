public abstract class FestivalActivity {
    public String activityName;
    public double estimatedCost;

    public FestivalActivity(String aName, double eCost){
        this.activityName = aName;
        this.estimatedCost = eCost;
    }


    public abstract void planActivity() throws FestivalPlanningException;

    public void displayOverview(){
        System.out.println("Activity Name: " + activityName);
        System.out.println("Estimated cost: " + estimatedCost);
    }
}

class FestivalPlanningException extends Exception {
    public FestivalPlanningException(String message){
        super(message);
    }
    
}
