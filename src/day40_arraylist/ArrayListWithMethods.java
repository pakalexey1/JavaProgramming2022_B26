package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {

    public static void main(String[] args) {
        System.out.println(getDaysOfWeek());

        ArrayList<String> days = getDaysOfWeek();


        System.out.println(days.get(0));

        System.out.println(printList(getDaysOfWeek()));
        System.out.println(printList(new ArrayList<>(Arrays.asList("a", "b", "cd"))));

    }

    public static String printList (ArrayList<String> list){

        String str = "LIST: ";
        for (String eachElement : list){
            str += "\n~\t" + eachElement;
        }

        return str;

    }

    public static ArrayList<String> getDaysOfWeek() {
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        ));
        return days;
    }
}

/*

String a ="abc"
a.toUpperCase().replace("a","d"

 */