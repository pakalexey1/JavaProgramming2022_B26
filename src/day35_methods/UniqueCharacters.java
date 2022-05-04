package day35_methods;

import my_utilities.StringUtil;

public class UniqueCharacters {
    public static String uniqueCharacters(String str){
        String unique = "";
        for (int i = 0; i < str.length(); i++) {

            if (StringUtil.frequencyOfCharacter(str,str.charAt(i))==1){
                unique+=str.charAt(i);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("apple"));
    }
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