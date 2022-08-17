package practice_array_arraylist;

import java.util.Arrays;

public class sortCharsAndDigits {

    //TODO finish this one using Hanna's logic

    public static String sortCharsAndDigits(String str) {
        String chars = "";
        String digits = "";
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);
                String[] digitsArr = digits.split("");
                Arrays.sort(digitsArr);
                chars = "";
            }else {
                chars+=str.charAt(i);
                String[]charsArr = chars.split("");
                Arrays.sort(charsArr);
                digits="";
            }
        }

        return null;
    }
}
