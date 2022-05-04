package day11_if_statements;

import java.util.Scanner;

public class ScannerTask1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " is a bigger number");
        }else{
            System.out.println(num2 + " is a bigger number");
        }

    }
}
