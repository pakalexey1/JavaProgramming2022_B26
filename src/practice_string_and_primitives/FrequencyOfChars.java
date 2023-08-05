package practice_string_and_primitives;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aabcccddaaaa";
        System.out.println(frequencyOfChars(str));
    }
    public static String frequencyOfChars(String str){

        int count = 0;
        String temp = "";
        String output = "";
        for (int i = 0; i < str.length()-1; i++) {
            if ((str.charAt(i)+"").equals(str.charAt(i+1)+"")){
                temp+=str.charAt(i);
            }else {

                    temp+=str.charAt(i);
                    output += temp.charAt(0) + "" + temp.length();
                    temp = "";

            }
        }
//        if ((str.charAt(i)+"").equals(str.charAt(i+1)+"")){
//            temp+=str.charAt(str.length()-1);
//            output+=temp.charAt(0) + "" + temp.length();
//        }

        return output;
    }
}
/*
        for (int i = 0; i < str.length(); i++) {

            if (res.containsKey(str.charAt(i))){
                count = res.get(str.charAt(i));
                res.put(str.charAt(i),count+1);
            }else {
                res.put(str.charAt(i),1);
            }

        }
 */