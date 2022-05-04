package day23_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 80;
        int guess;

        do {
            System.out.println("Guess a number from 1-100");
            guess=input.nextInt();
            if (guess>secretNumber) {
                System.out.println(guess + " is too high");
            }
            if (guess < secretNumber) {
                System.out.println(guess + " is too low");
            }
        } while (secretNumber!=guess);System.out.println("Correct! "+guess+" is the right number!");
    }
}
