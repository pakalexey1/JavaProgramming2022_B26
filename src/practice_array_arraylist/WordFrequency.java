package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma"
                ,"armud","armud","armud","armud","pear","apple","pear","pear"));
        System.out.println(mostFrequentWord(fruits));
    }

    public static String mostFrequentWord(ArrayList<String> list){
        Map<String, Integer> output = new HashMap<>();
        int count = 0;
        for(String each: list){
            if (output.containsKey(each)){
                count = output.get(each)+1;
                output.put(each,count);
            }else{
                output.put(each,1);
            }
        }
        int max = 0;
        String result = "";
        for(String each: output.keySet()){
            if (output.get(each) > max){
                max = output.get(each);
                result=each;
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
