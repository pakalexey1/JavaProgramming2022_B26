package practice_string_and_primitives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueCharactersFromString {
    public static void main(String[] args) {

        String h = "AABCCD";
        System.out.println(uniqueCharactersFromString(h));
    }

    public static String uniqueCharactersFromString(String str){

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        list.removeIf(each-> Collections.frequency(list,each)>1);

        return String.valueOf(list).replace("[","").replace("]","");
    }
}
/*
//50 Remove from same string assign same string
String h="AABCC";
Remove
SECOND WAY --write a program that can return the unique characters from a string
Ex:  "AABCC" ==> "B"
 */