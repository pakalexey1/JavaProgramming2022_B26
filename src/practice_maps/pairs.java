package practice_maps;

import java.util.HashMap;
import java.util.Map;

public class pairs {
    public static Map<String, String> pairs (String [] strings){
        Map<String,String> outputMap = new HashMap<>();
        for (String each : strings){
            outputMap.put(each.charAt(0)+"",each.charAt(each.length()-1)+"");
        }

        return outputMap;
    }
}
/*

Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */
