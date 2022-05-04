package day18_string;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name and then the password");
        String username = input.next();
        String password = input.next();

        int passLen = password.length();

        if (passLen>=5) {
            if (password.contains(username)){
                password="password";
                System.out.println("Invalid password, username should not be in it, your passowrd is now " + password);

            } else {
                password = "**********";
                System.out.println("Login successful your user name is " + username + "\n and your password is +" + password);
            }
        } else {
            System.out.println("Password cannot be less than 5 characters");
        }


    }
}


/*
create a class UserAndPass
ask the user to enter a username and password. Check if they are valid
based on the following requirements:
- The password cannot be less than 5 characters
If it is less print: "Password cannot be less than 5 characters"
If it is more than or equal to 5 print: "Valid password"
- Also, the password should not contain the username
If the password has the username in it print: "Invalid password,
username should not be in it" and in that case change the password to have
the value: "password"
Print the information in the end
 */