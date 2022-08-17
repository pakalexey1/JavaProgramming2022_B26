package practice_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str="AABBDDDCAC";
        System.out.println(frequencyOfCharacters(str));
    }
    public static Map<String, Integer> frequencyOfCharacters(String str){

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
                map.put(str.charAt(i)+"",count);
            }
        }
        return map;
    }
}


/*
//27 frequency
  String str="AABBDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();
        output
{A=2, B=2, D=3, C=1}
 */