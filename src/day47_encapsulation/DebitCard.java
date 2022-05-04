package day47_encapsulation;

import java.awt.event.WindowFocusListener;

public class DebitCard {
    String holderName;
    long cardNumber;
    double balance;
    String cardType;
    int pin;

    // satic variavbles
    static String accountType;

    static {
        System.out.println("Running Static block");
        accountType = "Checking";
    }

    public DebitCard(long cardNumber, String holderName,double balance){
        this.holderName = holderName;
        this.balance = balance;

        if (String.valueOf(cardNumber).length() == 16){
            this.cardNumber = cardNumber;
        }else{
            System.err.println("Invalid card number");
        }
    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber,holderName,balance);

        if (cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")){
            this.cardType = cardType;
        }else{
            System.err.println("Invalid Card Type - Must be Visa or Mastercard");
        }

        if (String.valueOf(pin).length()==4){
            this.pin = pin;
        } else {
            System.err.println("Invalid Pin - Must be 4 digits");
        }

    }

    public String toString() {
        String info = "Hodler Name: " + holderName;
        if (cardNumber != 0){
            info += "\nCard Number: " + cardNumber;
        }
        if (cardType!= null){
            info+= "\nCard Type: " + cardType;
        }

        info += "\nBalance: " + balance;

        return info;

    }



}
