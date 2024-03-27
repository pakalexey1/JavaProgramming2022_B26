package practice2023.atm_inheritance;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double initialBalance){
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount){
        if (amount<=0){
            System.out.println("Invalid amount");
        }
        if (balance-amount<100){
            System.out.println("Withdrawal not allowed. Minimum balance must be greater than $100");
        }
        balance-=amount;
        System.out.println("Withdrawal successful. Your new balance is: $"+balance);
    }
}
