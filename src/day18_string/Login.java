package day18_string;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the username");
        String userName = input.nextLine();


        if (userName.equals(userName.toLowerCase())) {
            System.out.println("Enter the password");
            String password = input.nextLine();

            if (password.length() >= 8) {

                if (password.equals("jamesbond")) {
                    System.out.println("Logged in");
                } else {
                    System.out.println("Invalid password");
                }

            } else {
                System.out.println("Password can't be shorter than 8 sybmols");
            }
        } else {
            System.out.println("Username can't contain upper case letters");
        }
    }
}
