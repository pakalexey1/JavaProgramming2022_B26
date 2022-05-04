package day11_if_statements;

import java.util.Scanner;

public class ScannerTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the current hour");
        int hour = input.nextInt();


        if (hour>=6 && hour <=11){
            System.out.println("Good Morning");
        }
        if (hour >= 12 && hour <= 16) {
            System.out.println("Good afternoon");
        }
        if (hour >=17 && hour <=23) {
            System.out.println("Good night");
        }
    }
}
