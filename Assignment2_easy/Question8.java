import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int n1;
        int n2;
        String operator;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next();

        if(operator.equals("+")){
            System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        }
        else if (operator.equals("-")) {
            System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        }
        else if (operator.equals("*")) {
            System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
        }
        else if (operator.equals("/")) {
            if(n2!=0){
                System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
            }
            else{
                System.out.println("Number can't be divisible by 0!");
            }
        }
        else{
            System.out.println("Invalid input!");
        }

    }
}
