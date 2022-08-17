package practice_maps;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str="AABBDDDC";
        System.out.println(frequencyOfChars(str));

    }

    public static Map<String, Integer> frequencyOfChars(String str) {
        Map<String,Integer> output = new HashMap<>();
        int temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (output.containsKey(str.charAt(i)+"")){
                temp = output.get(str.charAt(i)+"");
                output.put(str.charAt(i)+"",temp+1);
            }else{

                output.put(str.charAt(i)+"",1);

            }
        }
        return output;
    }
}
/*
//27 frequency
  String str="AABBDDDC";
        Map<Character, Integer> map = new LinkedHashMap<>();
        output
{A=2, B=2, D=3, C=1}
 */