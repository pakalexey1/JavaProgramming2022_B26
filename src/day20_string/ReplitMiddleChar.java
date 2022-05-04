package day20_string;

public class ReplitMiddleChar {
    public static void main(String[] args) {

        String word = "abcdef";

        if (word.length() % 2 == 0) {
            String middleChar = word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
            System.out.println(middleChar);
        } else {
            String middleChar2 = word.substring(word.length() / 2, word.length()/2+1);
            System.out.println(middleChar2);
        }

    }
}
