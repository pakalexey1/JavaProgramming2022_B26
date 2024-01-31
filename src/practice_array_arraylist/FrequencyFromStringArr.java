package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.*;

public class FrequencyFromStringArr {

    public static void main(String[] args) {
        String str = "AABCCDDEE";
        System.out.println(frequencyOfChars(str));
        System.out.println(charsFrequency(str));
        System.out.println(charFrequency(str));
        System.out.println(frequencyOfCharsTwo(str));
        System.out.println(charFreq(str));
        System.out.println("last"+freqOfChars(str));
        System.out.println("freqOfCharsMap(str) = " + freqOfCharsMap(str));
        System.out.println("frequencyOfCharsAgain(str) = " + frequencyOfCharsAgain(str));
        System.out.println("frequencyOfCharsMapAgain(str) = " + frequencyOfCharsMapAgain(str));
        System.out.println("countChars(str) = " + countChars(str));
        System.out.println("countCharsStr(str) = " + countCharsStr(str));
        System.out.println(countCharsMap2(str));
    }

    public static String frequencyOfChars(String str){

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(str.split("")));


        String output = "";
        for (String each: arrList){
            if (output.contains(each)){
                continue;
            }
            int count = Collections.frequency(arrList,each);
            output+=each+count;
        }

        return output;
    }

    public static String charsFrequency(String str){

        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
     String output="";
     for (String eachChar : strList){
         if (output.contains(eachChar)){
             continue;
         }
         int count = Collections.frequency(strList,eachChar);
         output+=eachChar+count;
     }

        return output;
    }

    public static String charFrequency(String str){

        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        String output = "";

        for (String eachChar : strList){
            if (output.contains(eachChar)){
                continue;
            }
            int frequency = Collections.frequency(strList,eachChar);
            output+=eachChar+frequency;
        }

        return output;
    }

    public static String frequencyOfCharsTwo(String str){

        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        String output = "";

        for (String each : strList){
            if (output.contains(each)){
                continue;
            }
            output+=each + Collections.frequency(strList,each);
        }

        return output;
    }

    public static String charFreq (String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        String output = "";
        for (String each : strList){
            if (!output.contains(each)){
                output += each + Collections.frequency(strList,each);
            }
        }

        return output;
    }

    public static String freqOfChars(String str){

        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        String output = "";

        for (String eachChar : strList){
            if (!output.contains(eachChar)){

                output+= eachChar + Collections.frequency(strList,eachChar);
            }
        }

        return output;
    }

    public static Map<String,Integer> freqOfCharsMap(String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String, Integer> output = new HashMap<>();

        for (String eachStr : strList){
            if (!output.containsKey(eachStr)){

                output.put(eachStr,Collections.frequency(strList,eachStr));
            }
        }

        return output;
    }

    public static String frequencyOfCharsAgain (String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        String output = "";
        for (String eachChar : strList){
            if (!output.contains(eachChar)){
                output+=eachChar+Collections.frequency(strList,eachChar);
            }
        }

        return output;
    }

    public static Map<String, Integer> frequencyOfCharsMapAgain(String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String, Integer> outputMap = new HashMap<>();

        for (String eachChar : strList){
            if (!outputMap.containsKey(eachChar)){
                outputMap.put(eachChar,Collections.frequency(strList,eachChar));
            }
        }

        return outputMap;
    }

    public static Map<String, Integer> countChars(String str){
        Map<String, Integer> output = new HashMap<>();
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));

        for (String eachChar : strList){
            if (!output.containsKey(eachChar)){
                output.put(eachChar,Collections.frequency(strList,eachChar));
            }
        }

        return output;
    }

    public static String countCharsStr (String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        String output = "";
    for (String eachChar : strList){
        if (!output.contains(eachChar)){
            output+=eachChar+Collections.frequency(strList,eachChar);
        }
    }
    return output;
    }

    public static Map<String,Integer> countCharsMap2(String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
        Map<String,Integer> output = new HashMap<>();

        for (String eachChar : strList){
            if (!output.containsKey(eachChar)){
                output.put(eachChar,Collections.frequency(strList,eachChar));
            }
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
