package practice_array_arraylist;

import java.util.Arrays;

public class SortPartsOfString {
    public static void main(String[] args) {
        String str="DC501GCCCA098911A";
        System.out.println(sortPartsOfString(str));
    }
    public static String sortPartsOfString(String str){

        String temp = "";
        String output = "";

        for (int i = 0; i < str.length()-1; i++) {
            char character = str.charAt(i);
            char nextCharacter = str.charAt(i+1);
            if (Character.isDigit(character) && Character.isDigit(nextCharacter) || !Character.isDigit(character) && !Character.isDigit(nextCharacter)){
                temp+=character;
            }else {
                temp+=character;
                String [] elements = temp.split("");
                Arrays.sort(elements);
                for (int j = 0; j < elements.length; j++) {
                    output+=elements[j];
                }
                temp = "";
            }
        }
        char character = str.charAt(str.length()-2);
        char nextCharacter = str.charAt(str.length()-1);
       if (!temp.isEmpty() && Character.isDigit(character) && Character.isDigit(nextCharacter) || !Character.isDigit(character) && !Character.isDigit(nextCharacter)){
           temp+=character;
            String [] elements = temp.split("");
            Arrays.sort(elements);
            for (int j = 0; j < elements.length; j++) {
                output+=elements[j];
            }
        }else{
           output+=nextCharacter;
       }

        return output;
    }
}

/*
9
String str="DC501GCCCA098911";

output
CD015ACCCG011899
 */