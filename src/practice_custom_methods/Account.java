package practice_custom_methods;

public class Account {

    int balance;

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw > balance) {
            throw new InsufficientFundsException("Balance has only $" + balance);
        }

        balance -= amountToWithdraw;
        System.out.println("Withdrawal successful, your new balance is $" + balance);
    }

    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
        System.out.println("You have too much money deposited");
    }

}
