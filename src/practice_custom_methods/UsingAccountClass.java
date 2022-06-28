package practice_custom_methods;

public class UsingAccountClass {
    public static void main(String[] args) {

        Account myAccount = new Account();
        myAccount.balance = 100_000;
        myAccount.withdraw(99999);

    }
}
