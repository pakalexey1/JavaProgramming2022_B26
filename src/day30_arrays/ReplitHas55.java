package day30_arrays;

import java.util.Arrays;

public class ReplitHas55 {
    public static void main(String[] args) {

        int[] nums = {1,  7, 1, 1};
        boolean is55 = false;
        String message = "";
        int count = 0;
        if (Arrays.toString(nums).contains("5")) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] == 5 && nums[i] == 5) {
                    is55 = true;
                } else if (nums[i - 1] == 5) {
                    count++;
                    message = "The 5s are not next to each other";
                }
            }
        }
        if (is55){
            System.out.println(is55);
        }else{
            System.out.println(is55);
        }


    }
}
