package day18_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three words that contain letter \"a\"");
        String word1 = input.nextLine().toLowerCase();
        String word2 = input.nextLine().toLowerCase();
        String word3 = input.nextLine().toLowerCase();

        String longestWord = "";

        if (word1.length() > longestWord.length() && word1.contains("a")) {
            longestWord = word1;
            if (word1.length() == word2.length() && word2.contains("a") || word1.length() == word3.length() && word3.contains("a")) {
                longestWord = "";
            }
        }
        if (word2.length() > longestWord.length() && word2.contains("a")) {
            longestWord = word2;
            if (word2.length() == word3.length() && word3.contains("a") || word2.length() == word1.length() && word1.contains("a")) {
                longestWord = "";
            }
        }
        if (word3.length() > longestWord.length() && word3.contains("a")) {
            longestWord = word3;
            if (word3.length() == word1.length() && word1.contains("a") || word3.length() == word2.length() && word2.contains("a") || word2.length() == word1.length()) {
                longestWord = "";
            }
        }
        System.out.println(longestWord.isEmpty() ? "No single largest word with \"a\"" : longestWord + " is the longest word with a");
    }
}
