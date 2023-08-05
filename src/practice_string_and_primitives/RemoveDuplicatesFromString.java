package practice_string_and_primitives;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String a = "AAABBBCCCCD";
        System.out.println(removeDuplicates(a));
        System.out.println(removeDuplicatesWithTree(a));
    }

    public static String removeDuplicates(String str) {

        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (!res.contains(str.charAt(i) + "")) {
                res += str.charAt(i) + "";
            }
        }
     return res;
    }

    public static Set<String> removeDuplicatesWithTree(String str){
        Set<String> res = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            res.add(str.charAt(i)+"");

        }
        return res;
    }

}

//Input: String a = "AAABBBCCCCD";
//Output: "ABCD"