package practice_maps;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharactersSame {
    public static void main(String[] args) {
        String str = "AAABBCDDFA";
        System.out.println(frequencyOfChars(str));
    }

    public static Map<String, Integer> frequencyOfChars (String str){

        Map <String,Integer> map = new HashMap<>();
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {

            if (map.containsKey(str.charAt(i)+"")){
                frequency= map.get(str.charAt(i)+"");
                map.put(str.charAt(i)+"",frequency+1);

            }else{
                frequency = 0;
                map.put(str.charAt(i)+"",1);
            }
        }
        return map;
    }
}
/*
1.    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */