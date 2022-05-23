package tasks_from_festina.group15tasks_2022may16;

import java.util.ArrayList;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("a1sdf3asdf3"));
    }
    public static int sumOfDigits (String str){
        String forDigits = "";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                forDigits += str.charAt(i)+"";
            }
        }

    String [] forDigitsString = forDigits.split("");
    int [] forDigitsInt = new int[forDigitsString.length];
    for (int i = 0; i < forDigitsString.length; i++) {
        forDigitsInt[i] = Integer.parseInt(forDigitsString[i]);
    }

    for (int i = 0; i < forDigitsInt.length; i++) {
            sum+=forDigitsInt[i];
        }

        return sum;
    }
}

/*
8) String - sum of digits in a string
Write a method that can return the sum of the digits in a string

 */