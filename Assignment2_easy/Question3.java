import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        if (n / 2 == 0){
            System.out.println(n + " is an even number!");
        }
        else{
            System.out.println(n + " is an odd number!");
        }

        scanner.close();
    }
}
