package day10_scanner;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer");

        int num = input.nextInt();

        boolean isDivBy2 = num % 2 == 0;
        boolean isDivBy3 = num % 3 == 0;
        boolean isDivBy5 = num % 5 == 0;

        System.out.println("Your number "+num+" is divisible by 2: "+ isDivBy2);
        System.out.println("Your number "+num+" is divisible by 3: "+ isDivBy3);
        System.out.println("Your number "+num+" is divisible by 5: "+ isDivBy5);


    }
}
