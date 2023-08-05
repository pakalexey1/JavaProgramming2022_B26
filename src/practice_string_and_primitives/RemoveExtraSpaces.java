package practice_string_and_primitives;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "  Hello  world      I      love      Java    ";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        System.out.println(list);
        System.out.println(removeExtraSpaces(str));
    }

    public static String removeExtraSpaces(String str) {
        str = str.trim();
        String output = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).isEmpty()) {
                output += list.get(i)+" ";
            }
        }

        return output;
    }
}
    /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java
     */