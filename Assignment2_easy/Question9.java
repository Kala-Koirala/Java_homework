import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if(n == 0){
            System.out.println("The number is zero!");
        }
        else if(n > 0){
            System.out.println("The number is positive!");
        }
        else if(n < 0){
            System.out.println("The number is negative!");
        }
    }
}
