public class EmployeeSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Kamala", "001", 150000.99, 1000);
        Developer dev = new Developer("Kala", "002",50000, 2, 3000);

        System.out.println("Manager name: " + manager.getName());
        System.out.println("ID: " + manager.getId());
        System.out.println("Total Salary: " + manager.calculateSalary());
        System.out.println(" ");

        System.out.println("Developer's name: " + dev.getName());
        System.out.println("ID: " + dev.getId());
        System.out.println("Total Salary: " + dev.calculateSalary());
    }
}

abstract class Employee{
    private String name;
    private String id;
    private double baseSalary;

    public Employee(String name, String id, double bs){
        this.name = name;
        this.id = id;
        this.baseSalary = bs;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double bs){
        this.baseSalary = bs;
    }
    public double calculateSalary(){
        return baseSalary;
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, String id, double bs, double bonus){
        super(name, id, bs);
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }
}

class Developer extends Employee{
    private int overtimeHours;
    private double rate;

    public Developer(String name, String id, double bs, int oh, double rate){
        super(name, id, bs);
        this.overtimeHours = oh;
        this.rate = rate;
    }

    public int getOvertimeHours(){
        return overtimeHours;
    }
    public void setOvertimeHours(int oh){
        this.overtimeHours = oh;
    }

    public double getRate(){
        return rate;
    }
    public void setRate(double rate){
        this.rate = rate;
    }

    @Override
    public double calculateSalary(){
        return getBaseSalary() + overtimeHours * rate;
    }
}
