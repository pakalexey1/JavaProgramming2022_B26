package day28_arrays;

import java.util.Arrays;

public class PracticeReverseArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        String output = "";
        int[] reverse = new int[5];

        for (int i = 4; i >= 0; i--) {
            reverse[i] = nums[4 - i];
        }
        System.out.println(Arrays.toString(reverse));


        //Another practice attempt with less hard coding:

        int[] nums2 = {1, 2, 3, 4, 5};
        int[] reverseNums2 = new int[nums2.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            reverseNums2[i] = nums2[nums2.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverseNums2));

        //another practice attempt with double loop
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] reverseNums3 = new int[nums2.length];

        for (int i = nums3.length - 1, j = 0; i >= 0; i--, j++) {
            reverseNums3[j] = nums3[i];
        }
        System.out.println(Arrays.toString(reverseNums3));

    }
}

/*
Reverse Array
Write a program that will reverse the order of any given array
Ex:
Input:
[1, 2, 3, 4, 5]
Output:
[5, 4, 3, 2, 1]
 */