package practice_string_and_primitives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isIntPalindrome {
    public static void main(String[] args) {
        System.out.println(isIntPalindromeAgain(1211));
    }

    public static boolean isIntPalindrome(int num) {

        int revNum = 0;
        int temp = num;

        while (temp > 0) {
            revNum = revNum * 10 + temp % 10;
            temp = temp / 10;
        }
        return num == revNum;
    }

    public static boolean isAnotherIntPalindrome(int num) {
        int revNum = 0;
        int temp = num;

        while (temp > 0) {
            revNum = revNum * 10 + temp % 10;
            temp = temp / 10;
        }

        return revNum == num;
    }

    public static boolean isIntPalindromeAgain(int num) {

        int revNum = 0;
        int temp = num;

        while(temp>0){
            revNum = revNum*10 + temp%10;
            temp/=10;
        }

        return num==revNum;
    }
}

/*

12321 is a palindrome
123321 is a palindrome
12345 is not a palindrome

 */