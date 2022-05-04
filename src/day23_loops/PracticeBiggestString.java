package day23_loops;

import java.sql.SQLOutput;

public class PracticeBiggestString {
    public static void main(String[] args) {

        String word = "aaabbbccccceeeeee";
        String sub = "";
        String biggest = "";

        for (int i = 0; i < word.length() - 1; i++) {
            sub += word.charAt(i);
            if (word.charAt(i) != word.charAt(i + 1)) { // when the character of i is different from the character next to it (i+1)

                if (sub.length() > biggest.length()) {
                    biggest = sub; // assings the substring as the new biggest

                }
                sub = ""; //resets this string for the next substring
            } else if (i == word.length() - 2) {
                sub += word.charAt(i);
                if (sub.length() > biggest.length())
                    biggest = sub;
            }
        }
        System.out.println(biggest);
    }
}

