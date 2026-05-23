import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Account Number: ");
        int number = scanner.nextInt();

        System.out.print("Current Balance: ");
        double balance = scanner.nextDouble();

        BankAccount acc = new BankAccount(name, number, balance);
        boolean running = true;
        while (running){
            System.out.println(" Menu ");
            System.out.println("1. deposit     2. withdraw     3. exit");
            System.out.print("Enter you choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println(acc.deposit());
                    break;

                case 2:
                    System.out.println(acc.withdraw());
                    break;

                case 3:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        }
    }

}

class BankAccount{
    String accountHolderName;
    int accountNumber;
    double balance;
    Scanner scanner = new Scanner(System.in);

    public BankAccount(String name, int num, double balance){
        this.accountHolderName  = name;
        this.accountNumber = num;
        this.balance = balance;
    }

    public double deposit(){
        System.out.print("Enter the amount to be deposited: ");
        double depositedAmt = scanner.nextDouble();
        balance += depositedAmt;
        return balance;
    }

    public double withdraw(){
        System.out.print("Enter the amount to be withdrawn: ");
        double  withdrawnAmt = scanner.nextDouble();
        if(withdrawnAmt > balance){
            System.out.println("Withdraw amount greater than balance!");
        }
        else{
            balance -= withdrawnAmt;
        }
        return  balance;
    }
}
