public class TikaCeremony extends FestivalActivity{
    int expectedGuests;
    String mainFamilyElder;

    public TikaCeremony(String activityName, double estimatedCost, int expectedGuests, String mainFamilyELder){
        super(activityName, estimatedCost);
        this.expectedGuests = expectedGuests;
        this.mainFamilyElder = mainFamilyELder;
    }

    @Override
    public void planActivity() throws FestivalPlanningException, InvalidGuestException, BudgetExceededException{
        if(expectedGuests < 5){
            throw new InvalidGuestException("Not enough guests for a lively Tika! Is everyone on vacation?");
        }
        if(estimatedCost > 50000){
            throw new BudgetExceededException("Tika budget too high! Is this for the whole village?");
        }
    }

    @Override
    public void displayOverview(){
        System.out.println("\n");
        System.out.println("Tika Ceremony with " + mainFamilyElder + " planned successfully for " + expectedGuests + " guestes!");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        TikaCeremony tc1 = new TikaCeremony("Tika", 45000, 20, "Grandfather");
        TikaCeremony tc2 = new TikaCeremony("Tika", 75000, 20, "Grandfather");
        TikaCeremony tc3 = new TikaCeremony("Tika", 15000, 2, "Grandfather");

        TikaCeremony[] tcs = {tc1, tc2, tc3};

        for (TikaCeremony tc: tcs){
            try{
                tc.planActivity();
                tc.displayOverview();
            }
            catch(BudgetExceededException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("\n");
            }
            catch(InvalidGuestException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("\n");
            }
            catch (FestivalPlanningException e){
                System.out.println("Error: " + e.getMessage());
                System.out.println("\n");
            }
        }
    }
}

class InvalidGuestException extends FestivalPlanningException{
    public InvalidGuestException(String error){
        super(error);
    }
}

class BudgetExceededException extends FestivalPlanningException{
    public BudgetExceededException(String error){
        super(error);
    }
}