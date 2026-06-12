public class HospitalRecords {
    public static void main(String[] args) {
        InPatient ip = new InPatient("Sneha", 20, "1001");
        OutPatient op = new OutPatient("Anjila", 19, "15 June 2026");

        ip.getTreatmentPlan();
        op.getTreatmentPlan();
    }
}

abstract class Patient{
    private String name;
    private int age;

    public Patient(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void getTreatmentPlan();
}

class InPatient extends Patient{
    private String roomNumber;

    public InPatient(String name, int age, String roomNumber){
        super(name, age);
        this.roomNumber = roomNumber;
    }

    @Override
    public void getTreatmentPlan(){
        System.out.println("InPatient...");
        System.out.println("Timely nursing required");
        System.out.println(" ");
    }
}

class OutPatient extends Patient{
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate){
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void getTreatmentPlan(){
        System.out.println("OutPatient...");
        System.out.println("Rest at home and consult a week later");
    }
}
