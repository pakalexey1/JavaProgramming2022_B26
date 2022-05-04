package day09_scanner;

import java.util.Scanner;

public class WorkStatusScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String fname = input.next();

        System.out.println("Enter your last name");
        String lname = input.next();

        System.out.println("Are you employed. True or False");
        boolean isEmployed = input.nextBoolean();

        System.out.println("Are you a student?");
        boolean isStudent = input.nextBoolean();

        System.out.println(fname + " " + lname + ", it is " + isEmployed + " you are employed and it is " + isStudent + " that you are a student.");

    }
}
