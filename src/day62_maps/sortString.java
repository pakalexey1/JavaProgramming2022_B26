package day62_maps;

import java.util.*;

public class sortString {
    public static void main(String[] args) {
        String str = "1DC501GCCCA098911a";
        System.out.println(sortString(str));
    }

    public static String sortString(String str) {
        String temp = "";
        ArrayList<String> output = new ArrayList<>();

        //Splitting the string into smaller parts, each being a group of digits or letters, and then putting each
        // group as an element into ArrayList<String> output
        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) || Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(i + 1))) {
                temp += str.charAt(i) + "";
            } else {
                temp += str.charAt(i) + "";
                output.add(temp);
                temp = "";
            }
        }

        //The previous piece of code didn't work on the very last character of the String str, so here, depending on how
        // the str is, i.e. last two characters are different or the same, that very last character is being added as
        // the last character of a string if the last part was only one type of characters, or as a separate
        // ArrayList element if the last character is a different type of data comparing to the penultimate character.
        String lastChar = str.charAt(str.length() - 1) + "";
        if (!temp.isEmpty()) {
            if ((Character.isDigit(temp.charAt(0)) && Character.isDigit(str.charAt(str.length() - 1))) || (Character.isLetter(temp.charAt(0)) && Character.isLetter(str.charAt(str.length() - 1)))) {
                temp += lastChar;
                output.add(temp);
            } else {
                output.add(lastChar);
            }
        } else {
            output.add(lastChar);
        }

        //Below is sorting of each element of the ArrayList <String> output into an ArrayList<String> finalOutput
        // with each element sorted
        ArrayList<String> finalOutput = new ArrayList<>();
        for (int i = 0; i < output.size(); i++) {
            String[] arrToSort = (output.get(i).split(""));
            Arrays.sort(arrToSort);
            String tempStr = "";
            for (int j = 0; j < arrToSort.length; j++) {
                tempStr += arrToSort[j];
            }
            finalOutput.add(tempStr);
        }

        //Below is converting the ArrayList <String> finalOutput into a String to produce the method's output in a
        // String format
        String outputStr = "";
        for (String each : finalOutput) {
            outputStr += each + "";
        }

        return outputStr;
    }

}

/*
Create a method that will take any String of letters and numbers and sort
each substring of numbers and letters
Ex:
Input:"DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
 */
