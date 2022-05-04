package day34_methods;

import java.util.Scanner;

public class NumberWords {

    public static void main(String[] args) {
        System.out.println(numberAswWord(10));
        System.out.println(numberAswWord(8));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAswWord(input.nextInt()));

        /*
        Why can't I do this:
        int num = numberAsWord(input.nextInt());

        The numberAsWord returns String, so we must store into a String variable
        String num = numberAsWord(input.nextInt());
         */
    }

    public static String numberAswWord(int num) {
        if (num < 1 || num > 10) {
            return num + " is an invalid Number";
        } else {
            String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
            return words[num - 1]; // -1 will convert the number to an index, because the first element's position is zero
        }
    }
}
