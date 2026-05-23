public class Question3 {
    public static void main(String[] args) {
        Student std1 = new Student("Kala", 85);
        Student std2 = new Student("Shreya", 85);
        Student std3 = new Student("Shahisha", 90);

        System.out.println("Name: " + std1.name);
        std1.calculateGrade();

        System.out.println("Name: " + std2.name);
        std2.calculateGrade();

        System.out.println("Name: " + std3.name);
        std3.calculateGrade();
    }
}

class Student{
    String name;
    int marks;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public void calculateGrade(){
        if (marks < 0 || marks > 100){
            System.out.println("Invalid Marks!");
        }
        switch (marks / 10){
            case 10, 9 -> System.out.println("Grade: A");
            case 8 -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            default -> System.out.println("Grade: F");
        }
    }
}
