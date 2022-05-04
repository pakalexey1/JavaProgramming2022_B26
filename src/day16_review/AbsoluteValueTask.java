package day16_review;

import java.util.Scanner;

public class AbsoluteValueTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num>=0) {
            System.out.println(num);
        }else{
            System.out.println(num*(-1));
        }

    }
}
