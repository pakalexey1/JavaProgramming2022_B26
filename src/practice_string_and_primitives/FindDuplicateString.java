package practice_string_and_primitives;

import day52_inheritance.hiding.A;

import java.util.*;

public class FindDuplicateString {
    public static void main(String[] args) {
        String str = "java i love java reading books about java i";
        System.out.println(findDuplicateString(str));
        System.out.println("findDuplicatedWords(str) = \n" + findDuplicatedWords(str));
        System.out.println("strFrequency(str) = \n" + strFrequency(str));
        findDuplicates(str);
        System.out.println("findDuplicates2(str) = " + findDuplicates2(str));
        System.out.println("findDuplicates3(str) = " + findDuplicates3(str));
    }

    public static String findDuplicateString (String a){
        if (a.length()>2 && a.trim().contains(" ")) { // make sure not an empty string && it has at least two words
            String[] arrayA = a.split(" ");
            String result = "";

            for (int i = 0; i < arrayA.length; i++) {
                int count = 0;
                for (int j = i; j < arrayA.length; j++) {
                    if (arrayA[i].equals(arrayA[j])) {
                        count++;
                    }
                }
                if (count > 1 && !result.contains(arrayA[i])) {
                    result += arrayA[i] + ", ";
                }
//                count = 0;
            }

            return result.substring(0, result.length() - 2);
        }
        return "String must be at least 2 characters long and contain at least two words";
    }

    public static String findDuplicatedWords(String phrase){
        List<String> phraseList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        String output="";
        for (int i = 0; i < phraseList.size(); i++) {
            int count = 0;
            for (int j = i; j < phraseList.size(); j++) {
                if (phraseList.get(i).equals(phraseList.get(j))){
                    count++;
                }
            }
            if (!output.contains(phraseList.get(i)) && count>1){
                output+= phraseList.get(i) + count+"\n";
            }
        }

        return output;
    }

    public static String strFrequency(String str){

        List<String> strList = new ArrayList<>(Arrays.asList(str.split(" ")));
        String output="";
        for (int i = 0; i < strList.size(); i++) {
//            int count = 0;
//            for (int j = i; j < strList.size(); j++) {
//                if (strList.get(i).equals(strList.get(j))){
////                    count++;
//                }
//            }
            if (Collections.frequency(strList,strList.get(i))>1 && !output.contains(strList.get(i))){
                output+=strList.get(i) + Collections.frequency(strList,strList.get(i)) + "\n";
            }
        }

        return output;
    }

    public static void findDuplicates(String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split(" ")));
        Map<String,Integer> output = new HashMap<>();
        for (String eachStr : strList){
            if (!output.containsKey(eachStr) && Collections.frequency(strList,eachStr)>1){
                output.put(eachStr,Collections.frequency(strList,eachStr));
            }
        }
        System.out.println(output);
    }

    public static Map<String, Integer> findDuplicates2(String str){
        List<String> listStr = new ArrayList<>(Arrays.asList(str.split(" ")));
        Map<String, Integer> output = new HashMap<>();

        for (String eachWord: listStr){
            if (!output.containsKey(eachWord) && Collections.frequency(listStr, eachWord)>1){
                output.put(eachWord,Collections.frequency(listStr,eachWord));
            }
        }

        return output;
    }

    public static Map<String, Integer> findDuplicates3 (String str){
        List<String> listStr = new ArrayList<>(Arrays.asList(str.split(" ")));
        Map<String, Integer> output = new HashMap<>();

        for (String eachWord:listStr){
            int freq = Collections.frequency(listStr,eachWord);
            if (!output.containsKey(eachWord) && freq>1){
                output.put(eachWord,freq);
            }
        }

        return output;
    }
}


/*
find duplicate words in a String and print them but not more than once.
A string must be at least two words long
 */