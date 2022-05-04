package interview_tasks;

import java.util.Arrays;
public class ArraySumOfTwoElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwo(new int[]{1, 2, 3, 5}, 4)));
    }

    public static int[] sumOfTwo(int[] arr, int targetNum) {
        int[] output = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                if (arr[i] + arr[j] == targetNum) {
                    output[0] = arr[i];
                    output[1] = arr[j];
                }
            }
        }

        return output;
    }
}

/*
16. Sum of two. Write a method that accepts int[] array and an int number, find 2 elements in the array that sum is equal to the given int. Assume that an input array will have only one pair of numbers that sum equal to our given number. It will always have this pair. See input and output examples. I use the Brute Force algorithm.

  // sum({1, 2, 3, 5}, 4)     -> {1, 3}
  // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}
  // sum({13, 43, 2, 71}, 84) -> {13, 71}
 */
