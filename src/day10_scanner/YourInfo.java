package day10_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What's your age");
        byte age = in.nextByte();

        System.out.println("WHat's your favorite number?");
        long favNum=in.nextLong();

        System.out.println("You are age is: " + age);
        System.out.println("Your favorite number is: " + favNum);


    }
}
