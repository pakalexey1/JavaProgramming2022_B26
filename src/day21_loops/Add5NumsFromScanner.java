package day21_loops;

import java.util.Scanner;

public class Add5NumsFromScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 1;
        int result = 0;
        while (num <= 5) {
            System.out.println("Enter a number");
            int entered = input.nextInt();
            result+=entered;
            num++;
        }
        System.out.println("The sum of all of your numbers: " + result);
    }
}
