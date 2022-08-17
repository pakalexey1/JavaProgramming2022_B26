package practice_array_arraylist;

import java.util.Arrays;

public class AnagramArray {
    public static void main(String[] args) {
        String g = "abca";
        String h = "caab";

        System.out.println(anagramArray(g, h));
    }

    public static boolean anagramArray(String a, String b) {

        if (a.length() == b.length()) {
            String[] arr = a.split("");
            String[] arr2 = b.split("");

            Arrays.sort(arr);
            Arrays.sort(arr2);
            return Arrays.equals(arr, arr2);
        } else {
            return false;
        }
    }
}

/*
use Array sort
Write a return method that check if a string is build out of the same letters as another string.
   String g="abc";
   String h="cab";
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:
 */
