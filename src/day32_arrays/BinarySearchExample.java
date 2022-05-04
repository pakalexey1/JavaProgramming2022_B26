package day32_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int[] nums = {4, 10, 30, 100};
        System.out.println(Arrays.binarySearch(nums,4));
        System.out.println(Arrays.binarySearch(nums,100));
        System.out.println(Arrays.binarySearch(nums,200)); //-5 because it would have been 5th if it was there
        System.out.println(Arrays.binarySearch(nums,6));
    }
}
