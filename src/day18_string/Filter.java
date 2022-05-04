package day18_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a message");
        String message = input.nextLine();

        message = message.trim();
        boolean hasBadWords = message.contains("crying") || message.contains("java is bad") || message.contains("quit") || message.contains("have fun");

        if (hasBadWords){
            System.out.println("Message failed to send");
        }
    }
}
