package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyFromStringArr {

    public static void main(String[] args) {
        String str = "AABCCDDEE";
        System.out.println(frequencyOfChars(str));
    }

    public static String frequencyOfChars(String str){

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(str.split("")));


        String output = "";
        for (String each: arrList){
            int count = Collections.frequency(arrList,each);
            if (output.contains(each)){
                continue;
            }
            output+=each+count;
        }

        return output;

    }
}

/*

Write a program that can find the frequency of character from a String
Do not use nested loop

"AABCCDDEE" => "ABCDE"
output = A2B1C2D2E2

 */
