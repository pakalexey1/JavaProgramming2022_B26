package practice_maps;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharsSame {
    public static void main(String[] args) {
        String str = "aaavvvsdddas";
        System.out.println(frequencyOfChars(str));
    }
    public static Map<Character, Integer> frequencyOfChars(String str){

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (map.containsKey(str.charAt(i))){
                count=map.get(str.charAt(i))+1;
                map.put(str.charAt(i),count);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        return map;
    }
}


/*
    Write a method that prints the frequency of each character from a String
     */