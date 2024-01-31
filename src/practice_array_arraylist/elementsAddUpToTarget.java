package practice_array_arraylist;

import java.util.Arrays;

public class elementsAddUpToTarget {
    public static void main(String[] args) {
        int[] arr = {42, 15, 12, 8, 6, 32};
        int target = 26;
        sumOfElements(arr,target);

    }

    public static void sumOfElements(int[]arr, int input){

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            String output = "";
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                output+=arr[j]+" ";
                if (sum==input){
                    System.out.println(output);
                }
            }
        }
    }
}
