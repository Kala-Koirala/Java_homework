public class GradeBook {
    public static void main(String[] args) {
        double[] gs_marks = {44.44, 55.55, 66.66, 77.77, 88.88};
        double[] ug_marks = {90.00, 95.00, 93.50, 82.00, 64.00};
        GraduateStudents gs = new GraduateStudents("Sneha", 100, gs_marks, "Evolution of AI");
        UnderGraduates ug = new UnderGraduates("Kala", 12, ug_marks);

        System.out.println("Graduate Student");
        System.out.println("Name: " + gs.getName());
        System.out.println("Roll Number: " + gs.getRollNumber());
        System.out.println("Average: " + gs.calculateAverage());
        System.out.println("Thesis Topic: " + gs.getThesisTitle());
        System.out.println(" ");

        System.out.println("Undergraduate Student");
        System.out.println("Name: " + ug.getName());
        System.out.println("Roll Number: " + ug.getRollNumber());
        System.out.println("Average: " + ug.calculateAverage());
    }
}


abstract class Student{
    private String name;
    private int rollNumber;
    private double[] marks;

    public Student(String name, int roll, double[] marks){
        this.name = name;
        this.rollNumber = roll;
        this.marks = marks;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getRollNumber(){
        return rollNumber;
    }
    public void setRollNumber(int roll){
        this.rollNumber = roll;
    }

    public double[] getMarks(){
        return this.marks;
    }
    public void setMarks(double[] marks){
        this.marks = marks;
    }

    public double calculateAverage(){
        if (marks.length == 0){
            return 0;
        }
        else{
            double total = 0;
            for (double mark: marks){
                total += mark;
            }
            return total/ marks.length;
        }
    }
}

class GraduateStudents extends Student{
    private String thesisTitle;

    public GraduateStudents(String name, int roll, double[] marks, String ts){
        super(name, roll, marks);
        this.thesisTitle = ts;
    }

    public String getThesisTitle(){
        return thesisTitle;
    }
    public void setThesisTitle(String ts) {
        this.thesisTitle = ts;
    }

    public void printThesisTopic(){
        System.out.println("Thesis topic: " + thesisTitle);
    }
}

class UnderGraduates extends Student{
    public UnderGraduates(String name, int roll, double[] marks){
        super(name, roll, marks);
    }
}


