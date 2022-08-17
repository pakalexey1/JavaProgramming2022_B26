package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task75ImpossibleToUnderstand {
    public static void main(String[] args) {
        ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five", "seven"));
        System.out.println(printNumber(gg));
    }
    public static String printNumber(ArrayList<String> list) {

        String res = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(",")) {
                res += list.get(i).substring(list.get(i).indexOf(",") + 1) + " ";
            } else {
                res += list.get(i) + " ";
            }
        }

        return res;
    }
}
/*
//75
 ArrayList<String> gg = new ArrayList<>(Arrays.asList("three,four", "five","seven"));
print out
 four five seven
 */