package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class  FrequencyOfStrings {
    public static void main(String[] args) {
        String[] testArray = {"Apple", "Banana", "Apple", "Cherry", "Cherry", "Cherry"};
        List<String> testList = new ArrayList<>(Arrays.asList(testArray));
        frequencyOfStrings(testArray);
        System.out.println(frequencyOfWords(testArray));
        System.out.println(frequencyOfWordsList(testList));
        System.out.println("using frequency:\n"+freqOfWords(testList));

    }

    public static void frequencyOfStrings(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (!result.contains(arr[i])) {
                result += arr[i] + " = " + count + "\n";
            }

        }
        System.out.println(result);
    }

    public static String frequencyOfWords(String[] arr){

        String output = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            if (!output.contains(arr[i])){
                output+=arr[i] + " = " + count + "\n";
            }
        }

        return output;
    }

    public static String frequencyOfWordsList(List<String> phrase){

        String output = "";
        for (int i = 0; i < phrase.size(); i++) {
            int count = 0;
            for (int j = 0; j < phrase.size(); j++) {
                if (phrase.get(i)==phrase.get(j)){
                    count++;
                }
            }
            if (!output.contains(phrase.get(i))){
                output+=phrase.get(i) + " = " + count + "\n";
            }
        }

        return output;
    }

    public static String freqOfWords(List<String> phrase){
        String output ="";
        for (int i = 0; i < phrase.size(); i++) {
            int count = 0;
            for (int j = i; j < phrase.size(); j++) {
                if (phrase.get(i)==phrase.get(j)){
                    count++;
                }
            }
            if (!output.contains(phrase.get(i))){
                output+=phrase.get(i) + " = " + Collections.frequency(phrase,phrase.get(i))+"\n";
            }
        }

        return output;
    }
}
    /*
        Given the array return the output
                    String[] testArray = {"Apple","Banana","Apple","Cherry"};
                    Output Example
                    Apple = 2
                    Banana = 1
                    Cherry = 1
         */
