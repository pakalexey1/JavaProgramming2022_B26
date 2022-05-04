package day29_arrays;

import java.util.Arrays;

public class ReplitExpandArray {
    public static void main(String[] args) {

        int[] nums = {4,5,6};
        int[] expandedNums = new int [6];

        for (int i = 0; i < 3; i++) {
            expandedNums[i]=nums[i];
        }
        System.out.println(Arrays.toString(expandedNums));

    }
}
