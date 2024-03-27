package practice2023.atm_inheritance;

public class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }

    public void checkBalance(){
        System.out.println("Your balance is: " + balance);
    }

    public void withdraw (double amount){
        if (amount<=0){
            System.out.println("invalid amount");
        }
        if (amount>balance){
            System.out.println("Insufficient funds.");
        }
        balance-=amount;
        System.out.println("Withdrawal successful. Your new balance is: $" + balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Invalid amount.");
        }
        balance+=amount;
        System.out.println("Deposit successful. Your new balance is: $" + balance);
    }
}
