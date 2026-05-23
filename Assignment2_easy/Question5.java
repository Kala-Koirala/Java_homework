import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        int age;
        boolean isCitizen;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        age = scanner.nextInt();

        System.out.print("Citizen or not? (true/false) " );
        isCitizen = scanner.nextBoolean();

        if(age >= 18 && isCitizen){
            System.out.println("You are eligible to vote!");
        }
        else{
            System.out.println("You are not eligible to vote!");
        }
    }
}
