package tasks_from_festina.group15tasks_20220616;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("ABAABBBCAACC"));
    }

    public static String removeDuplicates (String str){

        String output = "";
        for (int i = 0; i < str.length(); i++) {

            if (!output.contains(str.charAt(i)+"")){
                output+=str.charAt(i)+"";

            }
        }

        return output;
    }
}


/*
3.    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
 */