package practice_custom_methods;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException() {
        super("Insufficient funds on the account");
    }

    public InsufficientFundsException(String msg){
        super(msg);
    }

}
