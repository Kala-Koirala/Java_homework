public class UniversitySystem {
    public static void main(String[] args) {
        Students std = new Students("Ritika", 1001, "BBA");
        Teacher teacher = new Teacher("Urmila", 2001, "Principles of Management");
        Admin admin = new Admin("Shreya", 3001, "Management");

        std.getRoleDetails();
        teacher.getRoleDetails();
        admin.getRoleDetails();
    }
}

abstract class Person{
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void getRoleDetails(){
        System.out.println("Role Details");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}

class Students extends Person{
    private String program;

    public Students(String name, int id, String program){
        super(name, id);
        this.program = program;
    }

    @Override
    public void getRoleDetails(){
        System.out.println("Role: Student");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Program: " + program);
        System.out.println(" ");
    }
}

class Teacher extends Person{
    private String subject;

    public Teacher(String name, int id, String subject){
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void getRoleDetails(){
        System.out.println("Role: Student");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Subject: " + subject);
        System.out.println(" ");
    }
}

class Admin extends Person{
    private String department;

    public Admin(String name, int id, String department){
        super(name, id);
        this.department = department;
    }

    @Override
    public void getRoleDetails(){
        System.out.println("Role: Admin");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Department: " + department);
        System.out.println(" ");
    }
}

