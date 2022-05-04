package day21_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to ATM");
        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do {
            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        } while (attempts <3 && validPin!=userPin);

        if (validPin==userPin){
            System.out.println("logged in");
        } else {
            System.out.println("Locked out");
        }

    }
}
