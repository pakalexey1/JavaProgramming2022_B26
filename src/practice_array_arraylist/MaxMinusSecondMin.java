package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinusSecondMin {

    public static void main(String[] args) {
        Integer a [] = {2,5,7,15,1,6};
        System.out.println(maxMinusSecondMin(a));
    }
    public static int maxMinusSecondMin(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        Collections.sort(list);

        return list.get(list.size() - 1) - list.get(1);
    }
}

/*
4.
 Use Collection
 int a [] = {2,5,7,15,1,6};
     output
   13   < Max number (15) minus second min (2) num and result is 13
 */
