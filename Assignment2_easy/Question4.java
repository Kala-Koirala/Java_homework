public class Question4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.displayInfo();
    }

}
class Student{
    String name = "Kala";
    int age = 20;

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

