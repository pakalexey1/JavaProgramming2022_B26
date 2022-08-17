package practice_array_arraylist;

import java.util.Arrays;

public class SortWithoutUsingSortMethod {
    public static void main(String[] args) {
        int[] num21 = {1, 2, 4, 0, 0, 5, 0};
        System.out.println(Arrays.toString(sortWithoutUsingSortMethod(num21)));
    }

    public static int[] sortWithoutUsingSortMethod(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}

//68
//        input
//        int[] num21 = {1,2,4,0,0,5,0};
//        output
//                [5, 4, 2, 1, 0, 0, 0]