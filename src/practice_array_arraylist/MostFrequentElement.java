package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class MostFrequentElement {
    public static void main(String[] args) {
        ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
                ,"armud","armud","armud","armud","pear","apple","pear","pear","pear","pear"));

        System.out.println(mostFrequentElement(fruits));
    }

    public static String mostFrequentElement(ArrayList<String> list) {
        String mostFrequent = "";
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            if (count>max){
                mostFrequent = list.get(i);
                max=count;
            }
        }
        return mostFrequent;
    }
}
/*
Find out most repetitive word
ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
,"armud","armud","armud","armud","pear","apple","pear","pear"));
 */