package day32_arrays;

import java.util.Arrays;
import java.util.Enumeration;

public class AverageForLoop {
    public static void main(String[] args) {

        int[][] multiArr = new int[2][];
        int[] arr1 = {1, 2, 3};
        multiArr[0] = arr1;
        multiArr[1] = new int[]{10, 563, 98};
        int sum = 0;
        double totalSum = 0;
        int totalLength = 0;

        for (int i = 0; i < multiArr.length; i++) {

            sum = 0;
            for (int j = 0; j < multiArr[i].length; j++) {
                sum += multiArr[i][j];
            }
            System.out.println(Arrays.toString(multiArr[i]) + " the average is " + (double) sum / (multiArr[i].length));
            totalSum += sum;
            totalLength += multiArr[i].length;
        }
        System.out.println("The average of all inner arrays is: " + totalSum / totalLength);

    }
}
