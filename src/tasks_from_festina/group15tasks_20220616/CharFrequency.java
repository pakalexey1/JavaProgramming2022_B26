package tasks_from_festina.group15tasks_20220616;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(charFrequency(str));
    }

    public static String charFrequency(String str) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (String each : list) {
            if (map.containsKey(each)){
                count = map.get(each)+1;
                map.put(each,count);
            }else{
                map.put(each+"",1);
            }
        }
        String output = "";
        for (String key : map.keySet()){
            output += key + "" + map.get(key);
        }
        return output;
    }
}

/*
1.    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */