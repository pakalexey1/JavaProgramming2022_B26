package practice_array_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayMethodContains {

    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5,6};
        int[] arrReg = {1,2,3,4,5,6};
        System.out.println(containsNum(arr,2,3));
        System.out.println(arrayContains(arr, 2, 3));
        System.out.println(arrayContainsTwo(arr, 2, 3));
        System.out.println(arrContainsThree(arrReg, 2, 3));
        System.out.println(arrContainsAnotherAttempt(arrReg,2,3));
        System.out.println(arrContainsOneMore(arrReg, 2, 3));
    }

    public static boolean containsNum(Integer [] nums, int num1, int num2){

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(nums));

        return arrList.contains(num1)||arrList.contains(num2);
    }

    //practice more
    public static boolean arrayContains(Integer[] arr, int a, int b){

        List<Integer> convertedArr = new ArrayList<>(Arrays.asList(arr));

        return convertedArr.contains(a) || convertedArr.contains(b);
    }

    //again
    public static boolean arrayContainsTwo (Integer[] arr, int num1, int num2){

        List<Integer> convertedArr = new ArrayList<>(Arrays.asList(arr));
        return convertedArr.contains(num1) ||convertedArr.contains(num2);
    }
    //one more practice
    public static boolean arrContainsThree(int[]arr, int num1, int num2){

        Integer[] arrWrapper = new Integer[arr.length];
        int i=0;
        for (int value : arr){
            arrWrapper[i++] = Integer.valueOf(value);
        }

        List<Integer> arrList = new ArrayList<>(Arrays.asList(arrWrapper));

        return arrList.contains(num1) || arrList.contains(num2);
    }

    public static boolean arrContainsAnotherAttempt (int[] arr, int num1, int num2){

        Integer[] arrWrap = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {

            arrWrap[i] = Integer.valueOf(arr[i]);
        }

        List<Integer> arrList = new ArrayList<>(Arrays.asList(arrWrap));
        return arrList.contains(num1)||arrList.contains(num2);
    }

    public static boolean arrContainsOneMore(int[] arr, int num1, int num2){

        Integer[] arrWrapper = new Integer[arr.length];
        for (int i = 0; i < arrWrapper.length; i++) {

            arrWrapper[i] = Integer.valueOf(arr[i]);
        }

        List<Integer> arrList = new ArrayList<>(Arrays.asList(arrWrapper));
        return arrList.contains(num1)||arrList.contains(num2);
    }
}

/*
Write a method that accepts an array and prints true if it contains 2 or 3
int[] x = {2,5,4,6,8,9} true
int[] y = {4,3,0,100,55} true
int[] z = {4,5,1,5,6} false
 */

