package tasks_from_festina.group15tasks_2022may19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationOfThreeCharacters {
    public static void main(String[] args) {
        Character []arr = {'a','b','c'};
        System.out.println(permutationOfThreeCharacters(arr));
    }

    public static String permutationOfThreeCharacters(Character[] charArray) {

        int useForNumbOfCombs = 1;
        for (int i = 1; i <= charArray.length; i++) {
            useForNumbOfCombs *= i;
        }

        ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Character> arrList = new ArrayList<>(Arrays.asList(charArray));

        String originalString = "";
        String arrListString = "";

        for (int i = 0; i < useForNumbOfCombs; ) {
            Collections.shuffle(arrList);
            arrListString = "";
            for (int j = 0; j < arrList.size(); j++) {
                arrListString += "" + arrList.get(j);
            }
//            for (Integer each : original) {
//                originalString += each;
//            }
            if (!originalString.contains(arrListString)) {
                originalString += arrListString + " \n";
                i++;
            }
        }

        return originalString;
    }
}


/*
14) Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters
 */