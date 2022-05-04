package day19_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InitialsCharAt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String fName = input.nextLine().toUpperCase();

        System.out.println("Enter your last name");
        String lName = input.nextLine().toUpperCase();

        char fInitial = fName.charAt(0);
        char lInitial = lName.charAt(0);

        System.out.println(""+fInitial+lInitial);
    }
}
