package tasks_from_festina.group15tasks_20220616;

import java.util.ArrayList;
import java.util.Arrays;

public class SortLettersAndNumbers {
    public static void main(String[] args) {
        String str = "DC501GCCCA098911Ф2";
        System.out.println(sortLettersAndNumbers(str));
    }



    public static String sortLettersAndNumbers (String str){

        ArrayList<String> output = new ArrayList<>();
        String res = "";

        for (int i = 0; i < str.length()-1; i++) {

            if ((Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i+1))) || (!Character.isDigit(str.charAt(i)) && !Character.isDigit(str.charAt(i+1)))){
                res += str.charAt(i)+"";
            }else{
                res += str.charAt(i)+"";
                String[]sort = res.split("");
                Arrays.sort(sort);
                String temp ="";
                for (int j = 0; j < sort.length; j++) {
                    temp+=sort[j];
                }
                output.add(temp);
                res="";
            }
        }

        if (!res.isEmpty() && (Character.isDigit(str.charAt(str.length()-1)) && Character.isDigit(str.charAt(str.length()-2))) || !res.isEmpty() && (!Character.isDigit(str.charAt(str.length()-1)) && !Character.isDigit(str.charAt(str.length()-2)))){
            res+=str.charAt(str.length()-1)+"";
            String[]sort = res.split("");
            Arrays.sort(sort);
            String temp ="";
            for (int j = 0; j < sort.length; j++) {
                temp+=sort[j];
            }
            output.add(temp);
        }else {
            res+=str.charAt(str.length()-1)+"";
            String[]sort = res.split("");
            Arrays.sort(sort);
            String temp ="";
            for (int j = 0; j < sort.length; j++) {
                temp+=sort[j];
            }
            output.add(temp);
        }

        String toReturn ="";
        for (int i = 0; i < output.size(); i++) {
            toReturn+=output.get(i);
        }

        return toReturn;
    }

}
/*
6. String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together.
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
 */