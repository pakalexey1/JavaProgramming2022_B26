package practice_collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(Collections.frequency(str,"java"));

        String str1 = "abc";

        for (int i = 0; i < str1.length(); i++) {


        }




    }
}

/*
Target word
Given an ArrayList of Strings and a target word (String) print how many
times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2
 */