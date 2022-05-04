package day20_string;

import java.util.Locale;

public class ReplitWithoutX {
    public static void main(String[] args) {

        String word = "Manxe";

        String firstX = word.toLowerCase().substring(0, 1);
        String lastX = word.toLowerCase().substring(word.length() - 1);

        if (firstX.equals("x") && lastX.equals("x")) {
            System.out.println(word.substring(1, word.length() - 1));
        } else if (firstX.equals("x")) {
            System.out.println(word.substring(1));
        } else if (lastX.equals("x")) {
            System.out.println(word.substring(0, word.length() - 1));
        } else {
            System.out.println(word);
        }

        String firstHalf = word.substring(0, word.length() / 2);
        System.out.println(firstHalf + firstHalf);

        System.out.println(word.substring(1));
        System.out.println(word.substring(0, word.length() - 1));

        System.out.println("Index of a: " + word.indexOf("a"));
        System.out.println(word.substring(0, 1) + word.substring(word.length() - 1));

        System.out.println("word: " + word);
        System.out.println("uppercase: " + word.toUpperCase());
        System.out.println("lowercase: " + word.toLowerCase());

        System.out.println(word.replace("dumb","cool"));

        boolean startsWithA = word.startsWith("a");
        boolean endsWithE = word.endsWith("e");
        System.out.println("Starts with a: "+startsWithA);
        System.out.println("Ends with e: "+endsWithE);

        String word1 = "asdfas";
        String word2 = "asfdasdf";
        boolean areEqual = word1.equals(word2);
        System.out.println(areEqual);

        System.out.println("Length is: " + word.length());

    }
}
