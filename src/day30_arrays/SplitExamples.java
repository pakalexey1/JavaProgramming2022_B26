package day30_arrays;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {

        String str = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days = str.split(",");
        System.out.println(Arrays.toString(days));

        for (String eachDay : days){
            System.out.println(eachDay);
        }


        String [] withOutDay = str.split("day");

        for(String eachDayWithOutDay : withOutDay){
            System.out.println(eachDayWithOutDay);

            System.out.println("=========================");

            String str1 = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
            String[] months = str1.split("-");
            for(String eachMonth : months){
                System.out.println(eachMonth);
            }

        }
    }
}
