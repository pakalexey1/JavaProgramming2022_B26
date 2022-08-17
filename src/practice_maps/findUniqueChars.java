package practice_maps;

import java.util.HashMap;
import java.util.Map;

public class findUniqueChars {
    public static void main(String[] args) {
        String str = "ababaccdf";
        System.out.println(findUniqueChars(str));
    }

    public static Map<String, Integer> findUniqueChars(String str) {

        Map<String, Integer> output = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            if (count==1){
                output.put(str.charAt(i)+"",count);
            }
        }

        return output;
    }
}
