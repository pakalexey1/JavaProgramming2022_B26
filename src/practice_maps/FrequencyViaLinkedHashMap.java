package practice_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyViaLinkedHashMap {
    public static void main(String[] args) {
        String str = "AABBDDDDC";

        System.out.println(frequencyViaLinkedHashMap(str));
    }

    public static Map<Character, Integer> frequencyViaLinkedHashMap (String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                count = map.get(str.charAt(i))+1;
                map.put(str.charAt(i),count);
            } else {
                map.put(str.charAt(i),1);
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
