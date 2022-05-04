package day18_string;
import java.util.Scanner;
public class LongestWithAVika {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words:");
        String wordOne = input.next().toLowerCase();
        String wordTwo = input.next().toLowerCase();
        String wordThree = input.next().toLowerCase();

        String longestWord = "";

        if (wordOne.contains("a") && wordOne.length() > longestWord.length()) {
            longestWord = wordOne;
            if(wordOne.length() == wordTwo.length() && wordTwo.contains("a") || wordOne.length() == wordThree.length() && wordThree.contains("a") ){
                longestWord = "";
            }
        }

        if (wordTwo.contains("a") && wordTwo.length() > longestWord.length()) {
            longestWord = wordTwo;
            if(wordTwo.length() == wordOne.length() && wordOne.contains("a") || wordTwo.length() == wordThree.length() && wordThree.contains("a") ){
                longestWord = "";
            }
        }

        if (wordThree.contains("a") && wordThree.length() > longestWord.length()) {
            longestWord = wordThree;
            if(wordThree.length() == wordTwo.length() && wordTwo.contains("a") || wordThree.length() == wordOne.length() && wordOne.contains("a") ){
                longestWord = "";
            }
        }

        System.out.println(longestWord.isEmpty() ? "No single largest word with a" : longestWord + " is the longest word with a");

    }
}
