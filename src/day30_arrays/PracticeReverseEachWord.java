package day30_arrays;

import java.util.Arrays;

public class PracticeReverseEachWord {
    public static void main(String[] args) {
        String str = "It started to snow in Chicago";
        String[] strArr = str.split(" ");
        //System.out.println(Arrays.toString(strArr));
        String reverse = "";

        for (int i = 0; i < strArr.length; i++) {
            reverse+=" ";
            for (int j = strArr[i].length()-1; j >= 0 ; j--) {
                reverse += strArr[i].charAt(j);
            }
        }
        System.out.println(reverse.trim());
    }
}
/*
Reverse Each word
Given a String, reverse each individual word and print the result
Hint: Use a nested loop, split
Input:
It started to snow in Chicago
Output:
tI detrats ot wons ni ogacihC
 */