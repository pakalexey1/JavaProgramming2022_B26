package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    public static int minNumberSort (int [] nums){
        Arrays.sort(nums);
        return nums [0];
    }
    /*
    find the minimum number in an array
     */

    public static int maxNumber (int [] nums){
        int max = nums[0];
        for(int num:nums){
            if (num>max){
                max = num;
            }
        }
        return  max;
    }
/*
find max number in an array
 */

    public static boolean doesContain(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
/*
Contains

create a method that will accept and int array and an int number.
Check and return if the number is part of the array.
 */
}

