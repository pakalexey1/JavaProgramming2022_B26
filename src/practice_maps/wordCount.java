package practice_maps;

import day52_inheritance.hiding.A;

import java.util.*;

public class wordCount {
    public static Map<String, Integer> wordCount (String[] strings){
        Map<String, Integer> outputMap = new HashMap<>();
        ArrayList<String> stringsList = new ArrayList<>(Arrays.asList(strings));
        for (String each : stringsList){
            outputMap.put(each,Collections.frequency(stringsList,each));
        }

        return outputMap;
    }
}

/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.


wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
