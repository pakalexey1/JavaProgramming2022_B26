package day32_arrays;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {

        int [][] multiArr = new int[2][];
        int[] arr1 = {1, 2, 3};
        multiArr[0] = arr1;
        multiArr[1]= new int[] {10,563,98};
        int sum = 0;
        int totalLength=0;
        double totalSum = 0;

        for (int[] innerArray : multiArr) {
            sum = 0;
            for (int eachNum : innerArray) {
                sum+=eachNum;
            }
            System.out.println(Arrays.toString(innerArray) + " the average is " + (double)sum/(innerArray.length));
            totalSum+=sum;
            totalLength+= innerArray.length;
        }
        System.out.println("The average of all inner arrays is: " + totalSum/totalLength);

    }
}
