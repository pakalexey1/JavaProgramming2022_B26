package day09_scanner;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number one");

        int num1 = input.nextInt();

        System.out.println("Enter number two");

        int num2 = input.nextInt();

        System.out.println("Number one equals to number two: "+(num1==num2));

    }
}
