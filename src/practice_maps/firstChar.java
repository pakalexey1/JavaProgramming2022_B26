package practice_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class firstChar {
    public static void main(String[] args) {
        String [] str = {"salt", "tea", "soda", "toast"};
        System.out.println(firstChar(str));
    }
    public static Map<String,String> firstChar (String[]strings){
        Map<String,String> outputMap = new HashMap<>();
        String values = "";
        for (int i = 0; i < strings.length; i++) {
            values ="";
            for (int j = i; j < strings.length; j++) {
                if (strings[i].charAt(0)==strings[j].charAt(0)){
                    values+=strings[j];
                }
            }
            if (!outputMap.containsKey(strings[i].charAt(0)+"")) {
                outputMap.put(strings[i].charAt(0) + "", values);
            }
        }

        return outputMap;
    }
}
/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
 */