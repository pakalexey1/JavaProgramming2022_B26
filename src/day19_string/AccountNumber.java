package day19_string;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the account number");
        String accountNu = input.nextLine();
        String invalidMes = "Invalid Account Number";

        if (!accountNu.isEmpty()) {
            if (accountNu.startsWith("2")) {
                if (accountNu.length() == 7) {
                    System.out.println("Valid 7-digit account number");
                } else {
                    System.out.println(invalidMes);
                }
            } else if (accountNu.startsWith("5")) {
                if (accountNu.length() == 10) {
                    System.out.println("Valid 10-digit account number");
                } else {
                    System.out.println(invalidMes);
                }
            } else {
                System.out.println(invalidMes);
            }
        } else {
            System.out.println("Empty input is given");
        }


    }
}
