package day28_arrays;

import org.w3c.dom.ls.LSOutput;

public class ReplitMaxNumber {
    public static void main(String[] args) {
        int [] nums = {2, 4, 2, 3, -2};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
