package day62_maps;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Map<String, Integer> counter = new HashMap<>();
        String str = "asfkasaasdf";

        for (int i = 0; i < str.length(); i++) {

            String key = str.charAt(i)+"";

            if (counter.containsKey(key)){
                int valueOfElement = counter.get(key);
                valueOfElement++;
                counter.put(key,valueOfElement);
            }else{
                counter.put(key,1);
            }
        }
        System.out.println(counter);
    }
}

/*
    given a String count how many times each character is in the string
     */
