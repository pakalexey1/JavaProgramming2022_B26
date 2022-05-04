package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of the item");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quant = input.nextInt();

        double revenue = price * quant;
        System.out.println("The revenue is: "+revenue);

    }
}
