package day16_review;

import java.util.Scanner;

public class Coility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
            System.out.println("CodilityTestCoders");
        } else if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("CodilityTest");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("TestCoders");
        } else if (num % 2 == 0 && num % 5 == 0) {
            System.out.println("CodilityCoders");
        } else if (num % 2 == 0) {
            System.out.println("Codility");
        } else if (num % 3 == 0) {
            System.out.println("Test");
        } else if (num % 5 == 0) {
            System.out.println("Coders");
        } else {
            System.out.println("The number is not divisible by 2, 3 or 5");
        }

    }
}
