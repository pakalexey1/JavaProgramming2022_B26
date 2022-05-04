package day20_string;

import java.util.Locale;
import java.util.Scanner;

public class FirstName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        firstName = firstName.trim().toLowerCase();
        lastName = lastName.trim().toLowerCase();

        String fixedFirst = firstName.substring(0,1).toUpperCase();
        fixedFirst += firstName.substring(1);

        String fiexedLast= lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println(fixedFirst + " " + fiexedLast);


    }
}
