public class GradeCalculator {
    public static void main(String[] args) {
        Subject[] subject = {
                new Subject("OOP", 60),
                new Subject("Business", 70),
                new Subject("DSA", 80),
                new Subject("Digital Logic", 75),
                new Subject("Math", 90)
        };
        for(Subject sub: subject){
            sub.displayDetails();
        }
    }
}

class Subject{
    String subjects;
    int marks;

    public Subject(String subjects, int marks){
        this.subjects = subjects;
        this.marks = marks;
    }

    public String calculateGrade(){
        if (marks >= 90) {
            return "A";
        }
        else if(marks < 90 && marks >= 80) {
            return "B";
        }
        else if(marks < 80 && marks >= 70){
            return "C";
        }
        else{
            return "D";
        }
    }

    public void displayDetails(){
        System.out.println("Subject: " + subjects);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("");
    }
}
