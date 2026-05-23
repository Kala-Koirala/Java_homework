public class StudentAverage {
    public static void main(String[] args) {
        int[] mark = {85, 95, 65};
        Student std = new Student("Kala", mark);

        System.out.println("Name: " + std.name);
        for(int m: mark){
            System.out.println("Marks: " + m + " ");
        }
        System.out.printf("Average: %.2f\n", std.calculateAverage());
        System.out.println("Result: " + std.status());
    }
}

class Student{
    String name;
    int[] marks =  new int[3];

    public Student(String name, int[] marks){
        this.name = name;
        if(marks.length == 3){
            this.marks = marks;
        }
        else{
            System.out.println("Exactly three marks required!");
        }
    }

    public double calculateAverage(){
        double sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        return sum/ marks.length;
    }

    public String status(){
        double average = calculateAverage();
        if(average >= 40){
            return "Pass!";
        }
        else{
            return "Fail";
        }
    }
}
