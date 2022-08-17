package practice_array_arraylist;

import java.util.Scanner;

public class LongestElement {
    public static void main(String[] args) {

        System.out.println(longestElement());
    }

    public static String longestElement() {
        String[] fiveWords = new String[5];
        Scanner input = new Scanner(System.in);
        String longest = "";
        for (int i = 0; i < fiveWords.length; i++) {
            System.out.println("Enter word #" + (i + 1));
            fiveWords[i] = input.next();
            if (fiveWords[i].length() > longest.length()) {
                longest = fiveWords[i];
            }
        }

        return longest;
    }
}

/*
//54
Ask user enter 5 words and declare long word or Array
String h[]={"hellow", "whyyyyyyyyyy", "byererdddd", "apple" , "notettttt"};
output:
whyyyyyyyyyy
 */
