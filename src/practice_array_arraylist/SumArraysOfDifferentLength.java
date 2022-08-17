package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumArraysOfDifferentLength {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};// length 3
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8));// length 5
        System.out.println(Arrays.toString(sumArraysOfDifferentLength(a,list)));
    }

    public static int[] sumArraysOfDifferentLength(int[] a, List<Integer> list) {


        if (a.length > list.size()) {
            int[] result = a;
            for (int i = 0; i < list.size(); i++) {
                result[i] = result[i] + list.get(i);
            }

            return result;
        } else {
            int[] result = new int[list.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
            }
            for (int i = 0; i < a.length; i++) {
                result[i] = a[i] + result[i];
            }

            return result;
        }
    }
}


 /*
     //73
 //Create 1 array int[] and 1 ArrayList and store result into them and get this result
//Calculate each number of array: Ex 1+4,2+5,6+3
//input
//int a[]={1,2,3};// length 3
//int b[]={4,5,6,7,8};// length 5
//
//outputint a[]={1,2,3};// length 3
////int b[]={4,5,6,7,8};// length 5
//[5, 7, 9, 7, 8]
     */