package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {

        String year = "2022";

        //normal concatenation
        System.out.println("This year " + year);
        System.out.println("Next year will be " + (year + 1));

        //parsing example
        int numYear = Integer.parseInt(year);
        System.out.println("This year " + numYear);
        System.out.println("Next year will be " + (numYear + 1));


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        String str = input.nextLine();// format is always: I am x years old
        // in 5 years you will be $ageIn5Years

        String agePart = str.split(" ")[2]; // str.split(" ") --> {"I", "am", "10", "years", "old"} --> arr[2] -->10
        //alternatively:
        // String [] arr = str.split(" ");
        // String agePart = arr[2];


        String age = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                age+=str.charAt(i);
            }
        }
        int ageNum = Integer.parseInt(age);
        System.out.println("In 5 years you will be " + (ageNum+5) + " years old");




    }
}
