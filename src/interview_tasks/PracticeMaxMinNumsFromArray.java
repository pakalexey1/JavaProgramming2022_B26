package interview_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PracticeMaxMinNumsFromArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,34};
        System.out.println(maxNumFromArray(arr));
        System.out.println(minNumFromArray(arr));
    }

    public static int maxNumFromArray (int [] list){
        Arrays.sort(list);

        return list[list.length-1];
    }

    public static int minNumFromArray (int [] list){
        Arrays.sort(list);

        return list[0];
    }
}

/*

6. Max/min number from an array.
Write a method that will accept an array of int as an argument and it returns the max/min number from a given array.


 */
