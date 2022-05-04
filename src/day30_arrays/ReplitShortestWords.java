package day30_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitShortestWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        //String str="olive, hot pursuit, warning, python, angle, coffee, beech, boost, trainer";
        String [] str1 = str.split(", ");

        String longestWord = "";
        String shortestWord = "";
        String listOfShortest = "";
        //System.out.println(Arrays.toString(str1));

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].length() > longestWord.length()){
                longestWord=str1[i];
            }
        }
        //System.out.println(longestWord);
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].length()<longestWord.length()){
                longestWord=str1[i];
                shortestWord=str1[i];
            }
        }
       // System.out.println(shortestWord);
        for (int i = 0; i < str1.length; i++) {
            if (str1[i].length()==shortestWord.length()){
                listOfShortest+=str1[i]+" ";
            }
        }
        listOfShortest=listOfShortest.trim();
       // listOfShortest = listOfShortest.substring(0,listOfShortest.length()-1);
       // listOfShortest = "["+listOfShortest+"]";
       // System.out.println(listOfShortest);

        String[] finalList = listOfShortest.split(" ");
        System.out.println(Arrays.toString(finalList));
    }
}

/*
Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
Input: word1, word2, word3, word4, etc...

Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, loops, if statements, primitive datatypes, operators

Example:

Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
 */