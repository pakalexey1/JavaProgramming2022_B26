package day35_methods;

import java.util.Arrays;

public class MinNumberArray {
    public static int minNumber (int [] nums){

        int min = nums [0];

        for (int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;

    }

    public static int minNumberSort (int [] nums){
        Arrays.sort(nums);
        return nums [0];
    }

}
