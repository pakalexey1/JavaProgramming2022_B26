package practice_array_arraylist;

import java.util.Arrays;

public class MinMaxFromArray {
    public static void main(String[] args) {
        int[] arr = {12,3,-4,1,65,34};
        minMaxFromArray(arr);
    }

    public static void minMaxFromArray(int[]arr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (min>arr[i]) {
                min = arr[i];
            }
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Min number is " + min + "\nMax number is " + max);
    }

}
