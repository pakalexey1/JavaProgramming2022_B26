package practice_array_arraylist;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

//    public static String longestPrefix(String[] str) {
//        String output = "";
//        int count = 0;
//        for (int i = 0; i < str.length-1; i++) {
//            for (int j = 1; j < str[i].length()-2; j++) {
//                if (str[i].charAt(i) == str[i + 1].charAt(i)) {
//                    count++;
//                }
//            }
//            if (count==str.length){
//                output+=str[i].charAt(i);
//                count=0;
//            }
//        }
//        return output;
//    }
}
//
/*
Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

 */