import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if(n1 >  n2){
            System.out.println(n1 + " is greater than " + n2);
        }
        else{
            System.out.println(n2 + " is greater than " + n1);
        }
    }
}
