package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxElementMinusSecondMin {
    public static void main(String[] args) {
        Integer a[] = {2, 5, 7, 15, 1, 6};
        System.out.println(findMaxMinusSecondMin(a));
    }

    public static int findMaxMinusSecondMin(Integer[] a) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a));
        Arrays.sort(a);
        int result = a[a.length-1] - a[1];
        return result;
    }
}


//4.
//        Use Collection int a [] = {2,5,7,15,1,6};
//        int a [] = {2,5,7,15,1,6};
//        output
//        13   < Max number minus second min num and result is 13