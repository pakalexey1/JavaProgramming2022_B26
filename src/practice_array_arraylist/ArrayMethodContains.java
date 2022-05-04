package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMethodContains {

    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6};
        System.out.println(containsNum(arr,2,3));
    }

    public static boolean containsNum(Integer [] nums, int num1, int num2){

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(nums));

        return arrList.contains(num1)||arrList.contains(num2);
    }
}

/*
Write a method that accepts an array and prints true if it contains 2 or 3
int[] x = {2,5,4,6,8,9} true
int[] y = {4,3,0,100,55} true
int[] z = {4,5,1,5,6} false
 */

