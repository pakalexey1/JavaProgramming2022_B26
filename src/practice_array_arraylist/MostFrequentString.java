package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentString {
    public static void main(String[] args) {
        ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
                ,"armud","armud","armud","armud","pear","apple","pear","pear","armud"));
        System.out.println(mostFrequentString(fruits));
    }
    public static String mostFrequentString (ArrayList<String> arr){
        int count = 0;
        int max = 0;
        String result ="";

        Map<String, Integer> fruits = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
               if (fruits.containsKey(arr.get(i))){
                   count = fruits.get(arr.get(i));
                   fruits.put(arr.get(i),count+1);
                   if (count>max){
                       max = count;
                       result = arr.get(i);
                   }
               }else{
                   fruits.put(arr.get(i),1);
               }
        }

        return result;
    }
}
/*
//45
Find out most repetitive word
ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
,"armud","armud","armud","armud","pear","apple","pear","pear"));
 */