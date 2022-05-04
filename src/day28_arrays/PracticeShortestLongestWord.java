package day28_arrays;

public class PracticeShortestLongestWord {
    public static void main(String[] args) {

        String [] str = {"abc", "abcd", "abcde"};
        String longest = "";
        String shortest = "";

        for (int i = 0; i < 3; i++) {
            if (str[i].length()>longest.length()){
                longest=str[i];
            }
        }
        System.out.println(longest);
        shortest=longest;
        for (int i = 0; i < 3; i++) {
            if (str[i].length()<longest.length()){
                longest=str[i];
            }
        }
        System.out.println(longest);
    }
}

/*
Shortest and Longest words from String array
• Write a program that can return the shortest string element from a
String array
• Write a program that can return the longest string element from a
String array
 */