package day12_if_statements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 12");

        int month = input.nextInt();

        boolean has31days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28days = month == 2;

        if (has28days) {
            System.out.println("The month has 28 days");
        }
        if (has30days) {
            System.out.println("The month has 30 days");
        }
        if (has31days) {
            System.out.println("The month has 31 days");
        }

    }
}
