package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class isIsogram {
    public static void main(String[] args) {

        String str = "maechinet";
        System.out.println("isIsogram(str) = " + isIsogram(str));
    }

    public static boolean isIsogram(String str){
        List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));

        for (String eachChar: strList){
            if (Collections.frequency(strList,eachChar)>1){
                return true;
            }
        }
        return false;
    }
}
