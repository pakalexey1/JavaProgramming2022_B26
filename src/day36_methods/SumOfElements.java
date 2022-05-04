package day36_methods;

import java.sql.SQLOutput;

public class SumOfElements {

    public static void main(String[] args) {
        int[] arr = {12,3,23,23,123};
        System.out.println(sum(arr));

        System.out.println(sum(4,6,2,6,12,4));
    }

    public static int sum (int ... nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return sum;
    }

//        public static int sum (int [] nums){
//            int sum = 0;
//            for (int i = 0; i < nums.length; i++) {
//                sum+=nums[i];
//            }
//            return sum;
//        }
}
