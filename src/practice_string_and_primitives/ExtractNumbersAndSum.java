package practice_string_and_primitives;

import java.util.ArrayList;

public class ExtractNumbersAndSum {

    public static int sumOfExtractedNumbers(String str) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                res += str.charAt(i);
            }
        }
        return 10;
    }
}

/*
//46
 String a="aaa10ss20bb30";
 output: 60
 */