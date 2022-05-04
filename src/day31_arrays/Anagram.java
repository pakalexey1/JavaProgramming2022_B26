package day31_arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        char[] str1Arr  = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        System.out.println(Arrays.toString(str1Arr));
        System.out.println(Arrays.toString(str2Arr));

        if (Arrays.equals(str2Arr,str2Arr)){
            System.out.println("Anagram");

        }else {
            System.out.println("Not anagram");
        }

        

    }
}
