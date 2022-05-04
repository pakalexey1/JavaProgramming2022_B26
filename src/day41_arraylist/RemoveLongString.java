package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        System.out.println(removeLongString(str,4));
    }

    public static ArrayList <String> removeLongString (ArrayList<String> list, int maxLength){

        list.removeIf(word -> word.length() < maxLength);
        return list;
    }
}

/*

Remove Long Strings
Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have more characters than the given number. Return the modified ArrayList of Strings
@param list - Given ArrayList of Strings
@param int - max number of characters
@return - ArrayList of Strings
Ex: {“one,”, “two”, “three, “four”, “five”, “six”}
Max number: 4
Output: {“three, “four”, “five”}

 */