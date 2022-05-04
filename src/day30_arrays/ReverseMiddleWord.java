package day30_arrays;

import java.util.Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {

        String str = "Java always fun";
        String [] eachWord = str.split(" ");
        String reverseMiddle = "";
        System.out.println(Arrays.toString(eachWord));



        for (int i = 0; i <eachWord[1].length(); i++) {
            reverseMiddle += eachWord[1].charAt(eachWord[1].length()-1-i);
        }
        System.out.println(eachWord[0]+" "+reverseMiddle+" "+eachWord[2]);

    }
}
