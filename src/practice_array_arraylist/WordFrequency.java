package practice_array_arraylist;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma"
                ,"armud","armud","armud","armud","pear","apple","pear","pear"));
        System.out.println(mostFrequentWord(fruits));
        System.out.println("mostFrequentWord(fruits) = " + mostFrequentWord(fruits));
        System.out.println("mostFreqWord(fruits) = " + mostFreqWord(fruits));
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

    public static String mostFrequentWord(List<String> strList) {

        Map<String, Integer> wordMap = new HashMap<>();
        int count = 0;
        for (String eachWord : strList) {
            if (wordMap.containsKey(eachWord)) {
                count = wordMap.get(eachWord) + 1;
                wordMap.put(eachWord, count);
            } else {
                wordMap.put(eachWord, 1);
            }
        }
        int max = 0;
        String output = "";
        for (String each : wordMap.keySet()) {
            if (wordMap.get(each) > max) {
                max = wordMap.get(each);
                output = each;
            }
        }
        return output;
    }

    public static String mostFreqWord(List<String> words){
        Map<String, Integer> wordFreq = new HashMap<>();
        int count = 0;
        for (String each : words){
            if (wordFreq.containsKey(each)){
                count=wordFreq.get(each)+1;
                wordFreq.put(each,count);
            }else{
                wordFreq.put(each,1);
            }
        }

        int max = 0;
        String mostFreqWord = "";
        for (String eachWord: wordFreq.keySet()){
            if (wordFreq.get(eachWord)>max){
                max= wordFreq.get(eachWord);
                mostFreqWord=eachWord;
            }
        }

        return mostFreqWord;
    }
}

/*
//45
Find out most repetitive word
ArrayList<String >fruits=new ArrayList<>(Arrays.asList("alma","alma","alma","alma"
,"armud","armud","armud","armud","pear","apple","pear","pear"));

 */
