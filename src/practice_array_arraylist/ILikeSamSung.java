package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ILikeSamSung {
    public static void main(String[] args) {
        String[] dictionary =  { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go", "mango"};
        String input = "dfszilsdgfklhhsdgf";
        System.out.println(isPartOfDictionary(dictionary,input));
    }

    public static boolean isPartOfDictionary(String[]dictionary, String input){
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String temp = input.substring(i, j+1);
                if(Arrays.asList(dictionary).contains(temp) ){
                    if(!words.contains(temp)) {
                        words.add(temp);
                    }
                }
            }
        }

        return (words.size() > 0);


    }
}


    /*
    Word Break Problem
    Given an input string and a dictionary of words, find out if the input string can be segmented
    into a space-separated sequence of dictionary words. See following examples for more details.
    This is a famous Google interview question, also being asked by many other companies now a days.
    Consider the following dictionary
        { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
        Input:  ilikeice
        Output: Yes
        The string can be segmented as "i like".
        Input:  ilikesamsung
        Output: Yes
        The string can be segmented as "i like samsung" or "i like sam sung".
     */