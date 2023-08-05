package practice_array_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayWithoutSort {
    public static void main(String[] args) {
        int[] arr = {11, 24, 31, 4, 5};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }
}
