package my_utilities;

import java.util.Arrays;

public class StringUtil {


    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
     /*
    reverse
    create a method that will accept a String and return the reverse version
     */


    public static String fixFormat(String str) {
        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /*
    Fix Format

    create a method that will accept a String and return a String in proper format. Proper format is:
    First char starting as uppercase and the rest as lowercase

    ex:
        input:
             jamES

        output:
             James
     */
    public static int frequencyOfCharacter(String str, char letter) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
/*
frequency of Character

create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
 */



        public static String uniqueCharacters(String str) {
            String unique = "";
            for (int i = 0; i < str.length(); i++) {

                if (StringUtil.frequencyOfCharacter(str, str.charAt(i)) == 1) {
                    unique += str.charAt(i);
                }
            }
            return unique;
        }
/*
Unique Characters

create a method that will accept a word (String) and return a STring with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work.

ex:
    input:
        aaaabcccdeeff

    output:
        bd
 */

    public static int minNumber (int [] nums){

        int min = nums [0];

        for (int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;

    }



}