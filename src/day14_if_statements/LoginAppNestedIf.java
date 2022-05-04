package day14_if_statements;

import java.util.Scanner;

public class LoginAppNestedIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your pin");
        int pin = input.nextInt();
        System.out.println("Enter your ssn");
        int ssn = input.nextInt();

        int expectedPin=1552;
        int expectedSSN=1234;

        if (pin==expectedPin && ssn==expectedSSN) {
            System.out.println("Authentication successful");
        }else if (pin!=expectedPin || ssn!=expectedSSN) {
            if (pin!=expectedPin && ssn!=expectedSSN) {
                System.out.println("Authentication failed");
            } else if (ssn!=expectedSSN) {
                System.out.println("Incorrect SSN");
            } else {
                System.out.println("Incorrect pin");
            }
        }

    }
}
/*
    inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    when the ssn is not correct print:
        invalid ssn
     */