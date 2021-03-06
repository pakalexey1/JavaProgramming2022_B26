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

/*

Debit card - custom classes + static

Create a class for Debit Card that has the following instance variables:
    card number (long), holder name (String), card type (String), pin (int), and balance (double)

    static variables: account type (debit)
        -> Use static block to initialize account type

Create a constructor that will create a debit card object and initialize the card number, the card holder name and
the balance
The card number has to be 16 digits long to be a valid card number. If the length is too short or too long do not
store teh card number and print "Invalid card number"

Overload the constructor to take all of the isntance variabels. The card type must be either MasterCard or Visa to be
valid type. If it's not one of those two, then do not store the type and print "Invalid card type". Also the pin
must be only 4 characters long. If the pin is more than or less than 4 characters then do not store the pin into the
instance variable and print "Invalid pin length"

Add the toString method that will print all the card's information (Except the pin). If the card type does not have a
 value do not print that line.


 */
