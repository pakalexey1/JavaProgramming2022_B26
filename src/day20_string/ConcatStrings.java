package day20_string;

import java.util.Scanner;

public class ConcatStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter at least 6 characters");
        String str1 = input.nextLine().toLowerCase();
        System.out.println("Please enter other 6 characters or more");
        String str2 = input.nextLine().toLowerCase();

        if (str1.length() >= 6 && str2.length() >= 6){
            System.out.println(str1.substring(0,4)+str2.substring(str2.length()-3)+"@cybertek.com");
        }
    }
}
