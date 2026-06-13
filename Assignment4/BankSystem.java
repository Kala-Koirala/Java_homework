public class BankSystem {
    public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount("1050806944", 1500000, 10);

        System.out.println("Account Details...");
        System.out.println("Account Number: " + sa.getAccountNumber());
        System.out.println("Current Balance: " + sa.getBalance());
        System.out.println("Balance after Deposition: " + sa.deposit(15000));
        System.out.println("Balance after withdraw: " + sa.withdraw(5000));
        System.out.println("Balance after adding interest: " + sa.addInterest());

    }
}

abstract class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount){
        return balance += amount;
    }

    public double withdraw(double amount){
        return balance -= amount;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(double balance){
        this.balance = balance;
    }
}



class SavingsAccount extends BankAccount{
    private int interestRate_per_year;

    public SavingsAccount(String accountNumber, double balance, int interestRate){
        super(accountNumber, balance);
        this.interestRate_per_year = interestRate;
    }

    @Override
    public double withdraw(double amount){
        double total = getBalance() - amount;
        if (total < 1000){
            return getBalance();
        }
        else{
            return total;
        }
    }

    public double addInterest(){
        return getBalance() + ((getBalance()*1*interestRate_per_year)/100);
    }
}
