package day19_string;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words");
        String word1 = input.next().toLowerCase();
        String word2 = input.next().toLowerCase();
        String word3 = input.next().toLowerCase();

        int oneLen = word1.length();
        int twoLen = word2.length();
        int threeLen= word3.length();

        if (word1.contains("a") && oneLen > twoLen && oneLen > threeLen) {
            System.out.println(word1 + " is the biggest with an a");
        } else if (word2.contains("a") && twoLen > oneLen && twoLen > threeLen) {
            System.out.println(word2 + " is the biggest with an a");
        } else if (word3.contains("a") && threeLen > oneLen && threeLen > twoLen) {
            System.out.println(word3 + " is the biggest with an a");
        } else {
            System.out.println("No single largest word with an a");
        }
    }
}
/*
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
     */