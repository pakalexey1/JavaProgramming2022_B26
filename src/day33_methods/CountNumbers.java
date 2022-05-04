package day33_methods;

import java.util.Scanner;

public class CountNumbers {
    public static void stopNum(int endNumber) {
        for (int i = 1; i <= endNumber; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the end number");
        stopNum(input.nextInt());
    }
}


/*
count up to a certain number
start from 0
all the numbers until the number input
method(5) --> 0 1 2 3 4 5
 */