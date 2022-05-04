package day23_loops;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        String isPali ="";


        for (int i = word.length()-1; i>=0; i--) {
            isPali+=word.charAt(i);
        }
        System.out.println(isPali);
        if (word.equalsIgnoreCase(isPali)){
            System.out.println("It's a palindrome!");
        }else {
            System.out.println("It's not a palindrome.");
        }

    }
}
